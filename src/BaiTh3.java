import java.util.Scanner;

public class BaiTh3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm muốn tính: ");
        int y = sc.nextInt();
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println(y + " là năm nhuận");
                } else {
                    System.out.println(y + " không phải là năm nhuận");
                }
            } else {
                System.out.println(y + "là năm nhuận");
            }
        } else {
            System.out.println(y + " không phải là năm nhuận");
        }
    }
}
