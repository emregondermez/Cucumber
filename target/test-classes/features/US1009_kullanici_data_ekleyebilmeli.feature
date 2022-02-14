
Feature: US1009_kullanici_data_ekleyebilmeli

  @editor
  Scenario Outline: TC13 kullanici kayit
  When kullanici "EditorUrl" sayfasina gider
  Then new butonuna basar
  And firstname kutusuna "<firstname>" girer
  And lastname kutusuna "<lastname>" girer
  And position kutusuna "<position>" girer
  And office kutusuna "<office>" girer
  And extesion kutusuna "<extension>" girer
  And start date kutusuna "<startDate>" girer
  And salary kutusuna "<salary>" girer
  And Create tusuna basar
  When kullanici "<firstname>" isim ile arama yapar
  Then isim bolumunde isminin oldugunu dogrular
  And sayfayi kapatir

Examples:
    |firstname|lastname|position|office|extension|startDate|salary|
    |emre|gon|Qa|amsterdam|kul|2022-01-01|4000|
    |king|gon|Qa|amsterdam|kul|2022-01-01|4000|
    |yes sir|gon|Qa|amsterdam|kul|2022-01-01|4000|
