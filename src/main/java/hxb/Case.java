package hxb;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Cuiping.ma on 2019/9/7 8:15 下午
 */
public class Case {
    private static Logger logger = LoggerFactory.getLogger(Case.class);
    //启动app
    public static AndroidDriver driver = Settings.driver;
    public static int width = driver.manage().window().getPosition().getX();

    public static int height = driver.manage().window().getPosition().getY();

    public static void welcome() {

//        Common.moveToLeft(driver,width,height);
        boolean isAllow = Common.isElementExit(driver, By.id("com.android.packageinstaller:id/permission_allow_button"));
        if (isAllow) {
            driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        }
        boolean update = Common.isElementExit(driver, By.id("com.hoomsun.hxb:id/left_btn"));
        if (update) {
            driver.findElementById("com.hoomsun.hxb:id/left_btn").click();
        }
        boolean exit = Common.isElementExit(driver, By.id("com.hoomsun.hxb:id/tab_home"));
        if (exit) {
            logger.info("启动app成功");
        } else {
            logger.info("启动app失败");
        }
//        WebDriverWait webDriverWait=new WebDriverWait(driver,5);

    }

    //登录
    public static void login(String mobile, String password) {
//        boolean exit = Common.isElementExit(driver, By.id("com.hoomsun.hxb:id/homeLoginTextView"));
        if (driver.findElementById("com.hoomsun.hxb:id/homeLoginTextView").getText().equals("立即注册")) {
            driver.findElementById("com.hoomsun.hxb:id/homeLoginTextView").click();
            driver.findElementById("com.hoomsun.hxb:id/register_tologin").click();
            driver.findElementById("com.hoomsun.hxb:id/login_userName").clear();
            driver.findElementById("com.hoomsun.hxb:id/login_userName").sendKeys(mobile);
            driver.findElementById("com.hoomsun.hxb:id/login_password").sendKeys(password);
            driver.findElementById("com.hoomsun.hxb:id/login_button").click();
            boolean isHome = Common.isElementExit(driver, By.id("com.hoomsun.hxb:id/tab_home"));
            if (isHome) {
                logger.info(mobile + "登录成功");
            } else {
                logger.info(mobile + "登录失败");
            }
        } else {
            logger.info("已经是登录状态");
        }

    }
    //注册


    //充值

    //提现

    //购买计划


    //修改登录密码


    //设置手势密码

    public static void setGesturePassword() {

        driver.findElementById("com.hoomsun.hxb:id/tab_user").click();
        driver.findElementById("com.hoomsun.hxb:id/user_account").click();
        driver.findElementById("com.hoomsun.hxb:id/account_safe").click();
        boolean exit=Common.isElementExit(driver,By.id("com.hoomsun.hxb:id/notify_login_password"));
        logger.info("是否已经设置了手势密码："+exit);
        if (!exit) {
            //打开手势密码
//            driver.findElementByClassName("android.widget.Switch").click();
//            driver.findElementByXPath("//*[@text='OFF']").click();
            driver.findElementById("com.hoomsun.hxb:id/edit_loginPass").sendKeys("11111mcp");
            driver.findElementById("com.hoomsun.hxb:id/submit_btn").click();
            driver.findElementById("com.hoomsun.hxb:id/gestureUnlock");
            new TouchAction(driver).moveTo(PointOption.point(362, 1070))
                    .moveTo(PointOption.point(725, 1070))
                    .moveTo(PointOption.point(1080, 1070))
                    .moveTo(PointOption.point(1080, 1430))
                    .moveTo(PointOption.point(1080, 1780));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new TouchAction(driver).moveTo(PointOption.point(362, 1070))
                    .moveTo(PointOption.point(725, 1070))
                    .moveTo(PointOption.point(1080, 1070))
                    .moveTo(PointOption.point(1080, 1430))
                    .moveTo(PointOption.point(1080, 1780));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new TouchAction(driver).moveTo(PointOption.point(362, 1070))
                    .moveTo(PointOption.point(725, 1070))
                    .moveTo(PointOption.point(1080, 1070))
                    .moveTo(PointOption.point(1080, 1430))
                    .moveTo(PointOption.point(1080, 1780));

            if (driver.findElementById("com.hoomsun.hxb:id/homeLoginTextView").getText().equals("立即出借")){
                logger.info("设置手势密码成功");
            }

        } else {
            //修改手势密码
        }
    }
    //修改手势密码

    public static void resetGesturePassword() {

    }

}
