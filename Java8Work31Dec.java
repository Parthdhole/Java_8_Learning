package Java8Features;

import java.util.Calendar;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8Work31Dec {


    public static void main(String[] args) {


        Consumer<Integer> con =(amount)->System.out.println("rupee "+ amount*90);
       AA aa = ()-> Calendar.getInstance().getWeekYear();

        System.out.println(aa.accept());
       con.accept(100);
        Predicate<Integer> p = age->age>18;
        System.out.println(p.test(55));
    }

}
interface  AA{
    int accept();
}




