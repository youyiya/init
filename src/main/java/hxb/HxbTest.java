package hxb;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.net.MalformedURLException;

/**
 * Created by Cuiping.ma on 2019/9/7 8:15 下午
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HxbTest {

    @BeforeClass
    public static void beforeSet(){
        Settings.getInstance();
    }

    @Test
    public void test00() {
        Case.welcome();
    }

    @Test
    public void test01() {
        Case.login("13552360596", "11111mcp");
    }

    @Test
    public void test02() {
        Case.setGesturePassword();
    }

    @AfterClass
    public static void tearDown() {
        Settings.driver.quit();
    }
}
