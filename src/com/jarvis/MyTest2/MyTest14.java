package com.jarvis.MyTest2;

import java.util.*;

/**
 * Created by Neuedu on 2020/2/13.
 */
public class MyTest14 {
    public static void main(String[] args) {
        /**
         *  狼人杀发牌器
         *
         *  游戏人数  12~18范围之内
         *
         * */
        System.out.println("请输入玩家人数:");
        Scanner scanner = new Scanner(System.in);
        // 接收游戏人数
        int player = scanner.nextInt();
        if(player>18||player<12){
            System.out.println("不符合游戏人数");
        }else{
            /**
             *  符合游戏人数后  进行发牌
             *
             *  定义3个list
             *  1 发牌的列表
             *  2 发完牌的列表
             *  3 底牌列表
             *
             * */
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> di = new ArrayList<>();
            init(all);
            pai(all,player);
            // 盗贼一定在游戏的牌中  总牌中移除盗贼 放入游戏牌中
            all.remove("盗贼");
            play.add("盗贼");
            dipai(all,di);
            // 将放完底牌的总牌 全部放入游戏牌中
            play.addAll(all);
            // 将游戏牌 打乱顺序 (洗牌)
            Collections.shuffle(play);
            System.out.println("玩家手牌为:"+play);
            System.out.println("盗贼底牌为:"+di);
        }
    }
    // 游戏初始化 12个人
    public static void init(List<String> list){
        // 循环添加 4个狼人
        for(int i = 0 ;i<4;i++){
            list.add("狼人");
        }
        // 循环添加 4个村民
        for(int i = 0 ;i<4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    // 根据不同的游戏人数 初始化不同的牌
    public static void pai(List<String> list,int player){
        if(player>12)
            list.add("村民");
        if(player>13)
            list.add("替罪羊");
        if(player>14)
            list.add("狼人");
        if(player>15)
            list.add("村民");
        if(player>16)
            list.add("村民");
        if(player>17)
            list.add("吹笛者");
    }
    // 从总牌中 随机拿出3个底牌来
    public static void dipai(List<String> list,List<String> di){
        // 狼人数应当小于等于1
        while(di.size()<3){
            // 取list的一个随机下标
            Random random = new Random();
            int index = random.nextInt(list.size());
            if(di.contains("狼人")&&list.get(index).equals("狼人"))
                continue;
            else
                di.add(list.remove(index)) ;
        }

    }

}
