package strings;

//is possible to create own immutable class?

final class Test
{
	private int i;
	private int j;
	Test(int i)
	{
		this.i=i;
	}
	
	public Test modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new Test(i);
		}
	}

	
}



public class Stringcase1 {

	public static void main(String[] args) {
	
		Test t=new Test(10);
		Test t1=t.modify(100);
		Test t2=t.modify(10);
		
		System.out.println(t==t1);
		System.out.println(t==t2);
		System.out.println(t.modify(100));
		System.out.println(t1);
		

	}

}


