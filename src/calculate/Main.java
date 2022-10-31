package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    static char ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();                      //object creation
        System.out.println("Enter first number: ");
        obj.a = sc.nextInt();
        System.out.println("Enter second number: ");
        obj.b = sc.nextInt();
        System.out.println("Please enter one of symbol +,-,*, / :");
        obj.symbol = sc.next().charAt(0);

       obj.calculateResult(obj.a, obj.b, obj.symbol);
        System.out.println("Would you like to do more calculation Please enter: Y or N ");

        char ans = sc.next().charAt(0);

        while (ans == 'Y' || ans =='y') {

            System.out.println("Enter first number: ");
            obj.a = sc.nextInt();

            System.out.println("Enter second number: ");
            obj.b = sc.nextInt();

            System.out.println("Please enter one of symbol +,-,*, / :");
            obj.symbol = sc.next().charAt(0);

            obj.calculateResult(obj.a, obj.b, obj.symbol);

            System.out.println("would you like to do anymore calculation Please enter: Y or N");
            ans = sc.next().charAt(0);

        }


        while (ans == 'N' || ans == 'n')
        {
            System.out.println("Thank You");
            System.exit(0);
        }
    }
}
