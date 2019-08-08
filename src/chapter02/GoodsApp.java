package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		
		
		System.out.println(Goods.countOfGoods);
		
		camera.showInfo();  //showInfo 메소드
		
		System.out.println(  //calDiscountPrice 메소드
				"카메라 50%할인가격 : " +
				camera.calDiscountPrice(0.5f)+"\n");
		
		System.out.println("카메라의 이름은 " + camera.getName() + "입니다.");
		System.out.println("카메라의 가격은 " + camera.getPrice() + "원 입니다.");
		System.out.println("카메라의 재고는 " + camera.getCountStock() + "개 입니다.");
		System.out.println("카메라의 팔린개수는 " + camera.getCountSold() + "개 입니다." + "\n");
		
		//생성자 메소드로부터 개수 추가 
		Goods goods2 = new Goods();
		System.out.println("카메라가 생성되었습니다. 현재 " + Goods.countOfGoods + "개" );
		Goods goods3 = new Goods();
		System.out.println("카메라가 생성되었습니다. 현재 " + Goods.countOfGoods + "개" );
		Goods goods4 = new Goods();
		System.out.println("카메라가 생성되었습니다. 현재 " + Goods.countOfGoods + "개" );
		Goods goods5 = new Goods();
		System.out.println("카메라가 생성되었습니다. 현재 " + Goods.countOfGoods + "개" );
		}

}
