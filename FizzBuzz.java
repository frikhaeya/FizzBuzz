package eya;

public class FizzBuzz {

	public static boolean prime (int n) {
		boolean bool=true;
		for(int j=2; j<=n/2; j++) {
			if (n%j == 0) {
				bool=false;
				break;
			}
		}
		return bool;
	}
	
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if (prime(i)) {
				System.out.println("prime");
			}
			else {
				if(i%3==0 && i%5!=0) {
				System.out.println("Fizz");
				}
				else if(i%5==0 && i%3!=0) {
					System.out.println("Buzz");
				}
				else if(i%3==0 && i%5==0) {
					System.out.println("FizzBuzz");
				}
				else {
					System.out.println(i);
				}
			}
		}

	}

}
