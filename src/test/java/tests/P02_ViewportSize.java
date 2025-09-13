package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.awt.*;

public class P02_ViewportSize {

    public static void main(String[] args) throws InterruptedException {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        //setHeadless(true) hic pencere acmadan testi tamamlar
        //setHeadless(false) browser acarak testi tamamlar

        Page page = browser.newPage();
        page.setViewportSize(width,height);
        Thread.sleep(3000);
        page.navigate("https://www.google.com");
        System.out.println(page.title());

        page.close();
        browser.close();
        playwright.close();

    }


}
