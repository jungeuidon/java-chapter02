package ArrUtil;
// 배열값 파라미터로 받기. 
// 형변환
// 향상된 for문
public class ArrayUtil {
	public static double[] intToDouble(int [] source) {  //int형을 double로
		double[] result = new double[source.length];
		
		
//		int index = 0;
//		for(int i:source) {
//			result[index++]= i;
//		}
		 
		for (int i = 0; i < result.length; i++) {
			result[i] = source[i];
		}
		
		return result;
	}
	
	public static int[] doubleToInt(double [] source) {  //double형을 int로
		int[] result = new int[source.length];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = (int)source[i];
		}
		
		return result;
	}
	
	public static int[] concat(int[] a1, int[] a2) {
		
		int[] result = new int[a1.length + a2.length];
		int index = 0;
		
		for (int i = 0; i < a1.length+a2.length; i++) {
			result[index++] = a1[i];
		}
		
		for (int i = 0; i < a1.length+a2.length; i++) {
			result[index++] = a1[i];
		}
		
		return result;
	}
	
}
