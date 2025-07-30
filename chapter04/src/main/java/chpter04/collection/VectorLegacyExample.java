package chpter04.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorLegacyExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		
		vector.addElement("둘리");
		vector.addElement("마이콜");
		vector.addElement("또치");
		
		// 순회1
		for(int i = 0; i < vector.size(); i++) {
			String s = vector.elementAt(i);
			System.out.print(s + " ");
		}	
		
		System.out.println();
		
		vector.removeElementAt(1);
		
		// 순회2
		Enumeration<String> enumeration  = vector.elements();
		while(enumeration.hasMoreElements()) {
			String s = enumeration.nextElement();
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 교체
		vector.setElementAt("도우너", 1);
		System.out.println(vector);
	}
}
