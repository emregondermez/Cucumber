Feature: US1008_farkliDegerlerIleNegatifLogin Test
  Scenario Outline: TC12 farkli Degerler Ile Negatif Login Test
    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    And scenario outline'dan username olarak "<Username>" girer
    And scnario outline'dan password olarak "<password>" girer
    Then login butonuna basar
    And giris yapilamdigini gorur
    And sayfayi kapatir


    Examples:
    |Username|password|
    |Manager|managerr|
    |MManager|m**ger|
    |username|king^^|


