package introduction;

public class javabBrushup1 {

	static int a = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hi");
		System.out.println("hello world");
		System.out.println(a);
		javabBrushup1 fn = new javabBrushup1 ();
		fn.getdata();
		System.out.println(fn.getdata());
		SecondClass sn = new SecondClass();
		sn.setData();
	}

	public int getdata()
	{
		System.out.println("I am in a method");
		return 2;
	}
}
