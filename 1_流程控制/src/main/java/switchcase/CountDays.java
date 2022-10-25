package switchcase;

/**
 * @author Liu
 * @create 2022-06-11-12:14
 */
public class CountDays {
    public static void main(String[] args) {
        Count count=new Count();
        count.CountDays(2000, 5, 17);
    }
}
class Count{
    public void CountDays(int years, int mounth, int days) {
        int sumDays = 0;
        switch (mounth) {
            case 12:
                sumDays += 30;
                System.out.println("12:" + sumDays);
            case 11:
                sumDays += 31;
                System.out.println("11:" + sumDays);
            case 10:
                sumDays += 30;
                System.out.println("10:" + sumDays);
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                if ((0 == years % 4 && 0 != years % 100) || 0 == years % 400) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += days;
                System.out.println(sumDays);
        }

    }
}
