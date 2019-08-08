package chapter02;

public class Goods {
	
		private String name;
		private int price;
		private int countStock;
		private int countSold;
		
		public static int countOfGoods;
		
		public Goods() { //생성자 메소드
			countOfGoods += 1;        //굳이 앞에 Goods를 붙여주지 않아도 된다. 
			// = Goods.countOfGoods += 1; 와 같다.
			// = Goods.countOfGoods++;    와 같다.
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public int getCountStock() {
			return countStock;
		}
		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}
		
		public int getCountSold() {
			return countSold;
		}
		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}

		public void showInfo() {
			System.out.println(
					"showInfo메소드입니다" + "\n" +
					name + " : " + "\n" +
					price + " : " + "\n" +
					countStock + " : " + "\n" +
					countSold + "\n\n"
					);
			
		}

		public int calDiscountPrice(float discountRate) {
			return price - (int)(price * discountRate);
		}
}
