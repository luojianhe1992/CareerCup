package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String [] args){
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		deque.push(1);
		deque.push(2);
		deque.push(3);
		deque.push(4);
		deque.push(5);
		deque.push(6);
		
		System.out.println(deque);
		
		System.out.println(deque.pollFirst());
		
		Deque<Integer> deque2 = new LinkedList<Integer>();
		
		deque2.add(1);
		deque2.add(2);
		deque2.add(3);
		deque2.add(4);
		deque2.add(5);
		deque2.add(6);
		
		System.out.println("****************");
		
		System.out.println(deque2);
		
		System.out.println(deque2.pollFirst());
		
		System.out.println(deque2.pollLast());
		
		System.out.println(deque2.pollFirst());
		
		System.out.println(deque2.removeLast());
	}
}
