package JavaDemo.Demo;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * Created by w18805 on 2018/09/11.
 */
//冒泡排序法
public class Maopao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入7个数字：");
        int a[] = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i] = s.nextInt();
        }
        //排序前
        for (int arr : a) {
            System.out.print(arr + " ");
        }
        System.out.println("");
        System.out.println("----------------------");
        //从小到大排序
        int flag = 0;
        for (int m = 0; m < a.length - 1; m++) {
            for (int n = 0; n < a.length - 1 - m; n++) {
                if (a[n] > a[n + 1]) {
                    flag = a[n];
                    a[n] = a[n + 1];
                    a[n + 1] = flag;
                }
            }
        }
        //排序后
        for (int na : a) {
            System.out.print(na + " ");
        }

    }
}
