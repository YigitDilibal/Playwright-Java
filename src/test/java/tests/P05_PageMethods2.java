package tests;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import methods.ReusableMethods;

public class P05_PageMethods2 {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        BrowserContext context = ReusableMethods.launchAndMaximize(playwright);

        Page page = context.newPage();

        page.navigate("https://www.testotomasyonu.com");
        page.fill("(//*[@class='search-label'])[1]", "iphone");

        page.locator("(//*[@class='search-label'])[1]").press("Enter");
//        page.keyboard().press("Enter");


        System.out.println(page.title());


        page.close();
        context.close();
        playwright.close();


    }







}
