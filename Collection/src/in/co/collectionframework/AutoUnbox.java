package in.co.collectionframework;

public class AutoUnbox {

	public static void main(String[] args) {
		// Primitive way
		int i = 10;
		Integer iboj = new Integer(i);// Converting primitive data type to oject
										// using primitive classes

		System.out.println("First :" + iboj);

		// After Autoboxing and unboxing
		int j = 10;
		Integer jobj = j;// autobox
		int k = jobj;// unbox
		System.out.println(jobj);
		System.out.println(k);

	}

}
