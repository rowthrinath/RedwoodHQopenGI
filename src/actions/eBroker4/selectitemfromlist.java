package actions.eBroker4;

import java.util.*;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;


/* Action name for this script is "eBroker4Selectlist"  */

class selectitemfromlist{
    public void run(HashMap<String, String> params){
        if (params.get("selectBy").equals("css")){     
            
            if (params.get("listName").length()>0)
            {                                        
            WebElement listname= Browser.Driver.findElement(By.cssSelector(params.get("listName")));
            listname.click();
            }
            
            
            WebElement select = Browser.Driver.findElement(By.cssSelector(params.get("selectByvalue")));
            
            List<WebElement> options = select.findElements(By.tagName(params.get("tagname")));
            
            for (WebElement option : options) {

            if((option.getText().trim().contains(params.get("Value")))){

             option.click();   
                break;
            }
                
            }

            
        }
        
    }
}