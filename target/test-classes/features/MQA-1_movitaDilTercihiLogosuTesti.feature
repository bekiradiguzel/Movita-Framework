@parametre
Feature: Movita Test

  Scenario: MQA-1 Movita Dil Tercihi Logosu Testi
    Given kullanici movita sayfasına gider
    Then kullanici Dil Tercihi Logosu üzerinde hoverover yapar
    And kullanici Dil Tercihi Logosu üzerine geldiğinde clickable oldugunu görür
    And kullanici Dil Tercihi Logosu tıklar
    And kullanici Englisch secenegini tıklar
    Then kullanici ekranda verilen ingilizce stringi görmelidir
    And kullanici Türkçe yazisini tıklar
    Then kullanici ekranda verilen Türkçe stringi görmelidir