class Asc {
	public static void main (String a[]){
		int i;
		char c;
		System.out.println("integer		character");
		
		for (i = 32; i < 255; i++ ){
			c = (char)i;
			System.out.print(i+"="+c+" ");
			if(i % 10 == 0){System.out.println();}
			
			}
	}	
}
