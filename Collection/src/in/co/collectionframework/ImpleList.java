package in.co.collectionframework;
import java.util.ArrayList;
import java.util.Scanner;

public class ImpleList {
//INTERFACE LIST
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		ArrayList names = new ArrayList();//linkedList,Vector,Stack
		for (int i = 1; i <= 10; i++) {
			names.add("NAMES :" + i);
		}
		//add(i,o)
		names.add(10, "TOYOTA");
		names.add(11, "SKODA");
		names.add(12, "HONDA");
		names.add(13, "MAHINDRA");
		names.add(14, "HUNDAI");
        //get(i)
        System.out.println(names.get(13));
        //remove(i)
         System.out.println(names.remove(13));	
         //set(i,o)
        // System.out.println(names.set(13, "MARUTI"));
		System.out.println(names.get(13));
		names.add(13, "MAHINDRA");
		names.add(13, "AUDI");
		System.out.println(names.get(13));
		System.out.println(names.indexOf("HUNDAI"));
		System.out.println(names.lastIndexOf("NAMES :7"));
		System.out.println(names.subList(10, 14));
		System.out.println(names);
		/*
		 * Object o=names.get(0); String name=(String)o;
		 * System.out.println("First name is "+name);
		 */
	}
}
