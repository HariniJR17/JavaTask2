package task2ThirdPrgm;

public class Implementation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create account with no-arg constructor (default balance = 0)
        Account acc1 = new Account();
        System.out.println("Account 1:");
        acc1.deposit(500);          
        acc1.withdraw(200);         
        acc1.displayBalance();      

        System.out.println();

        // Create account with initial balance of $1000
        Account acc2 = new Account(1000);
        System.out.println("Account 2:");
               
        acc2.deposit(300);          
        acc2.withdraw(500);         
        acc2.displayBalance();      
	}

}
