package JavaDemo.ThreadDemo;

/**
 * Created by w18805 on 2018/09/11.
 */
public class ThreadRunable implements Runnable {
    int Total = 100;

    public void run() {

        while (Total > 0) {
            synchronized (this) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断
            if (Total > 0) {
                System.out.println(Thread.currentThread().getName() + " To " + Total);
                Total--;
            }
        }

    }
}
