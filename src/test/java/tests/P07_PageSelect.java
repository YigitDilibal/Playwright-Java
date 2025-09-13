package tests;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;
import methods.ReusableMethods;

public class P07_PageSelect {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        BrowserContext context = ReusableMethods.launchAndMaximize(playwright);
        Page page = context.newPage();

        page.navigate("https://demoqa.com/select-menu");

        page.selectOption("//*[@id='oldSelectMenu']","1");
        ReusableMethods.Sleep(1000);

        page.selectOption("//*[@id='oldSelectMenu']", new SelectOption().setLabel("Yellow"));
        ReusableMethods.Sleep(1000);

        page.selectOption("//*[@id='oldSelectMenu']", new SelectOption().setIndex(5));
        ReusableMethods.Sleep(1000);



        page.close();
        context.close();
        playwright.close();



    }


}
