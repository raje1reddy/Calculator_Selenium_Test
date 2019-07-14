import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class PercentageCalculatorSeleniumTest {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        // open the browser and go to open www.calculator.net'
        driver.get("https://www.calculator.net/");

        // Click on Link Math Calculator Link
        WebElement elementMathCalcLink=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[2]/a[1]"));
        elementMathCalcLink.click();

        //use this code to wait
        // Wait for page load  Thread.sleep(2500);
        // Click on Link Percentage Calculator Link
        WebElement elementPercentCalcLink = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/div[3]/a[1]"));
        elementPercentCalcLink.click();

        //select text box1
        WebElement textBox1 =   driver.findElement(By.xpath("//input[@id='cpar1']"));
        // enter a value in Text box 1  ->> 10
        textBox1.sendKeys("10");


        // enter a value in Text box 2  ->> 50
        WebElement textBox2 =   driver.findElement(By.xpath("//input[@id='cpar2']"));
        textBox2.sendKeys("50");

        // Click Calculate button
        WebElement calculateButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[2]"));
        calculateButton.click();


        // Read result
        WebElement resultElement = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/p[2]/font[1]/b[1]"));
        String result = resultElement.getText();

        // verify if the result is 5
        if(result.equals("5")){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        driver.close();

    }
}



