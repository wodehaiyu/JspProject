package cn.li.bean;

public class AuthorCoop {
	private char coopMode, coopType;
	private char coopStatus;
	private String userNum;

	public char getCoopMode() {
		return coopMode;
	}

	public void setCoopMode(char coopMode) {
		this.coopMode = coopMode;
	}

	public char getCoopType() {
		return coopType;
	}

	public void setCoopType(char coopType) {
		this.coopType = coopType;
	}

	public char getCoopStatus() {
		return coopStatus;
	}

	public void setCoopStatus(char coopStatus) {
		this.coopStatus = coopStatus;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public AuthorCoop(char coopMode, char coopType, char coopStatus, String userNum) {
		super();
		this.coopMode = coopMode;
		this.coopType = coopType;
		this.coopStatus = coopStatus;
		this.userNum = userNum;
	}

	public AuthorCoop() {
		super();
	}

}
