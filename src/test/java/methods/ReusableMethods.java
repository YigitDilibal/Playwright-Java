package methods;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

import java.util.Arrays;
import java.util.List;

public class ReusableMethods {

    public static BrowserContext launchAndMaximize(Playwright playwright){

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(List.of("--start-maximized")));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

        return context;
    }

    public static void Sleep(int ms){

        try {
            Thread.sleep(ms);
        }catch (Exception e){
            System.out.println("Couldn't wait");
        }

    }


}
