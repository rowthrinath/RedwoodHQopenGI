package actions.eBroker4;


import java.util.*;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

class clickoncheckbox{
    public void run(HashMap<String, String> params){
        
    if (params.get("selectBy").equals("css")){            
                        
            WebElement select = Browser.Driver.findElement(By.cssSelector(params.get("selectByvalue")));
            
            List<WebElement> options = select.findElements(By.tagName(params.get("tagname")));
                  
                for (WebElement option : options) 
                {       
                        if(params.get("Value").equals("Yes"))
                        {		
                          if (!option.isSelected())
                          {
                              option.click();  
                              break;
                          }
                           
                       	}
                            
            	}    
            
        }
        
    }
}