package in.co.collectionframework;
import java.util.ArrayList;


public class ImplCollection {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			names.add("NAMES :" + i);
		}
		//add(i,o)
		names.add(10, "TOYOTA");
		names.add(11, "SKODA");
		names.add(12, "HONDA");
		names.add(13, "MAHINDRA");
		names.add(14, "HUNDAI");
        
	ArrayList serials=new ArrayList();
	for (int i=0;i<=5;i++) {
		serials.add("SERIALS :"+i+10);
		
	}
	names.addAll(serials);
	//names.removeAll(serials);
	serials.retainAll(names);
     System.out.println(names.containsAll(serials));
	System.out.println(names);
	System.out.println("\n");
	System.out.println(serials);
	}
}
