import java.util.Scanner;


public class calculator {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println ("Welcome to (Java) calculator");
boolean running =true;


while (running)  {
    printMenu();
            System.out.print("Choose an option: ");
            String choice = sc.nextLine().trim();


switch(choice) {
    case "1": performBinaryOperation("+"); 
    break;
    case "2": performBinaryOperation("-"); 
    break;
    case "3": performBinaryOperation("*"); 
    break;
    case "4": performBinaryOperation("/"); 
    break;
    case "5": performBinaryOperation("%"); 
    break;
    case "0":  running = false;
    break;
    default:  System.out.println("Invalid option. Please choose from the menu.\\n");


System.out.println("Goodbye");
  }
        }
        sc.close();
    }

  
  public static void printMenu()  {
    System.out.println("\n==== SIMPLE CALCULATOR====");
     System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("0. Exit");
  }  
  
  public static void performBinaryOperation(String op)  {
    Scanner sc = new Scanner (System.in);
   System.out.println("Enter First Number");
    double num1 = sc.nextDouble();
    System.out.println("Enter Second Number");
    double num2 = sc.nextDouble();
    double result = 0;

    switch (op) {
            case "+": result = num1 + num2;
             break;
            case "-": result = num1 - num2;
             break;
            case "*": result = num1 * num2;
             break;
            case "/": 
                if (num2 != 0)
                    result = num1 / num2; 
                else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case "%": result = num1 % num2; break;
        }
        System.out.println("Result: " + result);
  } 
 }