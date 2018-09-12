import java.util.Scanner;

/**
 * Created by w18805 on 2018-7-2.
 */
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j,sum=0;
      System.out.println("请输入三个整数：");
      for (int i=0;i<3;i++){
j=sc.nextInt();
sum = j+sum;

      } System.out.println(sum);
    }
}
