package day01;

import java.util.Scanner;

public class TaxiCost {
    public static void main(String[] args) {
        System.out.println("请输入公里数和等待时间：\n");
        Scanner input = new Scanner(System.in);
        double kiloMeters = input.nextDouble();
        int waitingTimes = input.nextInt();
        int totalCost = 0;
        //int cost1;
        //int cost2;
        if (kiloMeters > 0 && kiloMeters <= 3) {
            int cost1;
            cost1 = 10 + waitingTimes / 150;
            totalCost = cost1;
            System.out.println("您的打车费用总额为：\t" + totalCost + "元");
        } else if (kiloMeters > 3 && kiloMeters <= 15) {
            int cost2;
            double km = kiloMeters - 3;
            int actual_kilometer = (int) Math.ceil(km);//超出公里数不足1公里进1
            cost2 = (actual_kilometer * 2) + 10 + waitingTimes / 150;
            totalCost = cost2;
            System.out.println("您的打车费用总额为：\t" + totalCost + "元");
        } else if (kiloMeters > 15) {
            int cost3;
            double across15 = kiloMeters - 15;
            int kilometer3 = (int) Math.ceil(across15);
            cost3 = kilometer3 * 3 + 34 + waitingTimes / 150;
            totalCost = cost3;
            System.out.println("您的打车费用总额为：\t" + totalCost + "元");
        } else {
            System.out.println("您的输入有误");
        }
    }
}
