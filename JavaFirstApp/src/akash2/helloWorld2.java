package akash2;

public class helloWorld2 {

	static int display(int...arr) {
		System.out.println("Method invoked");
		int sum =0;
		for (int i : arr) {
			sum +=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(display(5,8,11,25,55,8865,954654,45545,1,6,6,88,44));
		
	}

}
