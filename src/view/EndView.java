/** 
 * PROJECT : 카페 데이터 관리
 * NAME : EndView.java
 * DESC : 고객에게 보여지는 최종 화면
 * 
 * @author 성광식  
 * @version 1.0
*/
package view;

import java.util.ArrayList;

import model.domain.ClientsRecord;

public class EndView {
	
	// 특정 고객 출력
	public static void clientView(ClientsRecord client){
		if(client != null) {
			System.out.println(client);		
		}else {
			System.out.println("해당 고객은 존재하지 않습니다.");
		}
	}
	
	// 모든 고객 출력
	public static void clientListView(ArrayList<ClientsRecord> allClientRecord){
		int index = 1;
		for(ClientsRecord client : allClientRecord) {
			
			if(client != null){
				System.out.println("[고객 : " + (index++) + "] " + "\n" + client);
			}
		}
	}
}
