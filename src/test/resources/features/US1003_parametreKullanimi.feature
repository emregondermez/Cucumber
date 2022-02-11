Feature: US1003 parametre ile step definitions olusturma

  Scenario: T05_Parametre kullanimi
    Given kullanici amazon sayfasina gider
    And "iPhone" icin arama yapar
    Then sonuclarin "iPhone" icerdigini test eder
    And sayfayi kapatir