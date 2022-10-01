package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Objects;


public class MovitaStepDefinitions {

    MovitaPage movita= new MovitaPage();
    WebElement dropdownMenubutton;
    Select select;


    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
    }

    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
        movita.movitaLogo.click();
    }

    @Then("User should navigate to homepage")
    public void user_should_navigate_to_homepage() {
        String expectedUrl = "https://movita.com.tr/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage", expectedUrl, actualUrl);
    }

    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasita_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }

    //

    @And("User hover over Dropdown on the right corner to switch language")
    public void user_clicks_forEnglish() {
        ReusableMethods.hover(movita.dropdownMenubutton);


    }

    @And("clicks on the language button")
    public void user_clicks_on_the_Language_Button() {
        movita.dropdownMenubutton.click();

    }

    @Then("clicks on English on the dropdown menu")
    public void user_clicks_on_english_button() {
        ReusableMethods.waitForVisibility(movita.logo_eng, 5);
        movita.logo_eng.click();

    }
    @And("Verify if Mobile Vehicle Traking System is displayed")
    public void verify_if_mobile_vehivle_traking_system_displayed(){

        ReusableMethods.waitForVisibility(movita.mainTextEnglish, 10);
        Assert.assertTrue(movita.mainTextEnglish.isDisplayed());
    }
    @Then("user hovers over rota_optimizasyon and verifies color change")
    public void hover_over_rota_optimizasyon(){
       String color_before= movita.rota_optimizasyon.getCssValue("color");
       String color_b_hex=Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.rota_optimizasyon);

        String color_after=movita.rota_optimizasyon.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();

        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));


    }
    @And("verifies rota_optimizasyon clickable")
    public void clickable(){
        ExpectedConditions.elementToBeClickable(movita.rota_optimizasyon);

    }
    @Then("user verifies rota string")
    public void verify_string(){
        String expected_rota_text="ROTA OPTIMIZASYONU";
String s=movita.rota_optimizasyon.getText();
        Assert.assertEquals(expected_rota_text,s);

    }
    @Then("user hovers over uygulamalar and verifies color change")
    public void verify_color(){
        String color_before= movita.uygulamalar.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.uygulamalar);
        String color_after=movita.uygulamalar.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));
    }
    @And("verifies uygulamalar clickable")
    public void clickable_uygulamalar(){
        ExpectedConditions.elementToBeClickable(movita.uygulamalar);


    }
    @Then("verify uygulamalar string")
    public void verify_uygulamalar_string(){
        String expected="UYGULAMALAR";
        String actual=movita.uygulamalar.getText();
        Assert.assertEquals(expected,actual);

    }

    @Then("user hovers over kilavuz and verifies color change")
    public void user_hovers_over_kilavuz_and_verifies_color_change() {
        String color_before= movita.kilavuz.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.kilavuz);
        String color_after=movita.kilavuz.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies kilavuz clickable")
    public void user_verifies_kilavuz_clickable() {
        ExpectedConditions.elementToBeClickable(movita.kilavuz);
    }
    @Then("verifies kilavuz string")
    public void verify_kilavuz_string() {
        String expected="KILAVUZ";
        String actual=movita.kilavuz.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over iletisim and verifies color change")
    public void user_hovers_over_iletisim_and_verifies_color_change() {
        String color_before= movita.iletisim.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.iletisim);
        String color_after=movita.iletisim.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies iletisim clickable")
    public void user_verifies_iletisim_clickable() {
        ExpectedConditions.elementToBeClickable(movita.iletisim);

    }
    @Then("verify iletisim string")
    public void verify_iletisim_string() {
        String expected="İLETİŞİM";
        String actual=movita.iletisim.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user hovers over giris and verifies color change")
    public void user_hovers_over_giris_and_verifies_color_change() {
        String color_before= movita.giris.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.giris);
        String color_after=movita.giris.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertFalse(Objects.equals(color_a_hex, color_b_hex));

    }
    @Then("user verifies giris clickable")
    public void user_verifies_giris_clickable() {
        ExpectedConditions.elementToBeClickable(movita.giris);

    }
    @Then("verify giris string")
    public void verify_giris_string() {
        String expected="GİRİŞ YAP";
        String actual=movita.giris.getText();
        Assert.assertEquals(expected,actual);

    }
    @Given("kullanici movita sayfasına gider")
    public void kullanici_movita_sayfasına_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));
    }
    @Then("kullanici movita anasayfada oldugunu dogrular")
    public void kullanici_movita_anasayfada_oldugunu_dogrular() {
        String expected="GİRİŞ YAP";
        String actual=movita.giris.getText();
        Assert.assertEquals(expected,actual);
    }
    @Then("kullanici movita logosu üzerine hoverover yapar")
    public void kullanici_movita_logosu_üzerine_hoverover_yapar() {
      ReusableMethods.hover(movita.movitaLogo);
    }
    @Then("kullanici motita logosunun clickable olduğunu görür")
    public void kullanici_motita_logosunun_clickable_olduğunu_görür() {
       ReusableMethods.waitForClickablility(movita.movitaLogo,3000);
    }
    @Then("kullanici movita logosunu tiklar")
    public void kullanici_movita_logosunu_tiklar() {
        {
            movita.movitaLogo.click();
        }
    }
    @Then("kullanici ekranda verilen stringi verify eder")
    public void kullanici_ekranda_verilen_stringi_verify_eder() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }
    @Then("kullanıcı ANASAYFA üzerinde hoverover yapar")
    public void kullanıcı_anasayfa_üzerinde_hoverover_yapar() {
    ReusableMethods.hover(movita.anasayfa_yazisi);
    }
    @Then("Kullanıcı ANASAYFA yazisinin renginin değiştiğini görür")
    public void kullanıcı_anasayfa_yazisinin_renginin_değiştiğini_görür() {
        String color_before=movita.anasayfa_yazisi.getCssValue("color");
        String color_b_hex=Color.fromString(color_before).asHex();
        ReusableMethods.hover(movita.anasayfa_yazisi);
        String color_after=movita.anasayfa_yazisi.getCssValue("color");
        String color_a_hex=Color.fromString(color_after).asHex();
        Assert.assertTrue("color",true);

    }
    @Then("kullanici ANASAYFA yazisinin  clickable olduğunu görür")
    public void kullanici_anasayfa_yazisinin_clickable_olduğunu_görür() {
        ReusableMethods.waitForClickablility(movita.anasayfa_yazisi,3000);
    }
    @Then("Kullanıcı ANASAYFA yazisini tıklar")
    public void kullanıcı_anasayfa_yazisini_tıklar() {
     movita.anasayfa_yazisi.click();
    }
    @Then("kullanici Dil Tercihi Logosu üzerinde hoverover yapar")
    public void kullanici_dil_tercihi_logosu_üzerinde_hoverover_yapar() {
        ReusableMethods.hover(movita.dropdownMenubutton);
    }
    @Then("kullanici Dil Tercihi Logosu üzerine geldiğinde clickable oldugunu görür")
    public void kullanici_dil_tercihi_logosu_üzerine_geldiğinde_clickable_oldugunu_görür() {
       ReusableMethods.waitForClickablility(movita.dropdownMenubutton,3000);
    }
    @Then("kullanici Dil Tercihi Logosu tıklar")
    public void kullanici_dil_tercihi_logosu_tıklar() {
     movita.dropdownMenubutton.click();
    }

    @Then("kullanici Englisch secenegini tıklar")
    public void kullanici_englisch_secenegini_tıklar() {

        movita.logo_eng.click();
    }
    @Then("kullanici ekranda verilen ingilizce stringi görmelidir")
    public void kullanici_ekranda_verilen_ingilizce_stringi_görmelidir()  {
        WebElement txt=movita.englishstring;
        System.out.println("txt = " + txt);

    }
    @Then("kullanici Türkçe yazisini tıklar")
    public void kullanici_türkçe_yazisini_tıklar() {
        movita.dropdownMenubutton.click();
        movita.turkcebuton.click();
    }
    @Then("kullanici ekranda verilen Türkçe stringi görmelidir")
    public void kullanici_ekranda_verilen_türkçe_stringi_görmelidir() {
      WebElement txt1=movita.mainTextTurkish;
        System.out.println("txt = " + txt1);

    }



    @Then("kullanıcı KURUMSAL yazisi üzerinde hoverover yapar")
    public void kullanıcı_kurumsal_yazisi_üzerinde_hoverover_yapar() {
    ReusableMethods.hover(movita.kurumsalAnaMenu);
    }
    @Then("kullanici KURUMSAL yazisinin clickable olduguu görür")
    public void kullanici_kurumsal_yazisinin_clickable_olduguu_görür() {
       ReusableMethods.waitForClickablility(movita.kurumsalAnaMenu,1000);
    }
    @Then("kullaici tüm kurumsal alt seceneklerin üzerinde hoverover yapar")
    public void kullaici_tüm_kurumsal_alt_seceneklerin_üzerinde_hoverover_yapar() {
       ReusableMethods.hover(movita.kurumsalHakkimizda);
       ReusableMethods.hover(movita.kurumsalBelgelerimiz);
       ReusableMethods.hover(movita.kurumsalDemoBasvurusu);
       ReusableMethods.hover(movita.kurumsalBayilikBasvurusu);
       ReusableMethods.hover(movita.cerezPolitikasi);
       ReusableMethods.hover(movita.kvkk);
    }
    @Then("kullanici cikan tüm kurumsal alt seceneklerin clickable oldugunu ve renk değistirdigini görür")
    public void kullanici_cikan_tüm_kurumsal_alt_seceneklerin_clickable_oldugunu_ve_renk_değistirdigini_görür() {
        ReusableMethods.waitForClickablility(movita.kurumsalHakkimizda,1000);
        ReusableMethods.waitForClickablility(movita.kurumsalBelgelerimiz,1000);
        ReusableMethods.waitForClickablility(movita.kurumsalDemoBasvurusu,1000);
        ReusableMethods.waitForClickablility(movita.kurumsalBayilikBasvurusu,1000);
        ReusableMethods.waitForClickablility(movita.cerezPolitikasi,1000);
        ReusableMethods.waitForClickablility(movita.kvkk,1000);
    }
    @Then("kullanici tüm kurumsal alt secenekleri sirasiyla tıklar string ifadelerini dogrular")
    public void kullanici_tüm_kurumsal_alt_secenekleri_sirasiyla_tıklar_string_ifadelerini_dogrular() {
        ReusableMethods.waitForClickablility(movita.kurumsalAnaMenu,1000);
        movita.kurumsalHakkimizda.click();
        String expected="HAKKIMIZDA";
        String actual=movita.kurumsalHakString.getText();
        Assert.assertEquals(expected,actual);
        ReusableMethods.waitForClickablility(movita.kurumsalAnaMenu,1000);
    movita.kurumsalBelgelerimiz.click();
        String expected1="BELGELERİMİZ";
        String actual1=movita.kurumsalBelString.getText();
        Assert.assertEquals(expected,actual);
        ReusableMethods.waitForClickablility(movita.kurumsalAnaMenu,1000);
    movita.kurumsalDemoBasvurusu.click();
        String expected2="DEMO BAŞVURU";
        String actual2=movita.kurumsaldemoString.getText();
        Assert.assertEquals(expected,actual);
        ReusableMethods.waitForClickablility(movita.kurumsalAnaMenu,1000);
    movita.kurumsalBayilikBasvurusu.click();
        String expected3="BAYILIK BAŞVURU";
        String actual3=movita.kurumsalBayiString.getText();
        Assert.assertEquals(expected,actual);
        ReusableMethods.waitForClickablility(movita.kurumsalAnaMenu,1000);
    movita.cerezPolitikasi.click();
        String expected4="ÇEREZ POLITIKASI";
        String actual4=movita.kurumsalcerezString.getText();
        Assert.assertEquals(expected,actual);
        ReusableMethods.waitForClickablility(movita.kurumsalAnaMenu,1000);
    movita.kvkk.click();
        String expected5="KİŞİSEL VERİLERİN İŞLENME POLİTİKASI";
        String actual5=movita.kurumsalKvkkString.getText();
        Assert.assertEquals(expected,actual);
    }
    @Then("kullanıcı ÇÖZÜMLER yazisi üzerinde hoverover yapar")
    public void kullanıcı_çözümler_yazisi_üzerinde_hoverover_yapar() {
      ReusableMethods.hover(movita.cozumlerMenu);
    }
    @Then("kullanici ÇÖZÜMLER yazisinin clickable olduguu görür")
    public void kullanici_çözümler_yazisinin_clickable_olduguu_görür() {
        ReusableMethods.waitForClickablility(movita.cozumlerMenu,1000);
    }
    @Then("kullaici tüm çözümler alt seceneklerin üzerinde hoverover yapar")
    public void kullaici_tüm_çözümler_alt_seceneklerin_üzerinde_hoverover_yapar() {

        ReusableMethods.hover(movita.okulServisleriTakipveKoltukSensorSistemleri);
        ReusableMethods.hover(movita.kameraliAracTakipSistemi);
        ReusableMethods.hover(movita.kisiBilgilendirmeSistemi);
        ReusableMethods.hover(movita.kisiNesneVeHayvanTakipSistemi);
    }
    @Then("kullanici cikan tüm çözümler alt seceneklerin clickable oldugunu ve renk değistirdigini görür")
    public void kullanici_cikan_tüm_çözümler_alt_seceneklerin_clickable_oldugunu_ve_renk_değistirdigini_görür() {
        ReusableMethods.waitForClickablility(movita.okulServisleriTakipveKoltukSensorSistemleri,1000);
        ReusableMethods.waitForClickablility(movita.kameraliAracTakipSistemi,1000);
        ReusableMethods.waitForClickablility(movita.kisiBilgilendirmeSistemi,1000);
        ReusableMethods.waitForClickablility(movita.kisiNesneVeHayvanTakipSistemi,1000);
    }
    @Then("kullanici tüm çözümler alt secenekleri sirasiyla tıklar string ifadelerini dogrular")
    public void kullanici_tüm_çözümler_alt_secenekleri_sirasiyla_tıklar_string_ifadelerini_dogrular() {
        ReusableMethods.waitForClickablility(movita.cozumlerMenu,1000);
        movita.okulServisleriTakipveKoltukSensorSistemleri.click();
        String expected="OKUL SERVIS ARAÇLARI TAKIP SISTEMI";
        String actual=movita.cozumlerokulservisaracString.getText();
        Assert.assertEquals(expected,actual);
        ReusableMethods.waitForClickablility(movita.cozumlerMenu,1000);
        movita.kameraliAracTakipSistemi.click();
        String expected1="KAMERALI ARAÇ TAKIP SISTEMI";
        String actual1=movita.cozumlerKameraliaracTakipString.getText();
        Assert.assertEquals(expected1,actual1);
        ReusableMethods.waitForClickablility(movita.cozumlerMenu,1000);
        movita.kisiBilgilendirmeSistemi.click();
        String expected2="KIŞI BILGILENDIRME SISTEMI";
        String actual2=movita.cozumlerKisibilgiString.getText();
        Assert.assertEquals(expected2,actual2);
        ReusableMethods.waitForClickablility(movita.cozumlerMenu,1000);
        movita.kisiNesneVeHayvanTakipSistemi.click();
        String expected3="KIŞI VE NESNE/HAYVAN TAKIP SISTEMI";
        String actual3=movita.cozumlerKisiveNesneString.getText();
        Assert.assertEquals(expected3,actual3);

    }

    @Then("kullanıcı ÜRÜNLER yazisi üzerinde hoverover yapar")
    public void kullanıcı_ürünler_yazisi_üzerinde_hoverover_yapar() {
        ReusableMethods.hover(movita.urunlerMenu);
    }
    @Then("kullanici ÜRÜNLER yazisinin clickable olduguu görür")
    public void kullanici_ürünler_yazisinin_clickable_olduguu_görür() {
        ReusableMethods.waitForClickablility(movita.urunlerMenu,1000);
    }
    @Then("kullaici tüm ürünler alt seceneklerin üzerinde hoverover yapar")
    public void kullaici_tüm_ürünler_alt_seceneklerin_üzerinde_hoverover_yapar() {
        ReusableMethods.hover(movita.mnvr);
        ReusableMethods.hover(movita.mnvrPro);
        ReusableMethods.hover(movita.aracTakipCihazi);
        ReusableMethods.hover(movita.camTracker);
        ReusableMethods.hover(movita.akilliDirekSistemi);
    }
    @Then("kullanici cikan tüm ürünler alt seceneklerin clickable oldugunu ve renk değistirdigini görür")
    public void kullanici_cikan_tüm_ürünler_alt_seceneklerin_clickable_oldugunu_ve_renk_değistirdigini_görür() {
        ReusableMethods.waitForClickablility(movita.mnvr,100);
        ReusableMethods.waitForClickablility(movita.mnvrPro,100);
        ReusableMethods.waitForClickablility(movita.aracTakipCihazi,100);
        ReusableMethods.waitForClickablility(movita.camTracker,100);
        ReusableMethods.waitForClickablility(movita.akilliDirekSistemi,100);

    }
    @Then("kullanici tüm ürünler alt secenekleri sirasiyla tıklar string ifadelerini dogrular")
    public void kullanici_tüm_ürünler_alt_secenekleri_sirasiyla_tıklar_string_ifadelerini_dogrular() {
        ReusableMethods.waitForClickablility(movita.urunlerMenu,1000);
        movita.mnvr.click();
        String expected="MNVR";
        String actual=movita.urunlerMnvrString.getText();
        Assert.assertEquals(expected,actual);
        ReusableMethods.waitForClickablility(movita.urunlerMenu,1000);
        movita.mnvrPro.click();
        String expected12="MNVR Pro";
        String actual12=movita.urunlerMnvrProString.getText();
        Assert.assertEquals(expected12,actual12);
        ReusableMethods.waitForClickablility(movita.urunlerMenu,1000);
        movita.aracTakipCihazi.click();
        String expected22="ARAÇ TAKIP CIHAZI";
        String actual22=movita.urunleraracTakipcihaziString.getText();
        Assert.assertEquals(expected22,actual22);
        ReusableMethods.waitForClickablility(movita.urunlerMenu,1000);
        movita.camTracker.click();
        String expected32="ÜRÜNLER";
        String actual32=movita.urunlerCamtrakerString.getText();
        Assert.assertEquals(expected32,actual32);
        ReusableMethods.waitForClickablility(movita.urunlerMenu,1000);
        movita.akilliDirekSistemi.click();
        String expected41="AKILLI DIREK SISTEMI";
        String actual41=movita.urunlerAkillidirekString.getText();
        Assert.assertEquals(expected41,actual41);

    }
    @When("kullanici sayfayi asagi indirir ve dorduncu sectionda durur")
    public void kullanici_sayfayi_asagi_indirir_ve_dorduncu_sectionda_durur() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(5000);

    }
    @Then("kullanici verilen String ve sayisal verileri dogrular")
    public void kullanici_verilen_string_ve_sayisal_verileri_dogrular() {

        System.out.println(movita.satirKod900K.getText());
        System.out.println(movita.memnunMusteri1500.getText());
        System.out.println(movita.yillikDeneyim5.getText());
        System.out.println(movita.cozumler20.getText());
        System.out.println(movita.mobilMovitaText.getText());





    }
    @Then("kullanici arrow sign üzerinde hoverover yapar")
    public void kullanici_arrow_sign_üzerinde_hoverover_yapar() {
        ReusableMethods.clickWithTimeOut(movita.arrow,300);
    }
    @Then("kullanici arrow sign üzerinde renk degisikligini dogrular")
    public void kullanici_arrow_sign_üzerinde_renk_degisikligini_dogrular() {
        String color_before = movita.arrow.getCssValue("background-color");
        String color_b_hex = Color.fromString(color_before).asHex();

        ReusableMethods.hover(movita.arrow);
        ReusableMethods.waitForVisibility(movita.arrow, 500);

        String color_after = movita.arrow.getCssValue("background-color");
        String color_a_hex = Color.fromString(color_after).asHex();
        Assert.assertNotEquals(color_a_hex, color_b_hex);
    }
    @Then("kullanici arrow sign tiklar")
    public void kullanici_arrow_sign_tiklar() {
        movita.arrow.click();
    }
    @Then("kullanici arrow sign tiklayinca verilen stringi dogrular")
    public void kullanici_arrow_sign_tiklayinca_verilen_stringi_dogrular() {
        ReusableMethods.waitForVisibility(movita.hitapedencozümler,100);
        Assert.assertTrue("Tüm Sektörlere Hitap Eden Çözümler",movita.hitapedencozümler.isDisplayed());

    }





}
