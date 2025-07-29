package chapter03.generic;

public class Printer03 {
	 public int sum(int...numbers) {
		 int sum = 0;
		 for(int n : numbers) {
			 sum += n;
		 }
		 return sum;
	 }
	 
	 public <T> void println(T...ts) {
		 for(T t : ts) {
			 System.out.print(t + " ");
		 }
		 System.out.println();
	 }
}
