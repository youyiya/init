package junit4test;

import org.junit.*;

/**
 * Created by Cuiping.ma on 2019/10/19 11:05 下午
 */
public class JunitTest {

    @BeforeClass
    public static void setup(){
        System.out.println("setup class");
    }
    @AfterClass
    public static void teardown(){
        System.out.println("teardown class");
    }
    @Before
    public void befor(){
        System.out.println("befor");
    }
    @After
    public void after(){
        System.out.println("after");
    }
    @Test
    public void test001(){
        int a=3;
        System.out.println("test001");
    }
    @Test
    @Ignore
    public void test002(){
        System.out.println("test002");
    }
    @Test
    public void test003(){
        System.out.println("test003");
    }
}
