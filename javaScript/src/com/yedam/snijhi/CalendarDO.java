package com.yedam.snijhi;

public class CalendarDO {
	private String schedule;
	private String memo;
	private String date;
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "CalendarDO [schedule=" + schedule + ", memo=" + memo + ", date=" + date + "]";
	}
	
	
	
}


