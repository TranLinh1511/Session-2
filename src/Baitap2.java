import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // hình chữ nhật
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        // hình tam giác vuông
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // hình tam giác vuông có góc vuông ở top left
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
