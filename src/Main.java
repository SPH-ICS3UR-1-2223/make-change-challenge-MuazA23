import java.util.Scanner;

public class Main {}

public static void main(String (args) {
// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println "Type in A Price";
double price = in.nextDouble();
System.out.println "Your Total is $" + price + ".";
System.out.println "Type in your payment";
double paid = in.nextDouble();
System.out.println("Your payment is " + paid + "$");
double change = paid - price;
change = Math.round(change * 100) / 100.0;
int lastDigit = int ((change * 100) % 10);
if (lastDigit == 1 || change == 2) {
change = change - (lastDigit / 100.0);
} else if (lastDigit == 3 || lastDigit == 4) 
change = change + ((5 - lastDigit) / 100;
} else if (lastDigit == 6 || change == 7) {
change = change - (lastDigit / 100.0);
} else if (lastDigit == 8 || change == 9) {
change = change + ((10 - lastDigit) / 100.0);
}
System.out.println(" Your Change is " + change);
int num100 = (int) (change / 100);
System.out.println(num100 + " X 100$ ");
change = change - num100;
int num50 = (int) (change / 100);
System.out.println(num50 + " X 50$ ");
change = change - num50;
int num20 = (int) (change / 20);
System.out.println(num20 + " X 20$ ");
change = change - num20;
int num10 = (int) (change / 10);
System.out.println(num10 + " X 10$ ");
change = change - num10;
int num5 = (int) (change / 5);
System.out.println(num5 + " X 5$ ");
change = change - num5;
int num2 = (int) (change / 2);
System.out.println(num2 + " X 2$ ");
change = change - num2;
int num1 = (int) (change / 1);
System.out.println(num1 + " X 1$ ");
change = change - num1;
int num025 = (int) (change / 0.25);
System.out.println(num025 + " X 0.25 ");
change = change - num025;
int num010 = (int) (change / 0.25);
System.out.println(num010 + " X 0.10 ");
change = change - num010;
int num05 = (int) (change / 0.05);
System.out.println(num05 + " X 0.05 ");
change = change - num05;
}
}
