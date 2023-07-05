package day26.library.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

//대출 열람 ( 도서대출 기록)
@Data
public class LoanBrowsing implements Serializable{
	
	
	public LoanBrowsing(Book book, Date date, int loanPeriod) {
		this.book = book;
		this.loanDate =date;
	
	
	}
/**
	 * 
	 */
	private static final long serialVersionUID = -8999487268447037207L;

	private Book book;
	private Date loanDate;//대출일
	private Date returnDate; //반납일
	
	
	
	public String getLoadDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 DD일");
		return format.format(loanDate);
	}
}
