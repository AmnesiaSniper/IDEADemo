import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by w18805 on 2018-1-29.
 */
public class CallClick {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("周庆");
        list.add("吴齐秦");
        list.add("濮燕萍");
        list.add("兰昆");
        list.add("陈诚");
        list.add("黄金涛");
        list.add("朱华");
        list.add("邓峰辉");
        list.add("陈勇");

        // 初始化随机数
        Random rand = new Random();

        int s = rand.nextInt(list.size());
        Object re = list.get(s);
        System.out.println(re);
    }
}

