package typeCasting;

public class typeCasting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Implicit Type Casting");
		byte b=18;
		System.out.println("byte value:"+b);
		short Sh=b;
		System.out.println("short value:"+Sh);
		int i=Sh;
		System.out.println("integer value:"+i);
		long l=i;
		System.out.println("long value:"+l);
		float f=l;
		System.out.println("float value:"+f);
		double d=f;
		System.out.println("double value:"+d);
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		float g=5.6f;
		System.out.println("float value:"+g);
		int x=(int)g;
		System.out.println("integer value:"+x);
		long h=(long)x;
		System.out.println("long value:"+h);
		short p=(short)h;
		System.out.println("short value:"+p);
		byte q=(byte)p;
		System.out.println("byte value:"+q);
		
		
		

	}

}
