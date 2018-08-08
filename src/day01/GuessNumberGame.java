package day01;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randitNum = random.nextInt(1000);
        System.out.println(randitNum);
        System.out.println("请输入0-999任意数字：");
        //方法1：
        for (int count = 0; count < 10; count++) {
            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();
            if (count == 9) {
                System.out.println("你太笨了，下次再来吧！");
                break;
            }
            if (randitNum == guessNum) {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            if (randitNum > guessNum) {
                System.out.println("猜错了，太小了");
                continue;

            }
            if (randitNum < guessNum) {
                System.out.println("猜错了，太大了");
                continue;
            }

        }
        //方法2：
 /*        while (count < 10){
            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();
            if (count == 9){
                System.out.println("你太笨了，下次再来吧！");
                break;
            }
            if (randitNum == guessNum){
                System.out.println("恭喜你，猜对了！");
                break;
            }
            if (randitNum > guessNum){
                System.out.println("猜错了，太小了");
                count++;
                continue;

            }
            if (randitNum < guessNum){
                System.out.println("猜错了，太大了");
                count++;
                continue;
            }

        }*/

    }
}
