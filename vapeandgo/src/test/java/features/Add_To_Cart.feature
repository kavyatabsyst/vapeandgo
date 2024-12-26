Feature: Vape and Goadd to test Testing

Scenario: Add a product to cart

    Given open vape store link
    When click onnn Account
    And enter sign-in email "tabsyst.shithin@gmail.com"
    And enter sign-in password "shithin123"
    And click sign-in
    And scroll and click on more new products
    And select a product
    And select flavourrr
    And seleccct quantity
    And click add to cart
    And close cartt

Scenario: Add a product to cart from wishlist

    Given open vape store link
    When click onnn Account
    And enter sign-in email "tabsyst.shithin@gmail.com"
    And enter sign-in password "shithin123"
    And click sign-in
    And click wishlist icon
    And click wishlist add to cart
    And click delete icon
    And close cartt
    
Scenario: Attempt to add an out-of-stock product to the cart
    
    Given open vape store link
    When click onnn Account
    And enter sign-in email "tabsyst.shithin@gmail.com"
    And enter sign-in password "shithin123"
    And click sign-in
    And scroll and click on more new products
    And click one vape
    And select ml
    And click notify me
    And Enter notify email "tabsyst.shithin@gmail.com"
    And Enter notify number "9998788976"
    And submit notify me
    And close cartt
    
    
