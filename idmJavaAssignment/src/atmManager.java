import java.util.Scanner;

public class atmManager {

    public static void main(String[] args) {
        //Assignment for IDM
        //ATM Withdrawal program using JAVA

        //Assigning the default value for some variables

        Double initialBalance = 15000.50; //initial balance
        int password = 1254; //default password
        String name = "Eric Luwis"; //Default Name


        System.out.println("Welcome to Bank Of Sri Lanka!");
        System.out.println("Please Insert Your Debit/Visa Card");
        System.out.println("Hi!" + " " + name + " " + " ");
        System.out.println("Please Enter your PIN Number");
        Scanner scanner = new Scanner(System.in);
        int pinValue =  scanner.nextInt();

        //Condition to chek the Pin Number


            if (pinValue == 1254){

                System.out.println("Welcome" + " " + name + " " );

                System.out.println("Please Enter 1 for Check Your Balance");
                System.out.println("Please Enter 2 for withdraw money");
                System.out.println("Please Enter 3 for  Utility Bills");
                System.out.println("Please Enter 4 Change PIN Number");
                System.out.println("Please Enter 5 for Exit");



                Scanner scanner1 =  new Scanner(System.in);
                int getNum =  scanner1.nextInt();

                //Check Condition Number One - Check Balance

                if (getNum == 1){
                    System.out.println("Your Actual Balance is:" + " " + "RS" + initialBalance);
                    System.out.println("Do You want to print a receipt for Your Balance");
                    System.out.println("Enter 'Y' if YES");
                    System.out.println("Enter 'N' if No");
                    Scanner scanner2 = new Scanner(System.in);
                    String printBalance =  scanner2.nextLine();

                    //Check Condition To Print receipt

                    if (printBalance == "Y"){

                        System.out.println("Your Receipt is Printing!!!");
                        System.out.println("Thank You for Banking With Us");
                        System.out.println("Stay Home! Stay Safe!");
                    }

                    else {

                        System.out.println("Thank You for Banking With Us");
                        System.out.println("Stay Home! Stay Safe!");
                    }


                }

                //Check Condition Number Two - Withdrawal
                else if (getNum == 2){
                    System.out.println("");

                }

                //Check Condition Number Three - Utility Bill Payment
                else if (getNum == 3){

                }

                //Check Condition Number Four - PIN Change
                else if (getNum == 4){

                }

                //Check Condition Number One - Check Balance
                else{

                }



            }
            else{
                System.out.println("You've entered wrong PIN Number");
                System.out.println("Kindly Check Your PIN");


            }
        


    }
}