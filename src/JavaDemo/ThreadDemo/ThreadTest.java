package JavaDemo.ThreadDemo;

/**
 * Created by w18805 on 2018/09/11.
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadRunable t = new ThreadRunable();
        new Thread(t, "甲").start();
        new Thread(t, "乙").start();
        new Thread(t, "丙").start();
        new Thread(t, "丁").start();
    }

}
