package demo;

/**
 * Created by Cuiping.ma on 2019/9/13 3:51 下午
 */
public class Test {
//    static int x ;
//    @org.junit.Test
//    public void go(){
//        System.out.println(x);
//    }

//    int x;
//    @org.junit.Test
//    public static void go(){
//        System.out.println(x);
//        //非静态实例变量不能被用到静态方法内；
//    }
//    static final  int x=12;
//    @org.junit.Test
//    public void go (final int x){
//        System.out.println(x);
//    }
//    int x=12;
//    @org.junit.Test
//    public static void go(final int x){
//        System.out.println(x);
//    }
    @org.junit.jupiter.api.Test
    public void intTest(){
        Integer a=100;
        Integer b=new Integer(100);
        int c=100;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        Integer d=100;
        System.out.println(a==d);
        Integer e=300;
        int f=300;
        System.out.println(e==f);


    }


}
