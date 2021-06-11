package Collections;
import java.util.*;
import java.io.*;
 
public class pQueue {
 
	
    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        pq.add("Tit");
        pq.add("For");
        pq.add("Tat");
 
        System.out.println("Initial PriorityQueue " + pq);
        pq.remove("Tit");
 
        System.out.println("After Remove - " + pq);
 
        System.out.println("Poll Method - " + pq.poll());
 
        System.out.println("Final PriorityQueue - " + pq);
    }
}