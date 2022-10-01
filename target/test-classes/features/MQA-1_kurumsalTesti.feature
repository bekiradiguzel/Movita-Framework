@parametre
Feature: Movita Test

  Scenario: MQA-1 Kurumsal Testi
    Given kullanici movita sayfasına gider
    Then kullanici movita anasayfada oldugunu dogrular
    And kullanıcı KURUMSAL yazisi üzerinde hoverover yapar
    Then kullanici KURUMSAL yazisinin clickable olduguu görür
    And  kullaici tüm kurumsal alt seceneklerin üzerinde hoverover yapar
    Then kullanici cikan tüm kurumsal alt seceneklerin clickable oldugunu ve renk değistirdigini görür
    And kullanici tüm kurumsal alt secenekleri sirasiyla tıklar string ifadelerini dogrular
