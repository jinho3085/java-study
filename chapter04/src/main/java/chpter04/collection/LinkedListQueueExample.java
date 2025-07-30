package chpter04.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("마이콜");
		queue.offer("둘리");
		queue.offer("또치");
		
		while(!queue.isEmpty()) {
			String s = queue.poll();
			System.out.println(s);
		}
		
		// 비어 있는 경우는 null을 변환한다.
		System.out.println(queue.poll());
		
		queue.offer("마이콜");
		queue.offer("둘리");
		queue.offer("또치");
		
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		
	}

}
