package com.hello.world.dto;


/*
 * 2017-01-20 jihyun.Park
 * 프로젝트 생성을 위해 임의로 넣어놓은 vo클래스 입니다. 우리 DB에 맞게 수정 해야함.
 * vo 클래스 수정 후 com.hello.world.db.sqlmaps에 sqlmap도 필 수정 할것.
 * */
public class AddressVO {
	private String zipNum;  //우편번호
	private String sido;  // 시
	private String gugun; // 구
	private String dong;  // 동
	private String zipCode; //우편코드
	private String bunji; //번지
	
	public String getZipNum() {
		return zipNum;
	}
	public void setZipNum(String zipNum) {
		this.zipNum = zipNum;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getBunji() {
		return bunji;
	}
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}
	@Override
	public String toString() {
		return "AddressVO [zipNum=" + zipNum + ", sido=" + sido + ", gugun="
				+ gugun + ", dong=" + dong + ", zipCode=" + zipCode
				+ ", bunji=" + bunji + "]";
	}
	
	
	
}
