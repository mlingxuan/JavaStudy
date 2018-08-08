package day2;

public class WuZiQi {
    public static void main(String[] args) {
        int[] number = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(number[i] + " ");
        }
        String[] zimu = new String[]{"a", "b", "c", "d", "e", "f"};

        for (int j = 0; j < 6; j++) {
            System.out.print(zimu[j] + " ");
        }
        System.out.println();
        for (int b = 0; b < 10; b++) {
            System.out.println(number[b]);
        }
        for (int c = 0; c < 6; c++) {
            System.out.println(zimu[c]);
        }
    }
}
