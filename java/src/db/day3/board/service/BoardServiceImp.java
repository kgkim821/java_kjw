package db.day3.board.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import db.day3.board.dao.BoardDAO;
import db.day3.board.dao.MemberDAO;
import db.day3.board.vo.BoardVO;
import db.day3.board.vo.MemberVO;

public class BoardServiceImp implements BoardService{

	private BoardDAO boardDAO;
	private MemberDAO memberDao;
	private final String MYBATIS_CONFIG_PATH="db/day3/board/config/mybatis-config.xml";
	
	
	
	public BoardServiceImp() {
		try {
			InputStream is = Resources.getResourceAsStream(MYBATIS_CONFIG_PATH);
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
			//true의 역할 : 쿼리(insert,update,delete) 실행 후 자동 커밋되게 해줌
			SqlSession session = sf.openSession(true);
			boardDAO = session.getMapper(BoardDAO.class);
			memberDao = session.getMapper(MemberDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean insertBoard(BoardVO board) {
	if(board == null || board.getBo_me_id()==null || board.getBo_title()==null) {
	
		return false;
	}
		//작성자 확인
		MemberVO member = memberDao.selectMember(board.getBo_me_id());
		//작성자가 없는 아이디이면
		if(member == null) {
			return false;
		}
		if(boardDAO.insertBoard(board) != 0) {
				//게시글이 등록되면 회원이 작성한 게시글 수를 1증가
			memberDao.updateBoardCount(board.getBo_me_id());
			return true;
		}
		return false;
	}
// 게시글 작성자와 아이디가 다르면 종료
	
//	게시글 삭제
	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return BoardDAO.selectBoardList();
	}

	
}
// 게시글 번호를 이용하여 게시글을 가져옴
//BoardVO dbBOARD = boardDao.seelctBoard()