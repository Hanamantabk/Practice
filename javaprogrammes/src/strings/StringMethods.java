package strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String st=new String("Hello hbk");
		String st1="Dogs are human friendly";
		String st2=new String("1223Hbk");
		
		System.out.println(st.length());
		st=st.concat(st2);
		System.out.println(st);
		st2.substring(4, 7);
		System.out.println(st2.substring(3, 6));
	}

}
