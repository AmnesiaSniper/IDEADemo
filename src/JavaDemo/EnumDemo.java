package JavaDemo;

/**
 * Created by w18805 on 2018-7-4.
 * 枚举enum
 */
public class EnumDemo {
    public static void main(String[] args) {
    Drink drink = new Drink();
    drink.size = Drink.En.可乐;
        System.out.println(drink.size);
    }
    static class Drink{
         enum En{雪碧,可乐,橙汁}
        En size;
    }
}
