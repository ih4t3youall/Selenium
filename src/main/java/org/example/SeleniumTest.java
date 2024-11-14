package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.fabio.com.ar");
        System.out.println("Title: " + driver.getTitle());


        try {
            Thread.sleep(2000); // Esperar a que termine de lodear la pagina
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element = driver.findElement(By.xpath("//h2[@class='blog-post-title']//a[@title='Hace tiempo que perdí la empatía hacia el roto'][normalize-space()='Hace tiempo que perdí la empatía hacia el roto']"));
        System.out.println("Texto encontrado: " + element.getText());


        driver.quit();
    }
}
