import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num [] = new int [10];
        int count = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número " + count++);
            int numX = input.nextInt();
            num[i] = numX;
        }
        for (int i = 0; i < 5; i++) {
            int temp = num[i];
            num[i] = num[9 - i];
            num[9 - i] = temp;
        }
        System.out.println("_____________________________________");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + "-> " + num[i]);
        }
    }
}