package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealChromeSelTest {

    public static void main(String [] args)    {
        new RealChromeSelTest();
    }

    public RealChromeSelTest() {

        System.setProperty("webdriver.chrome.driver","/Users/martinlequerica/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fabio.com.ar");
        System.out.println(driver.getTitle());

        WebElement botonIngresar = driver.findElement(By.xpath("//a[normalize-space()='Ingresar']"));
        botonIngresar.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='thisusername']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='thispassword']"));
        WebElement submit = driver.findElement(By.xpath("//input[@name='Enviar']"));

        try {
            Thread.sleep(2000);
        }catch(Exception e){

        }

        //verficiar login

//        WebElement botonLogout = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));

        username.sendKeys("ih4t3youall");
        password.sendKeys("6a7u3yvu9y");
        submit.click();

        try {
            Thread.sleep(2000);
        }catch(Exception e){

        }

        WebElement botonLogout = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
        if (!botonLogout.getAccessibleName().equals("Log out")){
            System.out.println("ERROR");
        }

        System.out.println("Estoy logeado");
        System.out.println("me voy a deslogear");

        botonLogout.click();
        WebElement ingresar2 = driver.findElement(By.xpath("//a[normalize-space()='Ingresar']"));

        if (ingresar2.getAccessibleName().equals("Ingresar")){
            System.out.println("el test fue un exito");
        }

    }
}
