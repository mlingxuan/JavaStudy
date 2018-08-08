package day01;

//36人搬36块砖，男人一次4块，女人一次3块，儿童两人1块，刚好一次搬完
public class BanZhuan {
    public static void main(String[] args) {
        for (int men = 1; men <= 9; men++) {
            for (int women = 1; women <= 12; women++) {
                for (int children = 1; children <= 72; children++) {
                    if (4 * men + 3 * women + children / 2 == 36 & men + women + children == 36 & children % 2 == 0) {
                        System.out.println("男：" + men + "人\t" + "女:" + women + "人\t" + "儿童:" + children + "人");
                    }

                }
            }
        }
    }
}
