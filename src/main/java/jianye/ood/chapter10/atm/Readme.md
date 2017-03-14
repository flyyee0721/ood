##Case study: design a simple banking system
* Key components:
  1. Bank
  2. Atm machines.
  3. Account
* Account
  1. Attributes: **id, user, open date, interest rate, balance** 
  2. Methods: 
    * Deposit money
    * Withdraw money
    * Accessor and mutator functions of id, user, balance and interest rate.
    * Accessor of open date.
    
* Bank
  1. Attributes: **name, list of accounts, uuid generator**
  2. Methods: Add an account, close an account.
  