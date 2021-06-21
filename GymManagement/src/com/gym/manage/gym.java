package com.gym.manage;

public class gym {
	private int memberId;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String memberPhone;
	private String memberAddress;
	private String memberPack;
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberPack() {
		return memberPack;
	}
	public void setMemberPack(String memberPack) {
		this.memberPack = memberPack;
	}
	
	
	public gym() {
		super();
		// TODO Auto-generated constructor stub
	}
	public gym(String memberName, int memberAge, String memberGender, String memberPhone, String memberAddress,
			String memberPack) {
		super();
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberGender = memberGender;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberPack = memberPack;
	}
	public gym(int memberId, String memberName, int memberAge, String memberGender, String memberPhone,
			String memberAddress, String memberPack) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberGender = memberGender;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberPack = memberPack;
	}
	
	@Override
	public String toString() {
		return "gym [memberId=" + memberId + ", memberName=" + memberName + ", memberAge=" + memberAge
				+ ", memberGender=" + memberGender + ", memberPhone=" + memberPhone + ", memberAddress=" + memberAddress
				+ ", memberPack=" + memberPack + "]";
	}
	
}
