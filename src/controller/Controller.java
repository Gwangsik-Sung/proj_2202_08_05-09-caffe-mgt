/** 
 * PROJECT : 카페 데이터 관리
 * NAME : Controller.java
 * DESC : 고객에게 보여지는 실패 화면
 * 
 * @author 성광식  
 * @version 1.0
*/
package controller;

import model.domain.ClientsRecord;
import service.Service;
import view.FailView;
import view.SuccessView;

public class Controller {
	private static Service model = Service.getInstance(); // 싱글톤 구조
	
	public static void clientInsert(ClientsRecord client) { // 고객 기록을 추가하는 메소드
		try {
			model.clientInsert(client);
			SuccessView.succMsg("고객 등록이 완료되었습니다.");
		}
		catch (Exception e) { // 예외발생
			e.printStackTrace();
			FailView.failMsg("동일한 고객이이 이미 존재합니다. 재확인 요망");
		}
	}
}
