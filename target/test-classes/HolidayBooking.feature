Feature: Search and Book Holidays
  Scenario: Search and Book Holidays
    Given i enter url as "https://www.hoseasons.co.uk/"
    When i click on holiday park button

    Then i should see url as "https://www.hoseasons.co.uk/holiday-parks"
    When i click on Region field
    When i click on Northern Highland link
    When i click on date field
    When i click on  25 from calander
    When i select "7 Nights" from duration drop down menu
    When i select "Exact" from   flexibility drop down menu
    When i click on Done
    When i click on Search button
    Then i should see search url as "https://www.hoseasons.co.uk/holiday-parks/northern-highlands?adult=2&child=0&infant=0&pets=0&nights=7&range=7&start=25-12-2020"
    When i click Ben nevis holiday park title
    And i should see Ben Nevis Holiday Park page title
    When i click on Highland premier Link
    Then i should see result url as "https://www.hoseasons.co.uk/holiday-parks/ben-nevis-holiday-park-ochy/highland-premier-lp18023?adult=2&nights=7&range=7&start=25-12-2020"
    And i should see Highland Premier page title
    When i click on book your holiday button
    When i select "Mr" from title drop down menu
    Given i enter "HP" in the name field
    Given i enter "PATEL" in the surname field
    Given i enter "yahoo1@gmail.com" in email field
    Given i enter "yahoo1@gmail.com" in confirm email field
    Given i enter "78707335748" in the phone field
    And i select "2" from adult drop down menu
    And i select "2" from children drop down menu
    And i select "1" from Babies drop down menu
    And i select "0" from Pet drop down menu
    When i select "family" from type of party drop down menu
    Given i enter "HA8 5NR" from your address field
    When i click on Find address button
    When i click "10a queensbury station aprade" from address drop down menu
    When i click on Continue securely














