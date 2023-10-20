package PageMBS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_Factory_DemoQA_Text_Box {

    //Page Factory permite optimizar el código con las nomenclaturas/anotaciones que permite Page Factory

    WebDriver driver;

    @FindBy(id = "search_name") WebElement txtName; // Se declaran a través de la utilización de FindBy (Page Factory)
    @FindBy(id = "search_grade") WebElement comboGrade;
    @FindBy(id = "p5") WebElement ChBxPageSize5;
    @FindBy(id = "p10") WebElement ChBxPageSize10;
    @FindBy(id = "p15") WebElement ChBxPageSize15;
    @FindBy(id = "privacypolicy") WebElement chPrivacy;
    @FindBy(id = "termsconditions") WebElement chTerms;
    @FindBy(id = "search") WebElement btnSearch;

    public void StartDriver(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); // Se envia el driver y la clase que estamos trabajando (esta)
    }

    public void CloseDriver(){
        driver.close(); // Se indica que el driver que nos envien es el que tenemos en nuestra clase
    }

    public void WriteName(String name){
        txtName.sendKeys(name); // Método para cada uno de los pasos
    }

    public void SelectComboGrade(String Grade){
        Select grade = new Select(comboGrade);
        grade.selectByVisibleText(Grade); // Selecciona de acuerdo al texto que se envie
    }

    public void ClickPageSize(Integer pageSize){

        if (pageSize == 5){
            ChBxPageSize5.click();

        }

        if (pageSize == 10){
            ChBxPageSize10.click();
        }

        if (pageSize == 15){
            ChBxPageSize15.click();
        }


    }

    public void AcceptPrivacy(){
        chPrivacy.click();
    }

    public void AcceptTerms(){
        chTerms.click();
    }

    public void BtnSearch(){
        btnSearch.click();
    }
}
