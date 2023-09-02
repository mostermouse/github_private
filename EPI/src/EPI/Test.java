package EPI;


class A {
	A(){System.out.printf("%d",10);}   //생성자는 부모먼저 탐
}
class B extends A{
	B(int a){System.out.printf("%d",a);}
}
class C extends B{
	C(int a){
		super(a/10);
		System.out.printf("%d",a);
	}
} 

class Test{
	public static void main(String args[]) {
		A b = new C(1000);
	} 
}