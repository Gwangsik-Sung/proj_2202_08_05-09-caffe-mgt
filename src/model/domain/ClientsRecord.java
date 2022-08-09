/** 
 * PROJECT  : 카페 데이터 관리
 * NAME  :  ClientsRecord.java
 * DESC  :  고객타입(Clients.java)와 카페메뉴(CafeMenu.java)를 합쳐서,
 * 고객별 칼로리 섭취량 등을 확인하는 클래스
 * 
 * @author 성광식
 * @version 1.0
*/

package model.domain;

public class ClientsRecord {
	/*** 고객 기록 종류 ***/
	
	/** 고객 관리 번호 **/
	private String clientsNumber;
	
	/** 고객 **/
	private Clients client;
	
	/** 마지막 주문 메뉴**/
	private CafeMenu cafeMenu;
	
	// constructor
	public ClientsRecord() {}
	public ClientsRecord(String clientsNumber, Clients client, CafeMenu cafeMenu) {
		super();
		this.clientsNumber = clientsNumber;
		this.client = client;
		this.cafeMenu = cafeMenu;
	}

	// Getter, Setter
	public String getClientsNumber() {
		return clientsNumber;
	}
	public void setClientsNumber(String clientsNumber) {
		this.clientsNumber = clientsNumber;
	}
	public Clients getClient() {
		return client;
	}
	public void setClient(Clients client) {
		this.client = client;
	}
	public CafeMenu getCafeMenu() {
		return cafeMenu;
	}
	public void setCafeMenu(CafeMenu cafeMenu) {
		this.cafeMenu = cafeMenu;
	}
	
	// toString
	@Override
	public String toString() {
		return "고객 관리 번호 : " + clientsNumber + "\n고객 이름 : " + client + "\n마지막 주문 메뉴" + cafeMenu;
	}
}
