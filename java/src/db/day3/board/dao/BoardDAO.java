package db.day3.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import db.day3.board.vo.BoardVO;

public interface BoardDAO {

	int insertBoard(@Param("board")BoardVO board);

	static List<BoardVO> selectBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

}
