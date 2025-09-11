package tests;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import methods.ReusableMethods;

public class P03_MaximizeTest {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        BrowserContext context = ReusableMethods.launchAndMaximize(playwright);

        Page page = context.newPage();
        page.navigate("https://www.google.com");

        ReusableMethods.Sleep(3000);

        System.out.println(page.title() + "\n" + page.url());

        page.close();
        context.close();
        playwright.close();


    }
}
