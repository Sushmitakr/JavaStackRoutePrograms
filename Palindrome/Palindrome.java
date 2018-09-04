import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum=0, temp, sumOfEven=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("The input of a number is:");
		
		int num = sc.nextInt();
		System.out.println(num);
		
		temp = num;
		
		System.out.println(temp);
		
		while(num>0) {
			r = num%10;
			if((num%2) == 0) {
				sumOfEven = sumOfEven + r;
			}
			
			sum = (sum*10) + r;
			num = num/10;
		}
		if(temp == sum) {
			System.out.println(sum + " is Palindrome");
			System.out.println("and sum of even number is: "+ sumOfEven);
			if(sumOfEven > 25) {
				System.out.println("sum of even number is greater than 25");
			}
			else {
				System.out.println("sum of even number is less than 25");
			}
		}
		else {
			System.out.println("Not a Palindrome");
		}


	}

}
