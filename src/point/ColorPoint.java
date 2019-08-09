package point;

public class ColorPoint extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
//		super.show();
		// 부모코드를 무시하고 완전 재구성 
		// 부모코드를 놔두고 부분 재구성
		System.out.println("점[x=" + getX() + ", y=" + getY() + ", " + getColor() +"]를 그렸습니다.");
		//getX()와 getY() 는 부모 클래스인 Point 에 접근할수 있어 가져왔다.
	}
	
}
 