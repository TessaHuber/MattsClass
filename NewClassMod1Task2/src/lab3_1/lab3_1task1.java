package lab3_1;

public class lab3_1task1 {

	public static void main(String[] args){
		int a = 5, b = 10;
		PassingInt(a, b);
		System.out.println("using integer values: " + a + " " + b);
		A objA = new A(5);
		A objB = new A(10);
		PassingObjects(objA, objB);
		System.out.println("using object references " + objA + " " + objB);
	}
	
	
	private static void PassingInt(int a, int b){
		int c = a;
		a = b;
		b = c;
	}
	

	private static void PassingObjects(A a, A b){
		A c = new A(a.a);
		a.a = b.a;
		b.a = c.a;
	}
	
	private static class A{
		int a;

		A(int a){
			this.a = a;
		}

		@Override
		public String toString() {
			return "A [a=" + a + "]";
		}
	}
}
