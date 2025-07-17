package chapter01;

public class Ex30WhileContinueFix {
	public static void main(String[] args) {
		
//		while 문에서 continue 사용 시, 증강문 위치를 주의해야 한다.
//		while (i < 10) {
// 			int i = 0;
//		    if (i > 5) { 
//		       continue; 
//		   } 
//		   System.out.println(i); 
//		   i++; 
		

		for (int i = 0; i < 10; i++) {
		    if ( i > 5 ) {
		       continue;
		    }
		     
		    System.out.println(i); 
		}
		}
		
	}