import java.util.Scanner;
public class AtmSystem
{
    static Scanner keyboard = new Scanner(System.in);
static String acctNum, pwd, result;
static double oldBalance, newBalance, deposit, withdraw;
static int choose;
    public static void main(String args[] )
    { 
        for (int run = 0; run < 3; run++) {
        System.out.println("Enter your account number");
        acctNum = keyboard.nextLine();
        System.out.println("Enter your account password");
        pwd = keyboard.nextLine();

        result = checkID(acctNum, pwd);
        if (!result.equals("ERROR")) {
            break;
        } else if (run == 2) {
                                
            System.out.println("MAXIMUM TRIES EXCEEDED");
            return;
        }
         }
    menu();
}

public static String checkID(String acctNum, Object pwd) {
    String result = "ERROR";
    String a = "123456789 1234";
    String b = "1234567 123";
    String c = "4321123 12345";
    if (acctNum.equals("123456789") && pwd.equals("1234")) {
        result = "SUCESSFUL";
    } else if (acctNum.equals("1234567") && pwd.equals("123")) {
        result = "SUCESSFUL";
    } else if (acctNum.equals("4321123") && pwd.equals("12345")) {
        result = "SUCESSFUL";
    }
    System.out.println(result);
    return result;
}
public static int menu() {
    

        int balance = 0, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("==========================================================");
            System.out.println("Automated Teller Machine");
            System.out.println("==========================================================");
            System.out.println("Choose [1] for Withdraw");
            System.out.println("Choose [2] for Deposit");
            System.out.println("Choose [3] for Check Balance");
            System.out.println("Choose [4] for EXIT");
            System.out.println("===========================================================");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
                break;
                
                default:
                System.out.println("Invalid Input");
            }
        }
}