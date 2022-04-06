Feature: US1012 kullanici data base e baglanip bilgileri okur

  @db
  Scenario: TC017 kullanici database baglanip istedigi bilgileri okuyabilmeli

    Given kullanici DBUtil ile HMC veri tabanina baglanir
    # database'e baglanacagiz
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    # Query calistiracagiz SELECT Price FROM tHOTELROOM
    And kullanici "Price" sutunundaki verileri okur
    #3.adimda database sorgusu sonunda bize dondurulen bilgiyi nasil kullanabilecegimizi gorecegiz
