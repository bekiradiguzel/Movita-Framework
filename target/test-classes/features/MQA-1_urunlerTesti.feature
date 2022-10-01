@parametre
Feature: Movita Test

  Scenario: MQA-1 Ürünler Testi
    Given kullanici movita sayfasına gider
    Then kullanici movita anasayfada oldugunu dogrular
    And kullanıcı ÜRÜNLER yazisi üzerinde hoverover yapar
    Then kullanici ÜRÜNLER yazisinin clickable olduguu görür
    And  kullaici tüm ürünler alt seceneklerin üzerinde hoverover yapar
    Then kullanici cikan tüm ürünler alt seceneklerin clickable oldugunu ve renk değistirdigini görür
    And kullanici tüm ürünler alt secenekleri sirasiyla tıklar string ifadelerini dogrular
