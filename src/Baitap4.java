public class Baitap4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && count <=20) {
                System.out.printf("%d là số nguyên tố", i);
                count++;
                System.out.println();
            }
        }
    }
}
