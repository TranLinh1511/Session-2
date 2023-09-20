import java.util.Scanner;

public class Baith2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng muốn tính ngày: ");
        int m = sc.nextInt();
        if (m <=12) {
            if (m==2) {
                System.out.println("Tháng " + m + "có 28 hoặc 29 ngày");
            } else {
                System.out.printf(m%2 == 0 ? "Tháng %d có 30 ngày": "Tháng %d có 31 ngày",m);
            }
        } else {
            System.out.println("Nhập đúng tháng xem nào.");
        }
    }
}
