import java.time.Clock;

/**
 * Created by w18805 on 2017-11-30.
 */
public class Demo_20171130 {
    public static void main(String args[]) {
        System.out.println("helloword");
        testA(2, 7);
        testB();
    }

    public static void testA(int a, int b) {
        System.out.println(a * b);
    }

    public static void testB(){
        String s="helloword!";
        String a=s.substring(3);
        String b=s.substring(3,6);
        System.out.println(a+" "+b);
    }
}
