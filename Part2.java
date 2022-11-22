import java.util.Random;

public class Part2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estimate average time to break lock
		int digits = 100; //number of digits in string 
		double number_attempts = 100000; //number of attempts to break lock 
		double total = 0; //total number of successful attempts 
		
		//Estimate Average number of successful attempts  
		for (int i = 0; i < number_attempts; i++) {
		//Random String generator
		String numbers = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rand = new Random();
        while (salt.length() < digits) { 
            int index = (int) (rand.nextFloat() * numbers.length());
            salt.append(numbers.charAt(index));
        }
        String randstr = salt.toString();
        //System.out.println(randstr);
        boolean unlock = randstr.contains("419061");
        if(unlock==true) {
        total = total + 1;
        }
		}
		
        System.out.println("Estimate on Average number of successful attempts to break lock: " + total/number_attempts);
		
        //Actual test
        System.out.println("Actual Test:");
        
        //Random String generator 
        String numbers = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rand = new Random();
        while (salt.length() < 1000000) { 
            int index = (int) (rand.nextFloat() * numbers.length());
            salt.append(numbers.charAt(index));
        }
        String randstr = salt.toString();
        
        //Unlock
        boolean unlock = randstr.contains("419061");
        System.out.println("Was the lock unlocked: " + unlock);
        
        //How many times unlock
        String findStr = "419061";
        int x = randstr.split(findStr, -1).length-1;
        System.out.println("The lock was unlocked " + x + " time/times");
        
        //How many symbols generated
        if(unlock == true) {
        int end = randstr.indexOf("419061");
        String outStr = randstr.substring(0, end);
        //System.out.println(outStr);
        int stringSize= outStr.length();
        System.out.println("There were " + stringSize + " symbols generated until the lock was unlocked");
        }
        
        //If not unlocked
        if(unlock == false) {
        	System.out.println("Please try again");
        }
        

	}

}
