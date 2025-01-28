import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double result;
        System.out.println("enter the number a: ");
        double a=sc.nextDouble();
        System.out.println("enter the number b: ");
        double b=sc.nextDouble();
        System.out.println("enter operator: ");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                result=a+b;
                System.out.println("addition: "+(result));
                break;
            case '-':
                result=a-b;
                System.out.println("subtraction: "+(result));
                break;
            case '*':
            result=a*b;
            System.out.println("multiplication: "+(result));
                break;
            
            case '/' :
                result=a/b;
                System.out.println("diviision: "+(result));
                break;
            default :
            System.out.println("your operator is out of the choice:");
            break;
        }
    }
}
