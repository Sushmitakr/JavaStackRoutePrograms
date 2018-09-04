import java.util.*;

public class EvenOdd {

	public static void main(String args[]) {
		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>=20 && num<=30) {
			if(num%2 == 0) {
				System.out.println("Jerry Even" + num);
			}
			else {
				System.out.println("Tom Odd" + num);
			}
			
		}
		
	}
}
