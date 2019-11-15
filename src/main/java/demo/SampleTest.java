package demo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

    public class SampleTest {

        private AndroidDriver driver;

        @Before
        public void setUp() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("deviceName", "demo");
            desiredCapabilities.setCapability("appPackage", "com.hoomsun.hxb");
            desiredCapabilities.setCapability("appActivity", ".module.welcome.WelcomeActivity");
            desiredCapabilities.setCapability("noReset", "true");

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void sampleTest() throws InterruptedException {
            driver.findElementByXPath("//*[@text='我的']").click();
            driver.findElementById("com.hoomsun.hxb:id/login_userName").click();
            driver.findElementById("com.hoomsun.hxb:id/login_userName").sendKeys("13552360596");
            driver.findElementById("com.hoomsun.hxb:id/login_password").sendKeys("11111mcp");
           driver.findElementById("com.hoomsun.hxb:id/login_button").click();
           TouchAction t=new TouchAction(driver);
           int x=200;int y=200;
           t.press(PointOption.point(200,400))
                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                   .moveTo(PointOption.point(200,200));
           driver.pressKeyCode(4);
//            MobileElement el7 = (MobileElement) driver.findElementById("android:id/navigationBarBackground");
//            el7.click();
        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }
