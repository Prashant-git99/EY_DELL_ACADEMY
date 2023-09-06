package Class_5;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListArray {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");list.add("A");list.add("A");list.add("A");
		
		//any number of all null is allowed
		list.add(null);list.add(null);list.add(null);
		
		list.add("Z");list.add("X");list.add("Y");list.add("B");
		
		list.addFirst("First Element is");
		list.addLast("Last Element");
		
		Object firstElement = list.getFirst();
		System.out.println("First Element is " + firstElement);      
		
		Object lastElement = list.getLast();
		System.out.println("Last Element is " + lastElement);
		
		int position = list.indexOf("Z");
		System.out.println("Position of Z is " + position);
		
		int lastPositionOfA = list.lastIndexOf("A");
		System.out.println("Position of last A is " + lastPositionOfA);
		
		list.add(0, "Add element at the zeroth index");
		list.remove(2); //removed element from 2nd index
		
		list.removeFirst();
		list.removeLast();
		
		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");
		
		Object o = list.poll();
		Object o2 = list.pollLast();
		/*
		 * Iteration<String> itr = list.Iterator(); while(itr.hasNext()) {
		 * System.out.print(Itr.next() + " "); }
		 */
		
		
		
		ListIterator<String> listItr = list.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next() + " ");
		}
		
		System.out.println();
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous() + " ");
		}		
	}
}
