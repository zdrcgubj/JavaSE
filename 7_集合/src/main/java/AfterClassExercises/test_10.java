package AfterClassExercises;

import java.util.*;

/**
 * @author Liu
 * @create 2022-10-17-20:17
 * @description:
 */
public class test_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("请选择操作:");
            System.out.println("1 查看年份对应球队夺冠情况:");
            System.out.println("2 查看球队夺冠年份:");
            System.out.println("0 退出:");
            HashMap<String, String[]> map = createMap();
            String next = in.next();

            if(String.valueOf(next.charAt(0)).matches("[az]")){
                next="-1";
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
                    victoryYears(team,map);
                    break;
                default:
                    System.out.println("输入不合法,请重新输入");
            }
        }
    }

    public static void victoryYears(String team,HashMap<String,String[]> map) {
        Set<Map.Entry<String, String[]>> entries = map.entrySet();
        Iterator<Map.Entry<String, String[]>> iterator = entries.iterator();

        boolean isFlag=false;
        int count=0;
        while (iterator.hasNext()){
            Map.Entry<String, String[]> next = iterator.next();
            if(team.equals(next.getValue()[1])){
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

    public static <T> void getVictory(String year, HashMap<String, String[]> map) {
        boolean isFlag = false;
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            if (year.equals(s)) {
                isFlag = true;
                System.out.println(s + "年世界杯冠军是" + map.get(s)[1]);
                break;
            }
        }
        if (!isFlag) {
            System.out.println("该年没有举办世界杯!");
        }
    }

    public static HashMap<String, String[]> createMap() {
        HashMap<String, String[]> map = new HashMap<>();
        //map.put("年份",new String[]{"届数","冠军"});
        map.put("1930", new String[]{"1", "乌拉圭"});
        map.put("1934", new String[]{"2", "意大利"});
        map.put("1938", new String[]{"3", "意大利"});
        map.put("1950", new String[]{"4", "乌拉圭"});
        map.put("1954", new String[]{"5", "德国"});
        map.put("1958", new String[]{"6", "巴西"});
        map.put("1962", new String[]{"7", "巴西"});
        map.put("1966", new String[]{"8", "英格兰"});
        map.put("1970", new String[]{"9", "巴西"});
        map.put("1974", new String[]{"10", "德国"});
        map.put("1978", new String[]{"11", "阿根廷"});
        map.put("1982", new String[]{"12", "意大利"});
        map.put("1986", new String[]{"13", "阿根廷"});
        map.put("1990", new String[]{"14", "德国"});
        map.put("1994", new String[]{"15", "巴西"});
        map.put("1998", new String[]{"16", "法国"});
        map.put("2002", new String[]{"17", "法国"});
        map.put("2006", new String[]{"18", "法国"});
        return map;
    }
}

