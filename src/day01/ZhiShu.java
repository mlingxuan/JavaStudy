package day01;

//1-100的质数（素数）
public class ZhiShu {

    public static void main(String[] args) {
        boolean num = true;
        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    //num = false;
                    break;

                }
                if (num) {
                    System.out.println(i);
                }

            }

        }

    }
}
