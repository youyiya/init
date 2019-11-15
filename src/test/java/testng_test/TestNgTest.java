package testng_test;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Cuiping.ma on 2019/10/20 3:41 下午
 */

public class TestNgTest {

    private static Logger logger= LoggerFactory.getLogger(TestNgTest.class);
    @BeforeClass
    public void setupClass(){
        logger.info("类初始化");
    }
    @BeforeMethod
    public void setupMethod(){
        logger.info("方法初始化");
    }

    //    @Parameters({"username","pwd","expect"})
    @Test(dataProvider ="getUsers",dataProviderClass = User.class)
    @DisplayName("用户登录测试")
    public void loginTest(String username,String pwd,String expect){
        Login login=new Login();
        String user_01=login.login(username,pwd);
        Assert.assertEquals(user_01,expect);

    }

    @Test
    @DisplayName("test02测试")
    public void test02(){
        logger.info("test02测试方法");
    }

}
