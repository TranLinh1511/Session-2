public class Baitap5 {
    public static void main(String[] args) {
        int n = 1;
        boolean flag = true;
        while (flag) {
            n++;
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                System.out.print("number: " + n);
                flag = false;
            }
        }
    }
}
