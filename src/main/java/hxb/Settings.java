package hxb;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Settings {

    public static AndroidDriver driver=null;
    private Settings() {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability("platformName","android");
        dc.setCapability("deviceName","demo");
        dc.setCapability("appPackage","com.hoomsun.hxb");
        dc.setCapability("appActivity",".module.welcome.WelcomeActivity");
        dc.setCapability("noReset","true");
        URL remoteUrl = null;
        try {
            remoteUrl = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            System.out.println("初始化异常");
            e.printStackTrace();
        }
        driver = new AndroidDriver(remoteUrl, dc);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    private static Settings settings=new Settings();

    public static Settings getInstance(){
        return settings;
    }

//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities dc=new DesiredCapabilities();
//        dc.setCapability("platformName","android");
//        dc.setCapability("deviceName","demo");
//        dc.setCapability("appPackage","com.hoomsun.hxb");
//        dc.setCapability("appActivity",".module.welcome.WelcomeActivity");
//        dc.setCapability("noReset","true");
//        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
//        driver = new AndroidDriver(remoteUrl, dc);
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//    }
}
