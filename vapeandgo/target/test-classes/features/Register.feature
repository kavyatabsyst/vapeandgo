Feature: vape and go testing

Scenario: user register testing

    Given vape link
    When click on Account
    And Enter first name "shithin"
    And Enter last name "km"
    And Enter date of birth "11-09-1995"
    And Enter vapeemail "tabsyst.shithin@gmail.com"
    And Enter signin password "shithin123"
    And Enter confirm password "shithin123"
    And click vaperegister