
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice1 = 12.99;
		double itemPrice2 =  550.00;
		double amountInWallet1 = 50.00;
		double amountInWallet2 = 1000.00; 
		int numOfFriends1 = 244;
		int numOfFriends2 = 527;
		int age1 =  23;
		int age2 =  23;
		String firstName1 = "Jerel";
		String firstName2 = "Esme";
		String lastName1 = "Syga";
		String lastName2 = "Cuevas";
		String middleName1 = "Christopher";
		String middleName2 = "Jeanette";
		double remainingBalance1 = amountInWallet1 - itemPrice1;
		double remainingBalance2 = amountInWallet2 - itemPrice2;
		int friendsMade1 = numOfFriends1 / age1;
		int friendsMade2 = numOfFriends2 / age2;
		String fullName1 = firstName1 + " " + middleName1 +" " +lastName1;
		String fullName2 = firstName2 + " " + middleName2 +" "+ lastName2;
		
		System.out.println("I have $"+remainingBalance1+" remaining.");
		System.out.println("My wife has $"+remainingBalance2+" remaining.");
		System.out.println("I've made around "+friendsMade1+" friends each year of my life");
		System.out.println("My wife has made around "+friendsMade2+" friends this year.");
		System.out.println("My name is "+fullName1);
		System.out.println("My Wife's name is "+fullName2 );
	
	


	}
	
}