package JavaDemo.ThreadExtendDemo;

/**
 * Created by w18805 on 2018/09/11.
 */
public class ThreadExtend extends Thread {
    int Total = 100;

    public void run() {
        while (Total > 0) {
            synchronized (this) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (Total > 0) {
                System.out.println(Thread.currentThread().getName() + " To " + Total);
                Total--;
            }
        }
    }
}
