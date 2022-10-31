/*
Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)
 */

package calculate;

public class Calculator {
    int a;
    int b;
    int result;
    char symbol;

    public void addition(int a, int b){
        result=a+b;
        System.out.println("Addition of two numbers where  " +a+ " + " +b+ " equal to "+ result);

    }public void subtraction(int a, int b){
        result=a-b;
        System.out.println("Subtraction of two numbers where " + a + " - " + b + " equal to "+ result);

    }public void division(int a, int b){
        result=a/b;
        System.out.println("Division of two numbers where  " +a+ " / " +b+ " equal to "+ result);

    }public void multiplication(int a, int b){
        result=a*b;
        System.out.println("Multiplication of two numbers where  " +a+ " x " +b+ " equal to "+ result);

    }
    public void calculateResult(int a, int b, char symbol){
        switch (symbol){
            case '+':
                addition(a, b);
                break;
            case '-':
               subtraction(a, b);
                break;
            case '/':
                try {
                    division(a, b);
                } catch (Exception c) {
                    System.out.println("Number can't divided by 0 " + c.getMessage());
                }
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("You have entered invalid input");
        }

    }
}
