package com.daysWork;

import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-26-20:30
 * @description:
 */
public class 文字游戏 {
    //角色攻击的方法
    public static double attack(double enemyBloodV, double attack, double enemyDefense) {
        //敌方受到伤害=我方攻击力-敌方防御力
        double realDamage = attack - enemyDefense;
        //地方血量减少
        enemyBloodV -= realDamage;
        System.out.println("此次攻击造成" + realDamage + "点伤害");
        // System.out.println("敌方血量剩余" + enemyBloodV);

        return realDamage;

    }

    //敌方攻击的方法
    public static double enemyAttack(double bloodVolume, double enemyAttack, double Defense) {
        //角色受到伤害=敌方攻击力-角色防御力
        double realDamage = enemyAttack - Defense;
        //地方血量减少
        bloodVolume -= realDamage;
        System.out.println("此次攻击受到" + realDamage + "点伤害");
        System.out.println("角色血量剩余" + bloodVolume);

        return bloodVolume;

    }

    //购买装备的方法
    public static void getMateriel(double equimentAttack, String equimentType, double attack) {
        System.out.println("你购买的装备是" + equimentType);
        System.out.println("现在的攻击力是" + (equimentAttack + attack));
    }

    //购买宝石的方法
    public static void getGem(double bloodVolume, double gemType) {

    }

    public static void main(String[] args) {
        //角色属性
        double bloodVolume = 100;
        double attack = 120;
        double defense = 100;
        //敌人属性
        double enemyBlood = 200;
        double enemyAttack = 120;
        double enemyDefense = 80;

        //伤害量
        double damageTotal = 0;
        //角色真实造成的伤害
        double realDamage = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("1.攻击");
        System.out.println("2.逃跑");

        w:
        while (true) {
            int option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("=======================");
                    //敌方血量剩余
                    realDamage = attack(enemyBlood, attack, enemyDefense);
                    enemyBlood -= realDamage;
                    System.out.println("敌人血量剩余" + enemyBlood);
                    damageTotal += realDamage;
                    System.out.println("------------------------");
                    //角色血量剩余
                    bloodVolume = enemyAttack(bloodVolume, enemyAttack, defense);
                    if (bloodVolume <= 0) {
                        System.out.println("你阵亡了！,游戏结束");
                        break w;
                    }
                    if (enemyBlood <= 0) {
                        System.out.println("战斗胜利，请选择");
                        enemyBlood = 200;
                        enemyAttack = 120;
                        enemyDefense = 80;
                        System.out.println("1.攻击");
                        System.out.println("2.逃跑");
                    }
                    break;
                case 2:
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("敌人血量回复");
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&");
                    //回复量等于本轮攻击受到的伤害
                    enemyBlood += damageTotal;
                    System.out.println(enemyBlood);
                    //伤害总计归零
                    damageTotal = 0;

            }
        }
    }


}
