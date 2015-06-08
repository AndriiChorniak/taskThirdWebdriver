package testsPNdotCom;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.*;
import pages.AnyPage;
import pages.BreadMakerPage;
import pages.ConditionerPage;
import pages.FridgesPage;
import pages.MainPage;
import pages.MicrowavePage;
import pages.WasherPage;
import driver.WebDriverFactory;

public class TestPN {

    private static final String START_URL = "http://pn.com.ua/";
    private static final String VOLUME_FIRST = "23 л";
    private static final String VOLUME_SECOND = "20 л";
    private static final String INNER_COATING_FIRST = "Биокерамика";
    private static final String INNER_COATING_SECOND = "Эмаль";
    private static final String POWER_FIRST = "800 Вт";
    private static final String POWER_SECOND = "700 Вт";
    private static final String DISPLAY_FIRST = "есть";
    private static final String CONTROL_FIRST = "Электронное";
    private static final String CONTROL_SECOND = "Механическое";
    private static final String OPENNING_DOOR_FIRST = "Ручкой";
    private static final String OPENNING_DOOR_SECOND = "Кнопкой";
    private static final String AUTOMATED_FUNC_FIRST = "Разогрев, Разморозка, Приготовление";
    private static final String AUTOMATED_FUNC_SECOND = "Разогрев, Разморозка";
    private static final String ADDITION_FIRST = "Блокировка от детей";
    private static final String COLOUR_FIRST = "Серебристый";
    private static final String COLOUR_SECOND = "Белый";
    private static final String SIZE_FIRST = "27.5x48.9x37.4 см";
    private static final String WEIGHT_FIRST = "12 кг";
    private WebDriver driver;
    private WebDriverFactory webDriverFactory = new WebDriverFactory();
    private WebDriverWait wait;
    private FridgesPage fridges;
    private MicrowavePage microwave;
    private MainPage main;
    private WasherPage washer;
    private AnyPage any;
    private BreadMakerPage breadMaker;
    private ConditionerPage conditioner;

    @BeforeClass
    public void startBrowser() {
        try {
            driver = webDriverFactory.createWebdriver("firefox");
        } catch (MalformedURLException e) {

            e.printStackTrace();
        }
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        goToPageFridges();
        goToPageMicrowave();
        goToPageWasher();
        goToPageBreadMaker();
        goToPageConditioner();
        main = PageFactory.initElements(driver, MainPage.class);
        any = PageFactory.initElements(driver, AnyPage.class);
    }

    private void goToPageConditioner() {
        conditioner = PageFactory.initElements(driver, ConditionerPage.class);
    }

    private void goToPageBreadMaker() {
        breadMaker = PageFactory.initElements(driver, BreadMakerPage.class);
    }

    private void goToPageWasher() {
        washer = PageFactory.initElements(driver, WasherPage.class);
    }

    private void goToPageMicrowave() {
        microwave = PageFactory.initElements(driver, MicrowavePage.class);
    }

    private void goToPageFridges() {
        fridges = PageFactory.initElements(driver, FridgesPage.class);
    }

