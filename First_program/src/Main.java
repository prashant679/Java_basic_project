import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double height;
        double width;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area of a Rectangle is " + area + "cm²");

        scanner.close();

    }

}
