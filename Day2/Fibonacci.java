public class Fibonacci{
	public static void main(String[] args) {
		int x=1, y=1, n=15;
		System.out.println(x+ " " +y);
		for(int i=2; i<n; i++){
			int z = x+y;
			System.out.println( " " +z);
			x=y;
			y=z;
		}
	}
}