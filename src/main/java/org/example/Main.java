package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import static org.example.BasePage.driver;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get("https://www.saucedemo.com/xyzzzz");
        // establish, open connection with URL
        HttpURLConnection cn = (HttpURLConnection)new URL("https://www.saucedemo.com/xyzzz").openConnection();
        // set HEADER request
        cn.setRequestMethod("HEAD");
        // connection initiate
        cn.connect();
        //get response code
        int res = cn.getResponseCode();
        System.out.println("Http response code: " + res);
        driver.quit();
    }
}
