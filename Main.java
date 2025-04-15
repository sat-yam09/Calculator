import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String Operators;
        Double first;
        Double second;
        System.out.print("Enter the first value: ");
        first = sc.nextDouble();
        System.out.println("Choose Operators: *,/,+,- ");
        Operators = sc.next();
        System.out.print("Enter the second value: ");
        second = sc.nextDouble();
        switch (Operators){
            case "*" -> System.out.println(first*second);
            case "/" -> System.out.println(first/second);
            case "-" -> System.out.println(first-second);
            case "+" -> System.out.println(first+second);
            default -> System.out.println("InvalidOperator");
        }
    }
}