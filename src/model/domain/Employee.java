/**
 * PROJ : 카페 데이터 관리
 * FILE : Employee.java
 * DESC : 직원 정보 
 * 
 * @author 성광식
 * @version 1.0
**/
package model.domain;

public class Employee {
	/** 직원 정보 종류**/
	
	/** 이름**/
	private String employeeName;
	
	/** 나이 **/
	private int employeeAge;
	
	/** 이메일 **/
	private String employeeEmail;

	/** 연락처 **/
	private String employeeContact;
	
	/** 직원 번호 **/
	private int employeeID;
	
	/** 주소 **/
	private String employeeAddress;
	
	/** 주민등록번호 **/
	private String employeeResidentRegistrationNumber;
	
	/** 성별 **/	
	private char employeeGender;
	
	/** 생일 **/
	private String employeeBirthday;

	/** 아이디어 **/
		// desc-idea 문서 참조

	// constructor
	public Employee() {}
	public Employee(String employeeName, int employeeAge, String employeeEmail, String employeeContact, int employeeID,
			String employeeAddress, String employeeResidentRegistrationNumber, char employeeGender,
			String employeeBirthday) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeEmail = employeeEmail;
		this.employeeContact = employeeContact;
		this.employeeID = employeeID;
		this.employeeAddress = employeeAddress;
		this.employeeResidentRegistrationNumber = employeeResidentRegistrationNumber;
		this.employeeGender = employeeGender;
		this.employeeBirthday = employeeBirthday;
	}
	
	// Getter & Setter
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeContact() {
		return employeeContact;
	}
	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeResidentRegistrationNumber() {
		return employeeResidentRegistrationNumber;
	}
	public void setEmployeeResidentRegistrationNumber(String employeeResidentRegistrationNumber) {
		this.employeeResidentRegistrationNumber = employeeResidentRegistrationNumber;
	}
	public char getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(char employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeeBirthday() {
		return employeeBirthday;
	}
	public void setEmployeeBirthday(String employeeBirthday) {
		this.employeeBirthday = employeeBirthday;
	}
	
	// toString
	@Override
	public String toString() {
		return "직원 이름 : " + employeeName + "\n직원 나이 : " + employeeAge + "\n직원 이메일 : "
				+ employeeEmail + "\n직원 연락처 : " + employeeContact + "\n직원 ID : " + employeeID
				+ "\n직원 주소 : " + employeeAddress + "\n직원 주민등록번호 : "
				+ employeeResidentRegistrationNumber + "\n직원 성별 : " + employeeGender + "\n직원 생일 : "
				+ employeeBirthday;
	}
}
