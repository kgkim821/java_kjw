package db.day3.board.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import db.day3.board.dao.MemberDAO;
import db.day3.board.vo.MemberVO;

public class MemberServiceimp  implements MemberService{

	private MemberDAO memberDao;
	private final String MYBATIS_CONFIG_PATH="db/day3/board/config/mybatis-config.xml";
	
	
	
	public MemberServiceimp() {
		try {
			InputStream is = Resources.getResourceAsStream(MYBATIS_CONFIG_PATH);
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
			//true의 역할 : 쿼리(insert,update,delete) 실행 후 자동 커밋되게 해줌
			SqlSession session = sf.openSession(true);
			memberDao = session.getMapper(MemberDAO.class);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean signup(MemberVO member) {
	
		if(member ==null || member.getMe_id() == null) { //순서가 바뀌면 안됨
			return false;
		}

		// 아이디를 이용하여 회원 정보를 가져옴
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		
		//가져온 회원 정보의 비번 ㅘㄱ입ㄹ력받은 비번이 같은면 삭
		if(dbMember != null&& dbMember.getMe_pw().equals(member.getMe_pw()))
			memberDao.deleteMember(member.getMe_id());
			return true;
		
	}
	
	
}
