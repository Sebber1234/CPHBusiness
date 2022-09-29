import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type your name: ");
        String name = scan.nextLine();

        System.out.println("Hello " + name);
        System.out.print("Please type your age: ");
        int age = scan.nextInt();
        int retirementAge =  67-age;
        if(retirementAge < 0){
            System.out.println("Name: " + name + ". Age: " + age + ". You retired " + Math.abs(retirementAge) + "years ago.");
            return;
        }
        System.out.println("Name: " + name + ". Age: " + age + ". How long to till retirement: " + retirementAge + ".");

    }
}
