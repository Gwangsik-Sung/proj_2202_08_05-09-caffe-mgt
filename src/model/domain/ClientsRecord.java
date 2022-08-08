/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  ClientsRecord.java
 * DESC  :  고객타입(Clients.java)와 카페메뉴(CafeMenu.java)를 합쳐서,
 * 고객별 칼로리 섭취량 등을 확인하는 클래스
 * 
 * @author  
 * @version 1.0
*/

package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ClientsRecord {
	/** 고객 관리 번호 **/
	private String clientsNumber;
	
	/** 고객 **/
	private Clients client;
	
	/** 마지막 주문 메뉴**/
	private CafeMenu cafeMenu;
	
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("고객 관리 번호: ");
		builder.append(clientsNumber);
		builder.append("\n");
		
		builder.append("고객 : ");
		builder.append(client);
		builder.append("\n");
		
		builder.append("마지막 주문 메뉴\n");	
		builder.append(cafeMenu);
		builder.append("\n");
		
		return builder.toString();
	}
}
