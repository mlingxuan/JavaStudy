package day01;
import java.util.Scanner;
public class CheckCode {
    public static void main(String[] args) {

    }
    //检查13未校验码是否正确
    public static boolean check(String code) {
        System.out.println("请输入需要校验的13位数字：");
        Scanner scanner = new Scanner(System.in);
        code = scanner.next();
        char[] newcode = code.toCharArray();  //将13位的字符串分割成单个字符
        int[] newArr = new int[13];
        for (int i = 0; i <= 12; i++) {
            newArr[i] = (int) newcode[i];   // 将分割后的单个字符强转成int数组
            int sum_js = 0;
            int sum_os = 0;
            //求前12位奇数的和
            for (int j = 0; j <= 11; j += 2) {
                sum_js = sum_js + newArr[j];
            }
            //求前12位的偶数和
            for (int h = 1; h <= 11; h += 2) {
                sum_os = sum_os + newArr[h];
            }
            //奇数和与偶数和的3倍相加求和
            int odd_even_sum = sum_js + sum_os * 3;
            //转成字符串取最后一位
            String units_digit = String.valueOf(odd_even_sum);
            char last_number = units_digit.charAt(units_digit.length() - 1);
            //取个位数
            int check_code = (int) last_number;
            //判断个位数是否为0
            if (check_code == 0) {
                if (code.charAt(12) == check_code) {
                    return true;
//                    continue;
                }else {
                    return false;
                }
            } else {
                if (code.charAt(12) == 10 - check_code) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

//    //根据前12位条码生成第13位验证码
//    public static int theThirteenthCode(String code) {
//
//    }
}

