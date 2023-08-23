package db.day3.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import db.day3.board.vo.MemberVO;

public interface MemberDAO {

	MemberVO selectMember(@Param("me_id")String me_id);

	void insertMember(@Param("member")MemberVO member);

	//매개변수에 @Param 을 붙였을 때 와 아닐떄의 차이를 보여주기위해 insertMember 와 기능이 같은 매서드를 만듬
	void insertMember2(MemberVO member);
		
	void deleteMember(String me_id);

	void updateBoardCount(@Param("me_id")String string);
	
	
	
}
