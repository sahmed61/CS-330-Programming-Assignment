import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		String text = scan.nextLine();
		
		//Take out all characters not 0-9
		String number = text.replaceAll("[^0-9]", "");
		
		System.out.println(number);
		
		//Unlock
		boolean unlock = number.contains("419061");
		if (unlock == true)
		System.out.println("unlock");
		
		//Lock
		boolean lock = number.contains("419064");
		if (lock == true)
		System.out.println("lock");
		
		/*}
		int x = "419061".lastIndexOf(text);
		System.out.println(x);
		int y = "419064".lastIndexOf(text);
		System.out.println(y);
		while(lock == true & unlock == true) {
		break;
		if(boolean x = number.contains("419061"));
		continue;
		System.out.println(x);
		boolean y = number.contains("419064");
		System.out.println(y);
		}*/
		

		scan.close();

	}

}
