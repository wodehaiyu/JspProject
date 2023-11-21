package cn.li.bean;

public class Author {
	private String userNum, username, mobile, email, address, idCard, bank, bankCard;

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public Author(String userNum, String username, String mobile, String email, String address, String idCard,
			String bank, String bankCard) {
		super();
		this.userNum = userNum;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.idCard = idCard;
		this.bank = bank;
		this.bankCard = bankCard;
	}

	public Author() {
		super();
	}

}
