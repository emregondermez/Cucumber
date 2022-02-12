Feature: US1006 negative login test

  Scenario:hmc negative login test
    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then login butonuna basar
    And giris yapilamdigini gorur
    Then sayfayi kapatir