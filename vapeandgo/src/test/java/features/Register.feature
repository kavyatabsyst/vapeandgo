Feature: vape and go testing

Scenario: user register testing

    Given vape link
    When click on Account
    And Enter first name "nandhana"
    And Enter last name "km"
    And Enter date of birth "11-09-1998"
    And Enter vapeemail "tabsyst.nandanat@gmail.com"
    And Enter signin password "nandhu123"
    And Enter confirm password "nandhu123"
    And click vaperegister