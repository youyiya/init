package hxb;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Cuiping.ma on 2019/9/7 8:15 下午
 */
public class Common {

    private static Logger logger= LoggerFactory.getLogger(Common.class);
//左滑
    public static void moveToLeft(AppiumDriver driver, int width, int height) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(width / 2, height * 3 / 4))
                .moveTo(PointOption.point(width / 3, height * 3 / 4))
                .release();
    }
//右划
    public static void moveToRight(AppiumDriver driver, int width, int height) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.moveTo(PointOption.point(width / 2, height * 3 / 4))
                .moveTo(PointOption.point(width * 3 / 4, height * 3 / 4));
    }
//上划
    public static void moveToUp(AppiumDriver driver, int width, int height) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.moveTo(PointOption.point(width / 2, height * 3 / 4))
                .moveTo(PointOption.point(width * 3 / 4, height / 3))
                .perform();
    }
//下划
    public static void moveToDown(AppiumDriver driver, int width, int height) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.moveTo(PointOption.point(width / 2, height / 2))
                .moveTo(PointOption.point(width * 3 / 4, height / 3))
                .perform();
    }
//    判断元素是否存在
    public static boolean isElementExit(AndroidDriver driver, By by){

        try {
            if (driver==null){
                logger.warn("driver对象为空，请检查代码");
            }
//            assert driver != null;
            driver.findElement(by);
            logger.info("找到当前元素"+by.toString());
            return true;
        }catch (NoSuchElementException e){
            logger.warn("找不到当前元素"+by.toString());
            return false;
        }

    }
    @Test
    public void restr(){
        char [] a ={'a','b','c','d'};
        String stra=new String(a);
        stra.trim();//去除字符串两端的空格
        System.out.println(stra.charAt(2));
        System.out.println(stra.compareTo("asd"));
        assert stra.equals("abcd") ;
        logger.info("测试通过");
        StringBuffer sb=new StringBuffer("dfff,dddd");
        sb.append(3);
        System.out.println(sb);
        List list=new ArrayList();
        list.add("df");
        list.add(22);
        Iterator i=list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
