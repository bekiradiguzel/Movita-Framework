@parametre
Feature: Movita Test

  Scenario: MQA-1 Çözümler Testi
    Given kullanici movita sayfasına gider
    Then kullanici movita anasayfada oldugunu dogrular
    And kullanıcı ÇÖZÜMLER yazisi üzerinde hoverover yapar
    Then kullanici ÇÖZÜMLER yazisinin clickable olduguu görür
    And  kullaici tüm çözümler alt seceneklerin üzerinde hoverover yapar
    Then kullanici cikan tüm çözümler alt seceneklerin clickable oldugunu ve renk değistirdigini görür
    And kullanici tüm çözümler alt secenekleri sirasiyla tıklar string ifadelerini dogrular
