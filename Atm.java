package ProjectS;
import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("-------------------------Welcome to RV bank-------------------------");
        double a,b;
        int password;
        int ch,ch1,number;
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        System.out.println("Please enter password ");
        password = sc.nextInt();
        if (password == 2022){
        System.out.println("Please Enter Amount For some working following statements ");
        a = sc.nextDouble();
        do {
            System.out.println("1. Check balance");
            System.out.println("2. withdrawal amount ");
            System.out.println("3. Debit money");
            System.out.println("4. Exit");

            System.out.print("Please select correct decision ");
            ch = sc.nextInt();

            switch (ch){

                case 1:
                    if (a==a){
                        System.out.println("1. No script");
                        System.out.println("2. script");
                        System.out.println();
                        System.out.println("select choice");
                        ch1 = sc.nextInt();
                        switch (ch1){
                            case 1:
                                System.out.println("Given amount is :: " + a);
                                break;
                            case 2:
                                System.out.println("-----------------------------------------------------Hello welcome to RV bank--------------------------------------------------");
                                for (int cnt=1;cnt<=1;cnt++) {
                                    number = rm.nextInt(900);
                                    System.out.println("Account number : xxxxxxxxx" + number);
                                }
                                System.out.println("Password : xxxx ");
                                System.out.println("Available balance is : " + a);
                                System.out.println("Tax : 1.95xx");
                                System.out.println("----------------------------------------------------------------------------------------");
                                break;
                        }
                        break;
                    }
                case 2:
                    System.out.println("Please Enter amount can we withdrawal");
                    b=sc.nextDouble();
                    if (a>=b) {
                        a = a - b;
                        System.out.println("withdrawal successful! Thank you sir");
                        System.out.println("current Balance is : " + a);
                    }
                    else{
                        System.out.println("Not sufficient balance");
                    }
                    break;
                case 3:
                    System.out.print("Enter how many amount can add on our account ");
                    b = sc.nextDouble();
                    a = a + b;
                    System.out.println("Current balance is : " + a);
                    break;
                case 4:exit(0);
                break;
            }
        }while(ch!=4);
    }
        else{
            System.out.println("oops! Wrong password");
        }
    }

    private static void exit(int i) {
    }
}
