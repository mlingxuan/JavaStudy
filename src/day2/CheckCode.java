package day2;
import java.util.Arrays;
public class CheckCode {
    public static void main(String[] args) {
        gen("690123456789");
    }

    public static int gen(String code) {
        //char[] newcode = code.toCharArray();
        char[] newcode = code.charAt();
        //将13位的字符串分割成单个字符
        int[] newArr = new int[12];
        //将前12未遍历生成新的int型数组
        for (int i = 0; i < 12; i++) {
            newArr[i] = (int) newcode[i];
        }
        System.out.println(newArr[1]);
        //取奇位数求和
        int jishusum = 0;
        int oushusum = 0;
        for (int j = 0; j < 12; j += 2) {
            jishusum = jishusum + newArr[j];
        }
        //偶数求和
        for (int h = 1; h < 12; h += 2) {
            oushusum = oushusum + newArr[h];
        }
        //奇数和+偶数和的三倍
        int jishu_oushu_sum = jishusum + oushusum * 3;
        //取结果个位数
        int geshu = jishu_oushu_sum % 10;
        //求第13位验证码
        int thirteen_code = 10 - geshu;
        if (thirteen_code == 10) {
            System.out.println(0);
            return 0;
        } else {
            System.out.println(thirteen_code);
            return thirteen_code;
        }

    }
}
