package junit4test;

import junit4test.BuyTest;
import junit4test.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Cuiping.ma on 2019/10/19 11:23 下午
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {LoginTest.class,
        BuyTest.class}

)
public class SuitTest {
}
