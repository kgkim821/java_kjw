package db.day3.board.service;

import db.day3.board.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO member);

	static boolean withdraw(MemberVO member) {
	
		if(member == null || member.getMe_id()==null) {
			return false;
		}
		return false;
	}


}
