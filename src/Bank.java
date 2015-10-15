import java.util.Scanner;


public class Bank {
	public static void main(String arg[]){
		
		int counter = 0;
		//int x ;
		//String c ;
		Scanner in = new Scanner(System.in);
		
	//for(x=0;x <=4;x++){
			System.out.println("01 For new Account");
			System.out.println("02 Deposit");
			System.out.println("03 For Withdraw");
			System.out.println("04 For EXIT");
			counter = in.nextInt();
			
		switch(counter){
		case 1:
		{
		System.out.println("New Account");
		System.out.println(":::::::::::::::::::");
		System.out.println("ENTER YOUR DETAILS");
		counter = in.nextInt();
		//c = in.nextLine();
		break;
		}
		case 2:
		
			System.out.println("ENTER YOUR DEPOSIT");
			System.out.println("-----------------------");
			break;
		
		case 3:
		
			System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
			System.out.println("*********************************");
			break;
			
		
		
		default:
			System.out.println("Wrong entry");
			break;
		
		}
			}
	}
//}