Feature: easyjet flight booking

Scenario: Booking flight
    Given user opens browser
    Then user is on homepage
    Then user clicks on oneway
    Then user enters flights details
    Then user selects the departing date 
    Then user clicks on show flights
    Then user select the flight
    Then user clicks Nextseats
    Then user navigates to seatselection
    Then user fills passengerdetails