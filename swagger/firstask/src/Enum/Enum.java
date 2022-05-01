package Enum;

public class Enum {
	enum Month
	{
		Jan,Feb,Mar;
	/*Jan(1),
	Feb(2),
	Mar(3);
	int value;
	private Month(int value)
	{
		this.value=value;
	}*/
	}
	public static void main(String[] args) {
		for(Month m:Month.values())
		{
			System.out.println(m);
			System.out.println(Month.valueOf("Jan"));
			System.out.println(Month.valueOf("Jan").ordinal());
			//System.out.print(m+" "+m.value);
		}
	}

}
