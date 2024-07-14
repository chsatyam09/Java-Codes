import java.util.Scanner;

class ATM {

    int pin = 5673 ;
    double balance=1000; ;

    public void checkpin(){
        System.out.println("Enter your 4 Digit pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == pin) {
            menu();
            
        }
        else{
            System.out.println("your pin is Wrong please recheck and enter :");
            checkpin();
        }

    }


    public void menu(){
        System.out.println("enter your choice :");
        System.out.println("1. Check Account Balance ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit from Here ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){

            CheckBalance();
        }
        else if (opt == 2){
            WithdrawMoney();
          
        }
        else if (opt == 3){
            DepositMoney();
        }
        else{
            System.out.println("enter a valid number ");
        }
    }

    

        public void CheckBalance(){
            System.out.println("your current Balance is :" + balance);
            menu();
        }


        public void WithdrawMoney(){
            System.out.println("enter the amount you want to withdraw:");
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            if (amount>balance) {
                System.out.println("sorry , insufficent fund");
                
            }
            else if(amount<balance){

                System.out.println("please collect you cash : " + amount + " thank you") ;

                balance =  balance - amount ;

                // System.out.println("your reaming amount is : " +   balance);
                CheckBalance();
            }
            menu();
        }

        public void DepositMoney(){
            System.out.println("enter the amount you want to Deposit:");
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            System.out.println("you amount is succesfully deposited :");

            balance =  balance + amount ;
            // System.out.println("you current balance is : " + balance);
               CheckBalance();
               menu();
        }
      
    }


public class ATM_machine {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
        
    }
}

// =================================================================================================================================================================

// CAR SHOWROOM MANAGEMENT SYSTEM USING inheritance AND POLYMORPHISM 

