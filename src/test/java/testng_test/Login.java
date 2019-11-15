package testng_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Cuiping.ma on 2019/10/20 3:42 下午
 */
public class Login {
    private static Logger logger= LoggerFactory.getLogger(Login.class);
    public static boolean isLogin=false;
    public String login(String userName,String password){
        if (userName.equals("")||userName==""||password.equals("")||userName==""){

            logger.error("用户名或密码不正确");
            return "用户名或密码不能为空";
        }
        else if (userName.equals("admin")&&password.equals("admin")){
            logger.info("管理员登录");
            isLogin=true;
            return "欢迎,管理员";
        }else {
            logger.info("普通用户登录");
            return "欢迎,"+userName;
        }

    }
}
