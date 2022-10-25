package DailyWork;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Liu
 * @create 2022-10-20-20:34
 * @description:
 */
public class test_17 {
    @Test
    public void test1() {
        HashMap<String, String> map = getValue();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("请选择操作:");
            System.out.println("1 查看年份对应球队夺冠情况:");
            System.out.println("2 查看球队夺冠年份:");
            System.out.println("0 退出:");
            String next = in.next();

            if(String.valueOf(next.charAt(0)).matches("[AZaz]")){
                next="111";
            }

            int option=Integer.parseInt(next);
            if(option==0){
                break;
            }

            switch (option) {
                case 1:
                    System.out.println("请输入年份:");
                    String year = in.next();
                    getVictory(year, map);
                    break;
                case 2:
                    System.out.println("请输入球队名:");
                    String team = in.next();
                    victoryYears(team, map);
                    break;
                default:
                    System.out.println("输入不合法,请重新输入");
            }
        }
    }
    public static <T> void getVictory(String year, HashMap<String, String> map) {
        boolean isFlag = false;
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            if (year.equals(s)) {
                isFlag = true;
                System.out.println(s + "年世界杯冠军是" + map.get(s));
                break;
            }
        }
        if (!isFlag) {
            System.out.println("该年没有举办世界杯!");
        }
    }

    public static void victoryYears(String team,HashMap<String,String> map) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        boolean isFlag=false;
        int count=0;
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            if(team.equals(next.getValue())){
                isFlag=true;
                if(count<1)
                    System.out.print(team+"球队夺冠的年份列表为:");
                System.out.print(next.getKey()+"\t");
                count++;
            }
        }
        if(!isFlag){
            System.out.println("该球队没获得过世界杯");
        }else {
            System.out.println();
        }
    }

    public static HashMap<String,String> getValue() {
        String path = "src/main/java/DailyWork/";
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path + "worldcup.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                //存入map
                map.put(line.substring(0,4),line.substring(5));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        return map;
    }

}
