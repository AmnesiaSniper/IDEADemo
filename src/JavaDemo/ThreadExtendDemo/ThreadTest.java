package JavaDemo.ThreadExtendDemo;

/**
 * Created by w18805 on 2018/09/11.
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadExtend t = new ThreadExtend();
        new Thread(t, "甲").start();
        new Thread(t, "乙").start();
        new Thread(t, "丙").start();

        ThreadExtend te = new ThreadExtend();
        new Thread(te, "丁").start();
    }
}
