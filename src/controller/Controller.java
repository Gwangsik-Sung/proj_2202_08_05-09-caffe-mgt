package controller;

import model.domain.ClientsRecord;
import service.Service;
import view.FailView;
import view.SuccessView;

public class Controller {
	private static Service model = Service.getInstance();
		// StrartView에서 TalentDonationProjectController 객체 생성없이 메소드 호출을 위해 static로 선언했다.
		// try 블럭에서 TalentDonationProjectController 객체를 생성할 수 있지만, 매번 객체를 생성해야하므로 비효율적이라
			// static로 만드는게 효율적이다.
	
	// insert 실행 로직
	/* StartView가 데이터 저장을 위해 전송
	 * Model 로직. 즉, service 로직 실행
	 * 예외 발생 시 FailView로 출력 위임
	 * 정상 실행 시 SuccessView로 저장 성고 출력 위임
	 * 
	 * StartView -> Controller -> Service -> DB -> Service -> Controller -> SuccessView or FailView
	 */
	public static void clientInsert(ClientsRecord client) {
		try {
			model.clientInsert(client);
			SuccessView.succMsg("고객 등록이 완료되었습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
			FailView.failMsg("동일한 고객이이 이미 존재합니다. 재확인 요망");
		}
	}
}
