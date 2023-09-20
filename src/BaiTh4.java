import java.util.Scanner;

public class BaiTh4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double w, h, bmi;
        System.out.println("Nhập cân nặng: ");
        w = sc.nextDouble();
        System.out.println("Nhập chiều cao: ");
        h = sc.nextDouble();
        bmi = w / Math.pow(h, 2);
        if (bmi < 18.0) {
            System.out.printf("%-20.2f%s", bmi, "Underweight\n");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal\n");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight\n");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese\n");
        }
    }
}
