import java.util.Scanner;

public class gipotenuza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Для расчета гипотенузы, введите значение катетов.");
        double a, b, c;
        System.out.print("\nВведите значение a: ");
        a = input.nextDouble();
        System.out.print("Введите значение b: ");
        b = input.nextDouble();
        if (a <= 0 || b <= 0) {
            System.out.print("Значение не может быть меньше или равно нулю");
        } else {
            c = Math.sqrt(a * a + b * b);
            System.out.print("Гипотенуза: " + c);
        }

//        if (a <= 0 && b <= 0) {
//        System.out.println("Значение не может быть меньше или равно нулю");
//        } else if (a <= 0) {
//            System.out.println("Значение не может быть меньше или равно нулю");
//        } else if (b <= 0) {
//            System.out.println("Значение не может быть меньше или равно нулю");
//        } else {
//            c = Math.sqrt(a * a + b * b);
//            System.out.println("Гипотенуза: " + c);
//        }

    }
}
