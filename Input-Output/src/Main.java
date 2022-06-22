import java.util.Scanner;
public class Main {
    public static void getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your age please");
        int age = scanner.nextInt();
        if (age<18) {
            System.err.println("Not valid, get older");
            getAge();
        } else {
            System.out.println("That is a valid age with our local laws");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hell user");
        System.out.println("What is your name?");
        //Create a scanner object
        Scanner scanner = new Scanner(System.in);
        //Use the scanner object to parse an input
        String name = scanner.nextLine();
        if (name.length()<4) {
            System.out.println("What a short name!");
        } else if (name.length() >= 4 && name.length() < 8) {
            System.out.println("What a normal name!");
        } else if (name.length()>7){
            System.out.println("Woow that is so looooong!");
        }
        getAge();
        System.out.println("What is your favourite color? (red, blue, green or yellow");
        String favColor = scanner.nextLine();
        switch (favColor) {
            case "red":
                System.out.println("You like fire");
                break;
            case "blue":
                System.out.println("You like the sea");
                break;
            case "green":
                System.out.println("You like the grass");
                break;
            case "yellow":
                System.out.println("You like the desert");
                break;
            default:
                System.out.println("Naughty user, that color was not in the list");
        }
    }
}