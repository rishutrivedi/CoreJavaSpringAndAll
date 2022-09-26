package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<Integer>(Comparator.reverseOrder());
		queue.offer(48);
		queue.offer(24);
		queue.offer(36);
		queue.offer(95);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
	}

}
