package ArrayDemo._1一维数组.dailyWork1;

/**
 * @author Liu
 * @create 2022-09-27-21:00
 * @description:龙哥去参加青年歌手大奖赛,有8个评委打分,(去掉一个最高一个最低)求平均分?
 */
public class t_04评分 {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sum=0;
        int[] score = new int[]{96,66,89,63,77,89,78,99};
        for (int i = 0; i < score.length; i++) {
            max=max>score[i]?max:score[i];
            min=min>score[i]?score[i]:min;
            sum+=score[i];
        }

        System.out.println((sum-max-min)/6);
    }
}
