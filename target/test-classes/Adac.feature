Feature: Booking a hotel in Adactin Hotel application.

  Scenario Outline: Enter username and password,Search Hotel,Select a hotel,Book a hotel,finally get a order id.
    Given User is on adactin Page #browser ,url-->predefined
    When User need to enter "<Username>" and "<Password>" on home page
    And User need to click login
    When User need to search by selecting "<location>","<hotels>","<room type>","<roomNos>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<ChildrensPerRoom>"
    And Click the Search
    When User need to select Hotel
    And click on Continue
    When User need to enter "<firstname>","<lastname>","<address>","<cardnum>","<cardtype>","<expirymonth>","<expiryyear>","<cvvnum>"
    And User need to click Book Now option
    Then Finally user is on Confirmation page

    Examples: 
      | Username     | Password | location | hotels      | room type | roomNos | checkInDate | checkOutDate | adultsPerRoom | ChildrensPerRoom | firstname | lastname | address | cardnum          | cardtype         | expirymonth | expiryyear | cvvnum |
      | rushanrushan | Rushan   | Paris    | Hotel Creek | Double    | 2 - Two | 23/05/2021  | 24/05/2021   | 1 - One       | 2 - Two          | Rushan    | Ahamed   | chennai | 4356765435676543 | American Express | June        |       2020 |    876 |
