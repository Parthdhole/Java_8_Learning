package AmitItjava8;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Work04Jan {
    public static void main(String[] args) {

        Employee employee  =  new Employee(111,"parth","Pune");
        Employee employee1  =  new Employee(222,"om","Mumbai");
        Employee employee2  =  new Employee(333,"pooja","Nagpur");


        List<Employee> ll1= new ArrayList<>();
        ll1.add(employee);
        ll1.add(employee1);
        ll1.add(employee2);
        Predicate<Employee> pp =i ->(i.getLocation()=="Pune");
        List<Employee> ss=ll1.stream().filter(pp).toList();
        System.out.println(ss.toString());









    }


}
