package strings;

final class StringDemo
{
	private final String name;
	private final int id;
	private final String city;
	
	StringDemo(String name,int id,String city)
	{
		this.name=name;
		this.id=id;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getCity() {
		return city;
	}
	
	public String modify(String name)
	{
		if(this.name==name)
		{
			return this.name;
		}
		else
		{
			return new String(name);
		}
	}
	
	
}
public class ImmutablceClass2 {

	public static void main(String[] args) {
		
		StringDemo sd=new StringDemo("hbk",555,"Koppal");
		System.out.println(sd.getCity());
		System.out.println(sd.getId());
		System.out.println(sd.getName());
		
		System.out.println(sd.modify("hubli"));

	}

}
