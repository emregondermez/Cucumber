Feature: US1001_amazon_search.feature

  Background: Amazon Ana Sayfa
    Given kullanici amazon sayfasina gider

  Scenario: TC01_Amazon iPhone Search Test

    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder

  Scenario: TC02_Amazon tea pot Search Test
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

  Scenario: TC03_Amazon flower Search Test
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
