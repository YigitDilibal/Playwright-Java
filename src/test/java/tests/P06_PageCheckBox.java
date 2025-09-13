package tests;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import methods.ReusableMethods;

public class P06_PageCheckBox {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        BrowserContext context = ReusableMethods.launchAndMaximize(playwright);
        Page page = context.newPage();

        page.navigate("https://demoqa.com/checkbox");

        page.check("//*[@class='rct-checkbox']");
        ReusableMethods.Sleep(1500);

        page.uncheck("//*[@class='rct-checkbox']");
        ReusableMethods.Sleep(1500);



        page.close();
        context.close();
        playwright.close();



    }



}
