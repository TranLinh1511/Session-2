import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min, total = 0;
        System.out.println("Nhập số bé nhất: ");
        min  = sc.nextByte();
        System.out.println("Nhập số lớn nhất: ");
        max  = sc.nextByte();
        for (int i = min; i < max; i++) {
            if(i %2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
