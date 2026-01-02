package AmitItjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class WorkJan2 {

    public static void main(String[] args) {

        List<Integer> l  = new ArrayList();
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);
        l.add(55);
        List result = new ArrayList();

        Predicate<Integer> p = age->age>5;
      System.out.println(p.test(20));

//      Consumer<Integer> s = age->{
//          if (age>18){
//              result.add(age);
//          }
//      };
//     l.forEach(s);
//      System.out.println(result);

        System.out.println("by using the stream api for Consumer");
   l.stream().forEach(age-> {
                                if (age > 18)
                                    result.add(age);
                                });

   System.out.println(result);
      System.out.println("by using the stream api for predicates");

    List dd= l.stream().filter(age -> age > 18).toList();
    System.out.println(dd);












    }

}
