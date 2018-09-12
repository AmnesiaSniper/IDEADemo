package JavaDemo.Demo;

import jdk.nashorn.internal.ir.Flags;

import java.util.Scanner;

/**
 * Created by w18805 on 2018/09/11.
 */
//输入一个字符串判断是否是回文
public class Huiwen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = s.next();
        //获取字符串长度
        int l = str.length();
        System.out.println("字符串长度为：" + l);
        boolean flag = true;
        for (int m = 0, n = l - 1; n > m; m++, n--) {
            if (str.charAt(m) != str.charAt(n)) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("=========是回文=========");
        } else {
            System.out.println("=========不是回文=========");
        }
    }
}
