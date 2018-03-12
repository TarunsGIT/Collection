package in.co.collectionframework;
import java.util.ArrayList;
import java.util.Iterator;


public class Genrics {

	public static void main(String[] args) {
       
		ArrayList<String> L1=new ArrayList<String>();
		L1.add("ONE");
		L1.add("two");
		L1.add("THREE");
		L1.add("two");
		String str=L1.get(0);
		System.out.println(str);
		System.out.println("\n");
		Iterator<String> it= L1.iterator();
		
		while(it.hasNext()){
		
		System.out.println(it.next());
			}
		}
		
	}


