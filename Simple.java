package testPackage;

public class Simple {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		int a=20,b=10,output;
		output=add(a,b);
		System.out.println(output);
		output=sub(a,b);
		System.out.println(output);
		output=mul(a,b);
		System.out.println(output);
		output=div(a,b);
		System.out.println(output);
	}

	static int add(int a,int b){
		int output = a+b;
		return output;
	}
	static int sub(int a,int b){
		int output = a-b;
		return output;
	}
	static int mul(int a,int b){
		int output = a*b;
		return output;
	}
	static int div(int a,int b){
		int output = a/b;
		return output;
	}
}
