package Day3_7.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

interface Hello {
    void hello(int x, int y);
}

class HelloImpl {

    public HelloImpl(String say) {
        System.out.println(say);
    }

    public HelloImpl(int i, int i1) {
        System.out.println(i);
        System.out.println(i1);
    }


    public void hello(int x, int y) {
        System.out.println("Say hello");
    }
}

interface Hello2 {
    int hello(int x, int y);
}

interface Hello3{
    void hello(int x);
}

interface Hello4 {
    void hello();
}

@FunctionalInterface
 interface MRInterface { String timXY(int x, int y,int z); }

 class Service {
    public static String tinhTong(int x, int y) {
        return String.valueOf(x+y);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        String z = toDo(x, y, Service::tinhTong);
        System.out.println(z);
    }

     private static String tinhTong(int i, int i1, int i2) {
        return String.valueOf(i+i1+i2);
     }

     public static String toDo(int x, int y, MRInterface s) {
        return  String.valueOf(s.timXY(x, y,10));
    }
}

public class Lambda {

    public static void main(String[] args) {
        Hello h = HelloImpl::new;
        h.hello(10,20);
    }
}

