package Java8Features;


import java.util.Arrays;

class RR {
    public static void main(String[] args) {

        funn ss = (int age) -> age>18;

Boolean result= ss.m1(10);
System.out.println(result);
    }
}
interface funn{

    boolean m1(int age);
}

//class  SS implements funn{
//
//    @Override
//    public boolean m1(int age) {
//        if(age>18){
//            return true;
//        }
//        else
//            return false;
//
//    }
//
//}






