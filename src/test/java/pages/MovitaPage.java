package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MovitaPage {

    public MovitaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[text()=\"Kurumsal\"]")
    public WebElement kurumsalMenu;

    @FindBy(xpath = "(//ul[@class=\"sub-menu-container\"])[1]")
    public WebElement subKurumsalMenu;

    @FindBy(id = "logo")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

    @FindBy(xpath = "//*[@id=\"dropdownMenuButton\"]")
    public WebElement dropdownMenubutton;

    @FindBy(xpath = "//a[@class=\"dropdown-item\"]")
    public WebElement logo_eng;

    @FindBy(xpath = "//div[@id=\"layer-713898396\"]")
    public WebElement mainTextEnglish;

    @FindBy(xpath = "//*[@href=\"/rota_optimizasyonu\"][1]")
    public WebElement rota_optimizasyon;

    @FindBy(xpath = "//*[@href=\"/uygulamalar\"]")
    public WebElement uygulamalar;

    @FindBy(xpath = "//*[@href=\"/guide\"]")
    public WebElement kilavuz;

    @FindBy(xpath = "//div/div/div[3]/div/a[2]")
    public WebElement turkcebuton;

    @FindBy(xpath = "//*[@href=\"/iletisim\"]")
    public WebElement iletisim;

    @FindBy(xpath = "//*[@href=\"/login\"]")
    public WebElement giris;

    @FindBy(xpath ="//div/div/nav/ul/li[1]/a/div")
    public WebElement anasayfa_yazisi;

    @FindBy(xpath = "//div[text()=\"Mobile Vehicle Traking System\"]")
    public WebElement englishstring;

    @FindBy(xpath = "//div/div/nav/ul/li[2]/a/div")
    public WebElement kurumsalAnaMenu;

    @FindBy(xpath = "//div/div/nav/ul/li[2]/ul/li[1]/a/div")
    public WebElement kurumsalHakkimizda;
    @FindBy(xpath = "//div/h1")
    public WebElement kurumsalHakString;
    @FindBy(xpath = "//div/div/nav/ul/li[2]/ul/li[2]/a/div")
    public WebElement kurumsalBelgelerimiz;
    @FindBy(xpath = "//div/h1")
    public WebElement kurumsalBelString;
    @FindBy(xpath = "//div/div/nav/ul/li[2]/ul/li[3]/a/div")
    public WebElement kurumsalBayilikBasvurusu;
    @FindBy(xpath = "//div/h1")
    public WebElement kurumsalBayiString;
    @FindBy(xpath = "//div/div/nav/ul/li[2]/ul/li[4]/a/div")
    public WebElement kurumsalDemoBasvurusu;
    @FindBy(xpath = "//div/h1")
    public WebElement kurumsaldemoString;
    @FindBy(xpath = "//div/div/nav/ul/li[2]/ul/li[5]/a/div")
    public WebElement cerezPolitikasi;
    @FindBy(xpath = "//div/h1")
    public WebElement kurumsalcerezString;
    @FindBy(xpath = "//div/div/nav/ul/li[2]/ul/li[6]/a/div")
    public WebElement kvkk;
    @FindBy(xpath = "//div/h1")
    public WebElement kurumsalKvkkString;

    @FindBy(xpath = "//div/div/nav/ul/li[3]/a/div")
    public WebElement urunlerMenu;

    @FindBy(xpath = "/div/div/nav/ul/li[3]/ul/li[1]/a/div")
    public WebElement mnvr;
    @FindBy(xpath = "//div/h1")
    public WebElement urunlerMnvrString;
    @FindBy(xpath = "/div/div/nav/ul/li[3]/ul/li[2]/a/div")
    public WebElement mnvrPro;
    @FindBy(xpath = "//div/h1")
    public WebElement urunlerMnvrProString;
    @FindBy(xpath = "/div/div/nav/ul/li[3]/ul/li[3]/a/div")
    public WebElement aracTakipCihazi;
    @FindBy(xpath = "//div/h1")
    public WebElement urunleraracTakipcihaziString;
    @FindBy(xpath = "/div/div/nav/ul/li[3]/ul/li[4]/a/div")
    public WebElement camTracker;
    @FindBy(xpath = "//div/h1")
    public WebElement urunlerCamtrakerString;
    @FindBy(xpath = "/div/div/nav/ul/li[3]/ul/li[5]/a/div")
    public WebElement akilliDirekSistemi;
    @FindBy(xpath = "//div/h1")
    public WebElement urunlerAkillidirekString;

    @FindBy(xpath = "//div/div/nav/ul/li[4]/a/div")
    public WebElement cozumlerMenu;

    @FindBy(xpath = "//div/div/nav/ul/li[4]/ul/li[1]/a/div")
    public WebElement okulServisleriTakipveKoltukSensorSistemleri;
    @FindBy(xpath = "//div/h1")
    public WebElement cozumlerokulservisaracString;
    @FindBy(xpath = "//div/div/nav/ul/li[4]/ul/li[2]/a/div")
    public WebElement kameraliAracTakipSistemi;
    @FindBy(xpath = "//div/h1")
    public WebElement cozumlerKameraliaracTakipString;
    @FindBy(xpath = "//div/div/nav/ul/li[4]/ul/li[3]/a/div")
    public WebElement kisiBilgilendirmeSistemi;
    @FindBy(xpath = "//div/h1")
    public WebElement cozumlerKisibilgiString;
    @FindBy(xpath = "//div/div/nav/ul/li[4]/ul/li[4]/a/div")
    public WebElement kisiNesneVeHayvanTakipSistemi;
    @FindBy(xpath = "//div/h1")
    public WebElement cozumlerKisiveNesneString;
}
