package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.System.exit;

public class OtroSeleniumTest {
    public static void main(String [] args) {
        OtroSeleniumTest ost = new OtroSeleniumTest();
        ost.start();
    }
    public void start() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.fabio.com.ar");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current url: " + currentUrl);


        howAboutWait(2000);


        WebElement botonIngresar = driver.findElement(By.xpath("//a[normalize-space()='Ingresar']"));
        //WebElement parrafo = driver.findElement(By.xpath("//p[contains(text(),'El Departamento de Justicia de los EEUU quiere jug')]"));

        botonIngresar.click();

        howAboutWait(2000);

        System.out.println("hice click para ingresar al login");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current url: " + currentUrl);

        WebElement usuario = driver.findElement(By.xpath("//input[@id='thisusername']"));

        WebElement enviar = driver.findElement(By.xpath("//input[@name='Enviar']"));

        if (!enviar.getAccessibleName().equals("Enviar")){
            System.out.println("Error!");
            exit(0);
        }

        System.out.println("pagina cargada");

        driver.quit();
    }


    public void howAboutWait(int time) {
        try {
            Thread.sleep(2000); // Esperar a que termine de lodear la pagina
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}