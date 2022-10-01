@parametre
Feature: Movita Test

  Scenario: MQA-1_movitaAnasayfaTesti
    Given kullanici movita sayfasına gider
    Then kullanici movita anasayfada oldugunu dogrular
    And kullanıcı ANASAYFA üzerinde hoverover yapar
    Then Kullanıcı ANASAYFA yazisinin renginin değiştiğini görür
    And kullanici ANASAYFA yazisinin  clickable olduğunu görür
    Then Kullanıcı ANASAYFA yazisini tıklar
    Then kullanici ekranda verilen stringi verify eder


