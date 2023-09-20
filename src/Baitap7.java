import java.util.Scanner;

import static java.lang.Math.PI;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Tính chu vi và diện tích hình chữ nhật .\n" +
                "\n" +
                "2. Tính chu vi và diện tích hình tam giác\n" +
                "\n" +
                "3. Tính chu vi và diện tích hình tròn.\n" +
                "\n" +
                "4. Thoát");

        System.out.print("Nhập chức năng bạn muốn dùng: ");
        int choise = sc.nextInt();
        switch (choise) {
            case 1: {
                System.out.print("Nhập chiều dài của hình chữ nhật: ");
                double l = sc.nextInt();
                System.out.print("Nhập chiều rộng của hình chữ nhật: ");
                double w = sc.nextInt();
                System.out.printf("Chu vi của hình chữ nhât là %d", (l + w) * 2);
                System.out.printf("Diện tích của hình chữ nhât là %d", l * w);
            }
            case 2: {
                double a, b, c;
                System.out.print("Nhập chiều dài cạnh thứ nhất của tam giác: ");
                a = sc.nextDouble();
                System.out.print("Nhập chiều dài cạnh thứ hai của tam giác: ");
                b = sc.nextDouble();
                System.out.print("Nhập chiều dài cạnh thứ ba của tam giác: ");
                c = sc.nextDouble();
                if (a <= 0 || b <= 0 || c <= 0) {
                    System.out.println("Cạnh nhập vào không được nhỏ hơn 0!!");
                } else {
                    if (a + b > c && a + c > b && b + c > a) {
                        double p = a + b + c;
                        System.out.printf("Diện tích của tam giác là: %.2f\n" +
                                        "Chu vi của tam giác là: %.2f\n\n",
                                Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c)),
                                p);
                    }
                }
            }
            case 3: {
                System.out.println("Nhập bán kính hình tròn:");
                double r = sc.nextDouble();

                System.out.printf("Diện tích của hình tròn là: %.2f\n" +
                                "Chu vi của hình tròn là: %.2f\n\n",
                        Math.pow(r, 2) * PI,
                        2 * PI * r);
                break;
            }
            case 4:
                System.out.println("Bạn đã thoát chương trình");
                break;
            default:
                System.out.printf("Không có lựa chọn %d!!! Xin hãy nhập lại.\n\n", choise);
                break;
        }

    }
}

