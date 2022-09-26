package Queue;

import java.util.ArrayDeque;

public class Dqueue {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		queue.offer(48);
		queue.offer(24);
		queue.offer(36);
		queue.offer(95);
		System.out.println(queue);
//		queue.poll();
//		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		System.out.println(queue.pollLast());
		System.out.println(queue);
	}

}
