package in.co.collectionframework;
public class Wrapper {

	public static void main(String[] args) {

		double d = 5.0;
		Double obj = new Double(d);
		System.out.println(obj);
		double d1 = obj.doubleValue();
		System.out.println(d1);

		char c = 'T';
		Character obj1 = new Character(c);
		System.out.println(obj1);
		char c1 = obj1.charValue();
		System.out.println(c1);

		int i = 10;
		Integer iobj = new Integer(i);
		System.out.println(iobj);
		int i1 = iobj.intValue();
		System.out.println(i1);

	}

}
