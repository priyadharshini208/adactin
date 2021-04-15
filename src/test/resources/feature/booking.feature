Feature: to enter values for booking
@sanity
  Scenario Outline: to validate booking functionality
    Given user is in adactin home page
    When user enters valid "<username>" and valid "<password>"
      | dharshu208 | 88G43T |
    And user clicks login button
    And user selects"<Location>","<Hotels>","<Room type>","<RoomCount>","<AdultsCount>","<ChildrenCount>" and click search button
    And user selects the hotel and clicks continue
    And user enters "<First>","<Last>","<address>","<cardNo>","<cardType>","<month>","<year>","<cvv>" and click booknow
     Then user in confirmation page
    Examples:
      | Location | Hotels         | Room type | RoomCount | AdultsCount | ChlidrenCount |  | First | Last    | address | cardNo           | cardType   | month    | year | cvv |
      | Sydney  | Hotel Creek    | Double    |         2 |           3 |             1 |  | priya | dharsha | chennai | 1234432156788765 | VISA       | December | 2022 | 345 |
      | Paris    | Hotel Sunshine | Deluxe    |         1 |           2 |             0 |  | devi  | priya   | madurai | 5432234598766789 | mastercard | August   | 2022 | 433 |
   

 