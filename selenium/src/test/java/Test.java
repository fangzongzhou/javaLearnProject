import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Short> asdf = new HashSet<Short>();
        for (Short i = 0; i < 100; i++) {
            asdf.add(i);
            asdf.remove(i - 1);
        }
        Short re = 4;
        Short as = 3;

        System.out.println(re-1);
        System.out.println(as.equals(re-1));
        System.out.println();
        System.out.println(asdf.size());
    }

//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/fangzongzhou/Applications/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.navigate().to("http://www.baidu.com");
//        WebElement inputItem = webDriver.findElement(By.name("wd"));
//        inputItem.sendKeys("中国");
//        inputItem.submit();
//        Thread.sleep(3000);
//        Assert.assertEquals("中国",webDriver.getTitle() );
//
//    }
}
