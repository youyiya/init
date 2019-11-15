package junit5test;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by Cuiping.ma on 2019/10/19 11:39 下午
 */
public class Junit5Test {
    @BeforeAll
    public static void initClass(){
        System.out.println("beforeAll");
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("afterAll");
    }
    @Test
    @DisplayName("test001测试方法")
    public void test001(){
        System.out.println("test001");
    }
    @Test
    public void test002(){
        System.out.println("test002");
    }
    @Test
    public void test003(){
        System.out.println("test003");
    }

}
