import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số.\n" +
                "\n" +
                "2. Kiểm tra số nguyên tố.\n" +
                "\n" +
                "3 .Kiểm tra một số có chia hết cho 3 không.\n" +
                "\n" +
                "4. Thoát");
        System.out.print("Hãy nhập tính năng cần dùng: ");
        int choise = sc.nextInt();
        switch (choise) {
            case 1: {
                System.out.print("Số bạn muốn kiểm tra chẵn lẻ là: ");
                int number = sc.nextInt();
                if (number % 2 == 0) {
                    System.out.printf("%d là số chẵn.", number);
                } else {
                    System.out.printf("%d là số lẻ.", number);
                }
            }
            case 2: {
                System.out.print("Số bạn muốn kiểm tra số nguyên tố là: ");
                int number = sc.nextInt();
                boolean isPrime  = true;
                for (int i = 2; i < Math.sqrt(number); i++) {
                    if(number % i == 0) {
                        isPrime = false;
                    }
                }
                if(isPrime) {
                    System.out.printf("%d là số nguyên tố.", number);
                } else {
                    System.out.printf("%d không phải là số nguyên tố.", number);
                }
             }
            case 3: {
                System.out.print("Số bạn muốn kiểm tra là: ");
                int number = sc.nextInt();
                if (number % 3 == 0) {
                    System.out.printf("%d là số chia hết cho 3.", number);
                } else {
                    System.out.printf("%d không phải là số chia hết cho 3.", number);
                }
            }
        }
    }
}
