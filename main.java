package ambot;
import java.util.*;
public class main {
	static Scanner sc = new Scanner(System.in);
	static Queue<String> queue = new LinkedList<>();
	public static void main(String[] args) {
		addElements();
		displayElements();
		generatePermutation();
	}
static void addElements() {
	int count = 5;
	
	for(int i = 1; i <= count; i++) {
		System.out.print("Enter element " + i + ": ");
		String elements = sc.nextLine();
		queue.add(elements);
	}
	System.out.println("Elements sucessfully added");
}
static void displayElements() {
	if(queue.isEmpty()) {
		System.out.println("The queue is empty");
	} else { 
		System.out.println("Queue: " + queue);
		System.out.println("Dequeuing two elements...");
		queue.remove();
		queue.remove();
		System.out.println("Queue: " + queue);
	}
}
static void generatePermutation() {
	String[] pool = queue.toArray(new String[0]);
	System.out.print("Enter number of elements to arrange: ");
	int r = sc.nextInt();
	
	Queue<String> q = new LinkedList<>();
	for(String x: pool) q.add(x);
	
	while(!q.isEmpty()) {
		String s = q.poll();
		
		if(s.length() == r)
			System.out.println(s);
		else for(String x: pool)
		
		if(!s.contains(x)) 
			q.add(s + x); 
		}
	}
}
