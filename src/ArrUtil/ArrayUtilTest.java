package ArrUtil;
// 배열값 파라미터로 받기. 
// 형변환
// 향상된 for문
public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] a1 = {10, 11, 12, 13};   //a1배열 에 값들을 담는다.
		double[] d1 = ArrayUtil.intToDouble(a1);  // a1배열을 함수에 넣어 d1배열에 담아낸다.
		for(double d : d1) {  //d1 배열이 끝날때까지 d에 넣기 
			System.out.print(d + " ");   //d출력
		}
		
		System.out.println("");
		
		double[] d2 = {0.0, 1.1, 2.2, 3.3};
		int[] a2 = ArrayUtil.doubleToInt(d2);
		for (int i : a2) {
			System.out.println(i + " ");
		}
		
		System.out.println("");
		
		int[] a3 = ArrayUtil.concat(a1, a2);
		for (int i : a2) {
			System.out.println(i + " ");
		}

	}

}
