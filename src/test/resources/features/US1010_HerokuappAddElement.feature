Feature: US1010 HerokuApp Add Element Test

  @hero
  Scenario: TC15 sonradan gorunen elemanlar calismali

    Given kullanici "HerokuAppAddElementUrl" sayfasina gider
     And Add Element butonuna basar
     Then Delete butonu gorununceye kadar bekler
    And Delete butonuna basarak butonu siler
    And sayfayi kapatir

