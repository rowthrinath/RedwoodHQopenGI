package actions.eBroker4;

import java.util.*;
import java.lang.*;
import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;


class autocompleteinput{
    public void run(HashMap<String, String> params){
        
    if (params.get("selectBy").equals("css")){            
               
        	if (params.get("inputValue").length()>0)
            {
            WebElement input = Browser.Driver.findElement(By.cssSelector(params.get("selectinputByvalue")));
        	input.sendKeys(params.get("inputValue"));
            }
        
        	WebElement select = Browser.Driver.findElement(By.cssSelector(params.get("autoListname")));
            
            List<WebElement> options = select.findElements(By.tagName(params.get("tagname")));
                  
                for (WebElement option : options) 
                {       
                         if(params.get("inputValue").equals(option.getText().trim()))
                        {		
                              option.click();  
                              break;                          
                       	}
                            
            	}    
            
        }
        
    }
}