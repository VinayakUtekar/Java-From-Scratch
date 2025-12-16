
public class AddUsingParameterMethod {
    public static int addition(int a, int b){
		int p = a;
		int q = b;
		int sum = p + q;
		System.out.println("Addition = " + sum);
		return sum;
	}
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		addition(a,b);
		addition(100,200);
		addition(0,15);
		addition(-7,-25);
		addition(-20,0);
	}
}
