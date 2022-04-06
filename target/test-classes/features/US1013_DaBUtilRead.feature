Feature:US1013 kullanici data base e baglanip bilgileri okur

  Scenario: TC18 kullanici tablo ve fielt ismi ile sorgulama yapabilmeli

    Given kullanici DBUtil ile HMC veri tabanina baglanir
    And kullanici DBUtil ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUtil ile "Price" sutunundaki verileri okur
    And DBUtil ile tum "Price" degerlerini sira numarasi ile yazdirir
    Then DBUtill ile 4. "Price" in 425 oldugunu test eder
