package tests;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import methods.ReusableMethods;

public class P04_PageMethods {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        BrowserContext context = ReusableMethods.launchAndMaximize(playwright);

        Page page = context.newPage();
        page.navigate("https://www.testotomasyonu.com");

        page.click("(//*[@class='has-sub'])[1]");

        ReusableMethods.Sleep(1000);


        page.close();
        context.close();
        playwright.close();


    }


}
