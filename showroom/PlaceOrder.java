
import java.util.Scanner;
public class PlaceOrder {

	
	
	public static void main(String args[]) {
		String model,year,amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Create new order:");
		model = sc.next();
		year = sc.next();
		amount = sc.next();
		
		System.out.println(model);
		System.out.println(year);
		System.out.println(amount);
		sc.close();
		}
	
}
