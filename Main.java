import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Exception handling : ");

        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend and divisor : ");
        a = sc.nextInt();
        b = sc.nextInt();

        try{
//            inside the try bock we write the code which can throw an exception
            int res = a / b;
            System.out.println("Result : "+res);
        }catch (ArithmeticException e){
//            catch block always used with the try if exception occur the catch block executed
            System.out.println("Exception occur : "+e.getMessage());
        }

        finally {
//            it is the block always run irrespective of the exception occur or not
            System.out.println("Byeee...");
        }
//        throw - it is used to throw an exception
        int age;
        System.out.println("Enter the age : ");
        age = sc.nextInt();
        if(age < 18){
            throw new RuntimeException("Sorry, your age is less than 18.");
        }
        else{
            System.out.println("Your are eligible to vote.");
        }
    }
}