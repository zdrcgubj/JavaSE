package for_while;

/**
 * @author Liu
 * @create 2022-06-13-20:32
 */
public class ForFor {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + i * j + "\t");
//            }
//            System.out.println();
//        }
        System.out.println(" ====================");
        for (int i = 9; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }

//打印金字塔
        /*上部
        *      *
        *     * *
        *    *   *
        *   *     *
        *  *       *
        * *         *
        * */
        int num = 6;
        for (int i = 1; i <= num; i++) {
            for (int k = num - i; k > 0; k--) { //打印*前面的空格数
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {  //每行" "和*总数 (2i-1)
                if ((j == 1 || j == (2 * i - 1))) {  //判断每行首尾以及最后一行打印*
                    System.out.print("*");
                } else {
                    System.out.print(" "); //每行中间打印" "
                }
            }
            System.out.println();//换行
        }

        /*下部
         * *         *
         *  *       *
         *   *     *
         *    *   *
         *     * *
         *      *
         *  */
        for (int i = num-1; i > 0; i--) {
            for (int k = num - i; k > 0; k--) { //打印*前面的空格数（行数减一
                System.out.print(" ");
            }
            for (int j = (2 * i - 1); j > 0; j--) {
                if ((j == 1 || j == (2 * i - 1))) {  //判断每行首尾以及最后一行打印*
                    System.out.print("*");
                } else {
                    System.out.print(" "); //每行中间打印" "
                }
            }
            System.out.println();
        }
    }
}
