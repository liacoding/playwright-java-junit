package company.app.utilities;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.List;

public class BrowserUtils {

    public static void sleepWithThread(int seconds){

        try{
            Thread.sleep(seconds*1000);
        }catch(Exception e){

        }
    }

    public static void sleepWithPage(Page page, int seconds){

        page.waitForTimeout(seconds*1000);

    }

    public static void clickEachLink(Page page, String selector){

        List<ElementHandle> elementHandles = page.querySelectorAll(selector);

        for (int i = 0; i < elementHandles.size(); i++) {

            Locator locator = page.locator(selector).nth(i);

            locator.click();

            page.goBack();

        }
    }

    public static boolean elementIsCheckable(Page page, String selector){

        Locator locator = page.locator(selector);
        locator.check();
        return locator.isChecked();
    }

    public static boolean elementIsUncheckable(Page page, String selector){

        Locator locator = page.locator(selector);

        if(!locator.isChecked()){
            locator.check();
        }
        locator.uncheck();
        if(!locator.isChecked()) {
            return true;
        }
        return false;
    }

    // If we need to accept the alerts
    // We need to explicitly do it, if alerts have 2 options
    public static void acceptAlert(Page page){

        page.onceDialog(d->d.accept());

    }

    public static Locator iFrameElementLocator(Page page, String iFrameSelector, String elementSelector){

        FrameLocator frameLocator = page.frameLocator(iFrameSelector);

        return frameLocator.locator(elementSelector);

    }

    public static Page openNewWindow(Page page, String windowSelector){

        Page newPage = page.waitForPopup( ()-> {page.querySelector(windowSelector).click();});

        return newPage;
    }


}
