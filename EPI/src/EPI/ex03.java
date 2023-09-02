package EPI;

public class ex03 {
	private int a;
	public void set(int a) {this.a=a;}
	public void add(int d) {a+=d;}
	public void print() {System.out.println(a);}
	public static void main(String[] args) {
		ex03 p = new ex03();
		ex03 q;
		p.set(10);
		q=p;
		p.add(10);
		q.set(30);
		p.print();

	}

}
