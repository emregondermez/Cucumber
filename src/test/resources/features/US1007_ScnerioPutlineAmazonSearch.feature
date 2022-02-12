Feature: US1007 Scenario_ Outline_ ile Amazon Search
  Scenario Outline: TC12 Amazon'da bir listedeki tum elemntleri arama
    Given kullanici amazon sayfasina gider
    And "<aranacakEleman>" icin arama yapar
    Then sonuclarin "<aranacakEleman>" icerdigini test eder
    And  sayfayi kapatir
    
    Examples:
      |aranacakEleman|
      |Apple|
      |Java|
      |Samsung|
      |nutella|
