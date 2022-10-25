import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumDays = 0, year = 0, month = 0, day = 0;

        for (int i = 0; i < 1; i++) {

            System.out.println("请输入日期(eg:19900101)");
            String date = in.nextLine();
            // 格式判断
            if (date.length() < 8) {
                System.out.println("日期格式错误！请重新输入");
                i = -1;
                continue;
            }

            year = (Integer.parseInt(date.substring(0, 4)));
            month = (Integer.parseInt(date.substring(4, 6)));
            day = (Integer.parseInt(date.substring(6)));

            // 月份越界判断
            // 当月天数越界判断
            if (month > 12 || day > countMonth(month, year)) {
                System.out.println("日期有误，请重新输入！");
                i = -1;
            }
        }

        in.close();
        // 计算整年的天数
        for (int i = 1900; i < year; i++) {
            if (isLeapYear(i)) {
                sumDays += 366;
            } else {
                sumDays += 365;
            }
        }
        System.out.println("整年的天数：" + sumDays);

        // 计算指定月份的第一天是星期几
        int restWeek = (sumDays ) % 7;
        String whichDay = "";
        // 月份对应的天数
        int countMonth = countMonth(month, year);

        System.out.println(year + "是闰年");
        System.out.println("到" + year + "年" + month + "月" + day + "日有" + (sumDays - 1) + "天");
        System.out.println("今天是" + whichDay);
        System.out.println("本月第一天是" + restWeek);

        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
        // 打印当月日历
        for (int i = 1; i <= countMonth; i++) {
            for (int j = 0; j < restWeek; j++) {
                if (i == 1) {
                    System.out.print("\t\t");
                }
            }
            System.out.print(i + "\t\t");
            if ((i + restWeek) % 7 == 0) {
                System.out.println();
            }
        }

    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int countMonth(int month, int year) {
        int countMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                countMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                countMonth = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    countMonth = 29;
                } else {
                    countMonth = 28;
                }
        }
        return countMonth;
    }
}
