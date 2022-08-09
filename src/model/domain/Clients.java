/**
 * PROJ : 카페 데이터 관리
 * FILE : Clients.java
 * DESC : 고객 정보 
 * 
 * @author 성광식
 * @version 1.0
**/
package model.domain;

public class Clients {
	/*** 고객 정보 종류 ***/
	
	/** 이름 **/
	private String clientName;
	
	/** 나이 **/
	private int clientAge;
		// 나이별 선호 메뉴 파악하여 마케팅 가능
	
	/** 이메일 **/
	private String clientEmail;
	
	/** 연락처 **/
	private String clientContact;
	
	/** ID **/
	private String clientID;
	
	/** PW **/ 
	private String clientPWD;
	
	/** 주소 **/
	private String clientAddress;
		// 상류층 동네일 경우, 사회기여 상품에 지출할 확률이 높으므로 기부커피,서스펜디드 커피 등을 노출시킨다
			// 기부커피 : 같은 커피인데 마진을 붙여서 일정 금액을 기부하는 커피. 어차피 마진은 남는다.
			// 서스펜디드 커피 : 노숙자나 불우이웃을 위해 미리 돈을 내고 맡겨두는 커피
	
	/** 성별 **/	
		// 성별에 따른 선호 메뉴 파악
	private char clientGender;
	
	/** 생일 **/
		// 생일에 축하 메세지 및 각종 쿠폰 발송으로 결제 유도
		// https://badadict.com/en/15279
	private String clientBirthday;

	/** 고객 등급 **/
		// 고객 등급에 따른 각종 혜택 마케팅
	private String clientGrade;	
	
	/** 아이디어 **/
	 // desc-idea 문서 참조

	// constructor
	public Clients() {}
	public Clients(String clientName, int clientAge, String clientEmail, String clientContact, String clientID,
				   String clientPWD, String clientAddress, char clientGender, String clientBirthday, String clientGrade) {
		super();
		this.clientName = clientName;
		this.clientAge = clientAge;
		this.clientEmail = clientEmail;
		this.clientContact = clientContact;
		this.clientID = clientID;
		
		this.clientPWD = clientPWD;
		this.clientAddress = clientAddress;
		this.clientGender = clientGender;
		this.clientBirthday = clientBirthday;
		this.clientGrade = clientGrade;
	}
	
	// Getter, Setter
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getClientAge() {
		return clientAge;
	}
	public void setClientAge(int clientAge) {
		this.clientAge = clientAge;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getClientContact() {
		return clientContact;
	}
	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getClientPWD() {
		return clientPWD;
	}
	public void setClientPWD(String clientPWD) {
		this.clientPWD = clientPWD;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public char getClientGender() {
		return clientGender;
	}
	public void setClientGender(char clientGender) {
		this.clientGender = clientGender;
	}
	public String getClientBirthday() {
		return clientBirthday;
	}
	public void setClientBirthday(String clientBirthday) {
		this.clientBirthday = clientBirthday;
	}
	public String getClientGrade() {
		return clientGrade;
	}
	public void setClientGrade(String clientGrade) {
		this.clientGrade = clientGrade;
	}
	
	// toString
	@Override
	public String toString() {
		return clientName + "\n고객 나이 : " + clientAge + "\n고객 이메일 : " + clientEmail
				+ "\n고객 연락처 : " + clientContact + "\n고객 ID : " + clientID + "\n고객 PW : " + clientPWD
				+ "\n고객 주소 : " + clientAddress + "\n고객 성별 : " + clientGender + "\n고객 성별 : "
				+ clientBirthday + "\n고객 등급 : " + clientGrade + "\n";
	}
}