    @AfterClass
    public void quitBrowser() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();

    }

    @Test(description = "Sort fridges by price")
    public void testSortByPrice() {
        main.buttonFridges.click();
        fridges.buttonPrice.click();
        assertTrue(doSortByPrice());
        goToMainPage();

    }

    @Test(description = "Compare two microwave")
    public void testCompareMicrowave() {
        main.buttonMicrowaves.click();
        microwave.buttonCompareFirstMicrowave.click();
        microwave.buttonCompareSecondMicrowave.click();
        microwave.linkCompare.click();
        assertEquals(microwave.volumeFirst.getText(), VOLUME_FIRST);
        assertEquals(microwave.volumeSecond.getText(), VOLUME_SECOND);
        assertEquals(microwave.innerCoatingFirst.getText(), INNER_COATING_FIRST);
        assertEquals(microwave.innerCoatingSecond.getText(), INNER_COATING_SECOND);
        assertEquals(microwave.powerFirst.getText(), POWER_FIRST);
        assertEquals(microwave.powerSecond.getText(), POWER_SECOND);
        assertEquals(microwave.displayFirst.getText(), DISPLAY_FIRST);
        assertEquals(microwave.controlFirst.getText(), CONTROL_FIRST);
        assertEquals(microwave.controlSecond.getText(), CONTROL_SECOND);
        assertEquals(microwave.openningDoorFirst.getText(), OPENNING_DOOR_FIRST);
        assertEquals(microwave.openningDoorSecond.getText(), OPENNING_DOOR_SECOND);
        assertEquals(microwave.automatedFuncFirst.getText(), AUTOMATED_FUNC_FIRST);
        assertEquals(microwave.automatedFuncSecond.getText(), AUTOMATED_FUNC_SECOND);
        assertEquals(microwave.additionFirst.getText(), ADDITION_FIRST);
        assertEquals(microwave.colourFirst.getText(), COLOUR_FIRST);
        assertEquals(microwave.colourSecond.getText(), COLOUR_SECOND);
        assertEquals(microwave.sizeFirst.getText(), SIZE_FIRST);
        assertEquals(microwave.weightFirst.getText(), WEIGHT_FIRST);
        goToMainPage();

    }

    @Test(description = "Filter by price for washer")
    public void testFilterByPrice() {
        main.buttonWashers.click();
        assertTrue(verifyMinPrice());
        assertTrue(verifyMaxPrice());
        goToMainPage();
    }

    @Test(description = "Filter by producer for breadMaker")
    public void testFilterByProducer() {
        main.buttonBreadMaker.click();
        breadMaker.producerSaturn.click();
        assertTrue(verifyProducer());
        goToMainPage();
    }

    @Test(description = "Filter by control weight for breadMaker")
    public void testFilterByControlWeight() {
        main.buttonBreadMaker.click();
        breadMaker.producerSaturn.click();
        verifyControlWeight();
        goToMainPage();
    }

    @Test(description = "Is the same information about conditioner on two sourses")
    public void testSameInfo() {
        assertTrue(verifyConditioner(conditioner.linkFirstConditioner));
        assertTrue(verifyConditioner(conditioner.linkSecondConditioner));
        assertTrue(verifyConditioner(conditioner.linkThirdConditioner));
        assertTrue(verifyConditioner(conditioner.linkFourthConditioner));
        assertTrue(verifyConditioner(conditioner.linkFifthConditioner));
        goToMainPage();

    }

    private boolean verifyConditioner(WebElement linkOnConditioner) {
        main.buttonConditioner.click();
        conditioner.buttonSortByPrice.click();
        linkOnConditioner.click(); //
        Boolean flag = false;
        List<WebElement> valueOfCharacteristicsOnInfoPage = conditioner.allValueOfCharacteristics;
        List<String> valueOnInfoPage = new ArrayList<String>();
        for (WebElement element : valueOfCharacteristicsOnInfoPage) {
            valueOnInfoPage.add(element.getText());
        }
        main.buttonConditioner.click();
        conditioner.buttonSortByPrice.click();
        conditioner.linkPraicy.click();
        linkOnConditioner.click(); //
        List<WebElement> valueOfCharacteristicsOnPraicyPage = conditioner.allValueOfCharacteristics;
        List<String> valueOnPraicypage = new ArrayList<String>();
        for (WebElement element : valueOfCharacteristicsOnPraicyPage) {
            valueOnPraicypage.add(element.getText());
        }

        if (valueOnInfoPage.equals(valueOnPraicypage))
            flag = true;
        main.buttonDomesticEquipment.click();
        return flag;

    }

    private boolean verifyControlWeight() {
        breadMaker.controlWeight.click();
        Boolean flag = false;
        String filterProducer = "Регулировка веса";
        List<WebElement> products = breadMaker.allProductWithControlWeight;
        for (WebElement element : products) {
            if (element.getText().contains(filterProducer)) {
                flag = true;
            } else {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    private boolean verifyProducer() {
        Boolean flag = false;
        String filterProducer = "Saturn";
        List<WebElement> products = breadMaker.allProducerSaturnOnPage;
        for (WebElement element : products) {
            if (filterProducer.equals(element.getText().substring(0, 6))) {
                flag = true;
            } else {
                flag = false;
                return flag;
            }
        }
        return flag;

    }

    private boolean verifyMinPrice() {
        washer.minPrice.click();
        washer.buttonSortByPrice.click();
        Boolean flag = false;
        int filterMinPrice = 6000;
        List<WebElement> products = any.allprices;
        for (WebElement element : products) {
            if (filterMinPrice <= Integer.parseInt(element.getText().replaceAll(" ", "").replace("грн", "")))
                flag = true;
            else {
                flag = false;
                return flag;
            }
            filterMinPrice = Integer.parseInt(element.getText().replaceAll(" ", "").replace("грн", ""));
        }
        return flag;

    }

    private boolean verifyMaxPrice() {
        washer.maxPrice.click();
        washer.lastPage.click();
        Boolean flag = false;
        int filterMaxPrice = 9000;
        List<WebElement> products = any.allprices;
        for (WebElement element : products) {
            if (filterMaxPrice >= Integer.parseInt(element.getText().replaceAll(" ", "").replace("грн", "")))
                flag = true;
            else {
                flag = false;
                return flag;
            }
        }
        return flag;

    }

    private void goToMainPage() {
        main.linkToMainPage.click();
    }

    private boolean doSortByPrice() {
        Boolean flag = false;
        int minPrice = 0;
        List<WebElement> products = any.allprices;
        for (WebElement element : products) {
            if (minPrice < Integer.parseInt(element.getText().replaceAll(" ", "").replace("грн", "")))
                flag = true;
            else {
                flag = false;
                return flag;
            }
            minPrice = Integer.parseInt(element.getText().replaceAll(" ", "").replace("грн", ""));
        }
        return flag;
    }
}
