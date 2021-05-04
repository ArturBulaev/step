import java.util.Scanner;

public class klass {

    public static void main(String[] args) {
        System.out.println("введите первое число");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("введите процент");
        double b = new Scanner(System.in).nextDouble();
        double result = a * b / 100;


        if (b > 100) {
            System.out.println("неверно");
        } else {
            System.out.println(result);
        }

    }
}
