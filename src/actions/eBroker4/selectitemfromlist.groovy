package actions.eBroker4;


import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select


class selectitemfromlist{
    public void run(def params){
       WebElement element = Elements.find(params,Browser.Driver)
    
    if(params."Visible Text"){
    	new Select(element).selectByVisibleText(params."Visible Text")  
    }
    else if(params."Value"){
    	new Select(element).selectByValue(params."Value")
    }
    else if (params.Index){
    	new Select(element).selectByVisibleText(params.Index.toInteger())
    } 
    }
}