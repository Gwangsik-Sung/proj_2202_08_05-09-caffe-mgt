package service;

import java.util.ArrayList;

import model.domain.CafeMenu;
import model.domain.ClientsRecord;

public class Service {
	private static Service instance = new Service();
	
	/**고객 목록 ArrayList **/
	private ArrayList<ClientsRecord> clientsList = new ArrayList<ClientsRecord>();
	
	/** 총 고객 수 **/
	private Service() {}
	public static Service getInstance(){
		return instance;
	}
	
	/** 1. 고객 추가 **/
	public void clientInsert(ClientsRecord clients) throws Exception {
		
		// 존재여부 검증
		ClientsRecord c = getClientsRecord(clients.getClientsNumber());
		
		if(c != null) {
			throw new Exception("해당 고객은 이미 존재합니다. 재확인하세요");
		}
		clientsList.add(clients);
	}	
	
	/** 2. 모든 고객 검색 **/
	public ArrayList<ClientsRecord> getClientsList() {
		return clientsList;
	}
	
	/** 3. 특정 고객 검색 **/
    public ClientsRecord getClientsRecord(String clientNumber) {
        
        for(ClientsRecord searchClient : clientsList) {
        	// 진행중인 재능기부 프로젝트를 저장하고 있는 목록인 donationProjectList에서
        	// 재능기부 프로젝트타입 참조변수 project 하나씩 조회하며 받는다.
            if(searchClient != null && searchClient.getClientsNumber().equals(clientNumber)) {
                return searchClient;
            }
        }
        return null;
    }
    
	/** 4. 특정 고객의 마지막 주문 메뉴 변경**/
	public void clientLastMenuUpdate(String clientName, CafeMenu menu) {
		for (ClientsRecord searchClient : clientsList) {
			if (searchClient != null && searchClient.getClientsNumber().equals(clientName)) {
				searchClient.setCafeMenu(menu);
				break;
			}
		}
	}
	
	/** 5. 특정 고객 탈퇴처리**/
	public void clientsDelete(String clientNumber) {
		ClientsRecord client = getClientsRecord(clientNumber);
		
		if(client != null) {	
			clientsList.remove(client);
		}		
		
	}	
}
