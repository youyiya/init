package junit4test;

import junit4test.BaseTest;
import org.junit.Test;

/**
 * Created by Cuiping.ma on 2019/10/19 11:25 下午
 */
public class BuyTest extends BaseTest {
    @Test
    public void buy(){
        if (m.get("login").equals("youyi")){
            System.out.println("登录成功，可以购买");
        }else {
            System.out.println("未登录，请先登录");
        }
        System.out.println("buying....");
    }
}
