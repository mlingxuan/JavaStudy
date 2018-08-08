package day01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String code;
        System.out.println("请输入需要校验的13位数字：");
        Scanner scanner = new Scanner(System.in);
        code = scanner.next();
        char[] arr = code.toCharArray();//字符串拆分

        System.out.println(arr[4]);

    }

}
