package junit4test;

import junit4test.BaseTest;
import org.junit.Test;

/**
 * Created by Cuiping.ma on 2019/10/19 11:25 下午
 */
public class LoginTest extends BaseTest {
    @Test
    public void login(){
        m.put("login","youyi");
        System.out.println("logining....");
    }
}
