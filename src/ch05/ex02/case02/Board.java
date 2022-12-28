package ch05.ex02.case02;

import java.time.LocalDate;

public class Board {
	private String msg;
	private LocalDate WrittenDate;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public LocalDate getWrittenDate() {
		return WrittenDate;
	}
	
	public void setWrittenDate(LocalDate writtenDate) {
		WrittenDate = writtenDate;
	}			
}

