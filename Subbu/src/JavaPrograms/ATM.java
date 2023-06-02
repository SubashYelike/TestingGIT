package JavaPrograms;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ClassName objectName = new ClassName();
		ATM bank1 = new ATM();
		//objectName.MethodName();
		bank1.withdraw(10000,20000,"Savings");
		bank1.withdraw(5000,10000,"Current");
		bank1.withdraw(15000,9000,"Corporate");
	}	
	public void withdraw(int x, int y, String z) //Parameters or Objects
	{
     System.out.println("I am from Withdraw Method");
     int balance = x;
     String accountType = z;
     int moneyTowithdraw = y;
    //if moneyTowithdraw is lessthan balance 
     System.out.println("Bank Account Type is"+accountType);
     if(moneyTowithdraw<balance)
     {
    	 System.out.println("you are eligible to withdraw"+moneyTowithdraw);
     }
     else 
     {
    System.out.println("Your balance is"+balance+ "but you are trying to withdraw" +moneyTowithdraw);	 
     }
   
	}
	}   
