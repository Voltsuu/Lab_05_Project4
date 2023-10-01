import java.util.Scanner;

 class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int age = 0;

        System.out.println("Please enter in your age.");
        if (scan.hasNextInt());
        age = scan.nextInt();
        if (age >= 21){
            System.out.println("You get a wristband.");
        }
    }
}