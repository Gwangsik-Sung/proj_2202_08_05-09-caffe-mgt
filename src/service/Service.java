/** 
 * PROJECT : 카페 데이터 관리
 * NAME : Service.java
 * DESC : 고객 기록을 추가, 수정, 삭제, 검색하는 서비스 로직
 * 
 * @author 성광식  
 * @version 1.0
*/
package service;

import java.util.ArrayList;

import model.domain.CafeMenu;
import model.domain.ClientsRecord;

public class Service {
	private static Service instance = new Service();
	
	/** 고객 목록 ArrayList **/
	private ArrayList<ClientsRecord> clientsList = new ArrayList<ClientsRecord>(); // 고객 기록을 저장하는 ArrayList타입 clientsList 생성

	
	private Service() {} // 싱글톤 구조
	public static Service getInstance(){ // 싱글톤 구조 
		return instance;
	}
	
	/** 1. 고객 추가 **/
	public void clientInsert(ClientsRecord clients) throws Exception { // 예외처리
		
		ClientsRecord c = getClientsRecord(clients.getClientsNumber()); // 존재여부 검증
		
		if(c != null) {
			throw new Exception("해당 고객은 이미 존재합니다. 확인 바랍니다.");
		}
		clientsList.add(clients); // 고객기록을 저장하는 ArrayList에 해당 고객 추가
	}	
	
	/** 2. 모든 고객 검색 **/
	public ArrayList<ClientsRecord> getClientsList() {
		return clientsList;
	}
	
	/** 3. 특정 고객 검색 **/
    public ClientsRecord getClientsRecord(String clientNumber) {
        for(ClientsRecord searchClient : clientsList) { // 고객 기록을 저장하는 ArrayList에서 하나씩 반복조회하며 확인한다.
            if(searchClient != null && searchClient.getClientsNumber().equals(clientNumber)) {
                return searchClient;
            }
        }
        return null;
    }
    
	/** 4. 특정 고객의 마지막 주문 메뉴 변경**/
	public void clientLastMenuUpdate(String clientName, CafeMenu menu) { // 특정 고객명과 마지막 주문 메뉴를 받는다.
		for (ClientsRecord searchClient : clientsList) { 
			if (searchClient != null && searchClient.getClientsNumber().equals(clientName)) {
				searchClient.setCafeMenu(menu); // 특정 고객의 마지막 주문 메뉴를 setter로 변경한다.
				break; // 목적 달성후 for문 종료
			}
		}
	}
	
	/** 5. 특정 고객 탈퇴처리**/
	public void clientsDelete(String clientNumber) {
		ClientsRecord client = getClientsRecord(clientNumber);
		
		if(client != null) {	
			clientsList.remove(client); // 특정 고객을 ArrayList remove() 메소드를 사용하여 제거한다.
		}		
		
	}	
}
