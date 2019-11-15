package testng_test;

import org.testng.annotations.DataProvider;

/**
 * Created by Cuiping.ma on 2019/10/20 5:32 下午
 */
public class User {
    /**
     * 提供用户登录方法数据
     * @return
     */
    @DataProvider
    public Object[][] getUsers(){
        return new Object[][]{
                {"","","用户名或密码不能为空"},
                {"youyi","","用户名或密码不能为空"},
                {"admin","admin","欢迎,管理员"},
                {"youyi","111","欢迎,youyi"}
        };
    }
}
