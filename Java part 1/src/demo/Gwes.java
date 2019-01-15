package demo;

public class Gwes {
	
	public String name ="Matlhogonolo";
	//String double ="Matlhogonolo";
	
	public String getName () {
		
		return "Hello-" + name;
		
		
	}
	
	public static void main(String[] args) 
	{
		
		Gwes mat = new Gwes();
		
		System.out.println(mat.getName());
	}

}
