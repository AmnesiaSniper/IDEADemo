/**
 * Created by w18805 on 2018-6-28.
 */

import java.util.*;

public class test1 {
    public static void main(String[] args){
        Random rand = new Random();
        int sum2 = 0,sum3 = 0,sum4 = 0,sum5 = 0,sum6 = 0,sum7 = 0,sum8 = 0,sum9 = 0,sum10 = 0,sum11 = 0,sum12 = 0;
        int sum = 0;
        for (int i = 0; i < 10000; i++){
            int a = rand.nextInt(6) + 1;
            int b = rand.nextInt(6) + 1;
            System.out.print("(" + a + "," + b + ")");
            sum = a + b;
            if(sum == 2)
                sum2+=1;
            if(sum == 3)
                sum3+=1;
            if(sum == 4)
                sum4+=1;
            if(sum == 5)
                sum5+=1;
            if(sum == 6)
                sum6+=1;
            if(sum == 7)
                sum7+=1;
            if(sum == 8)
                sum8+=1;
            if(sum == 9)
                sum9+=1;
            if(sum == 10)
                sum10+=1;
            if(sum == 11)
                sum11+=1;
            if(sum == 12)
                sum12+=1;
        }
        System.out.println();
        System.out.println("和为2的次数： " + sum2 + ", 概率为: " + ((double)sum2/10000));
        System.out.println("和为3的次数： " + sum3+ ", 概率为: " + ((double)sum3/10000));
        System.out.println("和为4的次数： " + sum4+ ", 概率为: " + ((double)sum4/10000));
        System.out.println("和为5的次数： " + sum5+ ", 概率为: " + ((double)sum5/10000));
        System.out.println("和为6的次数： " + sum6+ ", 概率为: " + ((double)sum6/10000));
        System.out.println("和为7的次数： " + sum7+ ", 概率为: " + ((double)sum7/10000));
        System.out.println("和为8的次数： " + sum8+ ", 概率为: " + ((double)sum8/10000));
        System.out.println("和为9的次数： " + sum9+ ", 概率为: " + ((double)sum9/10000));
        System.out.println("和为10的次数： " + sum10+ ", 概率为: " + ((double)sum10/10000));
        System.out.println("和为11的次数： " + sum11+ ", 概率为: " + ((double)sum11/10000));
        System.out.println("和为12的次数： " + sum12+ ", 概率为: " + ((double)sum12/10000));
        System.out.println("测试时间： " + new Date());

    }
}
