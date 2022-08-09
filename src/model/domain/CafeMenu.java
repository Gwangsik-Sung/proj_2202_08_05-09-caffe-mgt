/**
 * PROJ : 카페 데이터 관리
 * FILE : CafeMenu.java
 * DESC : 카페 메뉴 정보 
 * 
 * @author 정시준
 * @version 1.0
**/

package model.domain;

public class CafeMenu {
    /*** 카페 메뉴 종류 ***/
	
    /** 메뉴 카테코리 **/
    private String menuCategory;
    
    /** 메뉴 이름 **/
    private String menuName;
    
    /** 메뉴 가격 **/
    private int menuPrice;
    
    /** 메뉴 칼로리 **/
    private String menuCalorie;
    
    // constructor
    public CafeMenu() {}
    public CafeMenu(String menuCategory, String menuName, int menuPrice, String menuCalorie) {
        super();
        this.menuCategory = menuCategory;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuCalorie = menuCalorie;
    }
    
    // Getter, Setter
    public String getMenuCategory() {
        return menuCategory;
    }
    
    public void setMenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }
    
    public String getMenuName() {
        return menuName;
    }
   
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    public int getMenuPrice() {
        return menuPrice;
    }
    
    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }
    
    public String getMenuCalorie() {
        return menuCalorie;
    }
    
    public void setMenuCalorie(String menuCalorie) {
        this.menuCalorie = menuCalorie;
    }
    
    // toString
	@Override
	public String toString() {
		return "\n메뉴 카테고리 : " + menuCategory + "\n메뉴 이름 : " + menuName + "\n메뉴 가격 : " + menuPrice
				+ "\n메뉴 칼로리 : " + menuCalorie;
	}
    
}