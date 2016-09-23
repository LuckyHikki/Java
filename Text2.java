class Text2 {
	public static void main (String a[]){
		int i,ci;
		char c;
	i = 7;
	c = 'A';
	String s = "this is a string";
	System.out.println("-------------------");
	System.out.println("i = "+i);
	System.out.println("c = "+c);
	System.out.println("s = "+s);
		System.out.println("------------------");
		
	i = i % 7;
	ci = (int)c;
	
	System.out.println("--------------------");
	System.out.println("i = " + i);
	System.out.println("ci = "+ci);
	ci = ci %7;
	System.out.println("Now ci = "+ci);
	
	}
}
