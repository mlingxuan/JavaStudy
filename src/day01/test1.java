package day01;

public class test1 {
    public static int gen(String str){
        if (str==null || str.length()<12){
            return -1;
        }
        int jishu = 0;
        int oushu = 0;
        for (int i=0; i<12; ++i){
            if (i%2 == 0){
                jishu = jishu + ((int)str.charAt(i)-'0');
            } else {
                oushu = oushu + ((int)str.charAt(i)-'0');
            }
        }
        int sum = jishu + oushu * 3;
        int last = sum % 10;
        return  (10 - last);
    }

    public static boolean check(String str){
        if (str==null || str.length()<13){
            return false;
        }
        String str1 = str.substring(0, 12);
        int last = gen(str1);
        int last1 = str.charAt(12) - '0';
        if (last ==  last1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check("6901234567892"));
    }
}
