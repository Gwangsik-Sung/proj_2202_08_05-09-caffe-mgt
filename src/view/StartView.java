/** 
 * PROJECT : 카페 데이터 관리
 * NAME : StartView.java
 * DESC : 고객에게 보여지는 첫 화면
 * 
 * @author 성광식  
 * @version 1.0
*/
package view;

import java.util.ArrayList;

import controller.Controller;
import model.domain.CafeMenu;
import model.domain.Clients;
import model.domain.ClientsRecord;
import model.domain.Employee;
import service.Service;

public class StartView {

	public static void main(String[] args) {
		
		// 고객
		Clients clients1 = new Clients("김현주", 25, "jung@company.com","010-2414-4635","1001","temppw1001","경기 고양시 일산동구 경의로 573 / 4층",'F',"1월3일","A");
		Clients clients2 = new Clients("이지영", 35, "sung@company.com","010-6425-4371","1002","temppw1002","경기 고양시 일산서구 탄중로101번길 41",'F',"5월23일","B");
		Clients clients3 = new Clients("강수호", 32, "shin@company.com","010-6466-2274","1003","temppw1003","경기 고양시 덕양구 행주산성로 117-34",'M',"8월17일","C");
		Clients clients4 = new Clients("하도겸", 28, "kim@company.com","010-7733-3115","1004","temppw1004","경기 고양시 덕양구 행주산성로 141",'M',"11월19일","D");
		
		// 직원
		Employee employee1 = new Employee("김하준", 22, "khj@conmany.com","010-5262-6735", 201, "서울 서초구 신반포로 176 신세계백화점 강남점 지하 1층","880501-1344525",'M',"5월1일");
		Employee employee2 = new Employee("서은우", 25, "seu@conmany.com","010-6733-1236", 202, "서울특별시 용산구 한강대로50길 25 1층","670428-1256230",'M',"4월28일");
		Employee employee3 = new Employee("황서아", 28, "hsa@conmany.com","010-7735-2427", 203, "서울 서초구 동광로 99 2층","991112-2593963",'F',"11월22일");
		Employee employee4 = new Employee("나서윤", 30, "nsu@conmany.com","010-6612-5523", 204, "서울특별시 종로구 자하문로16길 8","980922-2693843",'F',"9월22일");
		
		// 메뉴
		CafeMenu cafeMenu1 = new CafeMenu("콜드 브루 커피", "돌체 콜드 브루", 6000, "265kcal");
		CafeMenu cafeMenu2 = new CafeMenu("콜드 브루 커피", "콜드 브루", 4900, "5kcal");
		CafeMenu cafeMenu3 = new CafeMenu("콜드 브루 커피", "콜드 브루 오트 라떼", 5800, "120kcal");
		CafeMenu cafeMenu4 = new CafeMenu("콜드 브루 커피", "바닐라 크림 콜드 브루", 5800, "125kcal");
		CafeMenu cafeMenu5 = new CafeMenu("블론드", "아이스 블론드 카페 라떼", 5000, "110kcal");
		CafeMenu cafeMenu6 = new CafeMenu("블론드", "아이스 블론드 카페 아메리카노", 4500, "10kcal");
		CafeMenu cafeMenu7 = new CafeMenu("에스프레소", "아이스 카페 모카", 5500, "250kcal");
		CafeMenu cafeMenu8 = new CafeMenu("에스프레소" , "아이스 카페 아메리카노", 4500, "10kcal");
		CafeMenu cafeMenu9 = new CafeMenu("에스프레소", "아이스 카푸치노", 5000, "115kcal");
		CafeMenu cafeMenu10 = new CafeMenu("프라푸치노", "자바 칩 프라푸치노", 6300, "340kcal");
		CafeMenu cafeMenu11 = new CafeMenu("프라푸치노", "모카 프라푸치노", 5900, "280kcal");
		CafeMenu cafeMenu12 = new CafeMenu("프라푸치노", "카라멜 프라푸치노", 5900, "300kcal");
		CafeMenu cafeMenu13 = new CafeMenu("피지오", "쿨 라임 피지오", 5900, "105kcal");
		CafeMenu cafeMenu14 = new CafeMenu("피지오", "블랙 티 레모네이드 피지오", 5400, "65kcal");
		CafeMenu cafeMenu15 = new CafeMenu("티바나", "아이스 차이 티 라떼", 5500, "190kcal");
		CafeMenu cafeMenu16 = new CafeMenu("티바나", "아이스 자몽 허니 블랙 티", 5700, "125kcal");
		CafeMenu cafeMenu17 = new CafeMenu("티바나", "아이스 얼 그레이 티", 4500, "0kcal");
		CafeMenu cafeMenu18 = new CafeMenu("샌드위치&샐러드", "프렌치 바게트 샌드위치", 5900, "288kcal");
		CafeMenu cafeMenu19 = new CafeMenu("샌드위치&샐러드", "베이컨 치즈 토스트", 4900, "404kcal");
		CafeMenu cafeMenu20 = new CafeMenu("아이스크림", "바닐라 아포가토", 5900, "208kcal");
		
		// 고객 기록
		ClientsRecord clientsRecord1 = new ClientsRecord("고객101", clients1, cafeMenu1);
		ClientsRecord clientsRecord2 = new ClientsRecord("고객102", clients2, cafeMenu2);
		ClientsRecord clientsRecord3 = new ClientsRecord("고객103", clients3, cafeMenu3);
		ClientsRecord clientsRecord4 = new ClientsRecord("고객104", clients4, cafeMenu4);		
		
		// 단일 모델 객체변수 생성
		Service service = Service.getInstance();
		
		/** 01. 고객 추가 **/
		System.out.println("*** 01. 신규 고객 추가 ***");
		Controller.clientInsert(clientsRecord1); 
		Controller.clientInsert(clientsRecord2); 
		Controller.clientInsert(clientsRecord3); 
		Controller.clientInsert(clientsRecord4); 
		
		/** 02. 모든 고객 검색**/
		System.out.println("\n*** 02. 모든 고객 조회 ***");
		ArrayList<ClientsRecord> allClientRecord = service.getClientsList();
		EndView.clientListView(allClientRecord);
		
		/** 03. 특정 고객 검색 **/
		System.out.println("\n*** 03. 특정 고객 정보 검색 ***");
		ClientsRecord client = service.getClientsRecord("고객102");
		EndView.clientView(client);
		
		/** 04. 특정 고객의  마지막 주문 메뉴 변경 후, 해당 고객 검색**/
		// 마지막 주문 메뉴 변경
		System.out.println("\n*** 04. 특정 고객의  메뉴 변경 후, 해당 고객 검색***");		
		service.clientLastMenuUpdate("고객102", cafeMenu20);
		// 변경한 고객 검색
		client = service.getClientsRecord("고객102");
		EndView.clientView(client);
		
		/** 05. 특정 고객 삭제 후, 해당 고객 검색**/
		// 고객 삭제
		System.out.println("\n*** 05. 특정 고객 삭제 후, 해당 고객 검색 ***");
		service.clientsDelete("고객104");
		// 삭제한 고객 검색
		client = service.getClientsRecord("고객104");
		EndView.clientView(client);
	}
}