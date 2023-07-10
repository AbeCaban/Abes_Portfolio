# Abraham Caban Rios 9/18/2022 module 9
# Using classes to create a banking program.



# Base Class
class BankAccount:
    """ """
    def __init__(self, accountNumber, balance):
        self.accountNumber = accountNumber
        self.balance = float(balance)
    
    def getAcount(self):
        return self.accountNumber()
    
    def withdrawl(self):
        w = float(w)
        balance = balance - w
        return self.balance

    def deposit(self):
        d = float(d)
        balance = balance + d
        return self.balance

    def getBalance(self):
        return self.balance

# Sub Class
class CheckingAccount(BankAccount):

    def __init__(self, accountNumber, balance):
        """ """
        super().__init__(accountNumber, balance)
        self.fees = 5
        self.minimumBalance = 50
   
    def deductFees(self):
        try:
         if self.balance <= 50:
          self.balance = float(self.balance - self.fees)
          return self.balance
        except Exception as e:
         print(e)

    def checkMinimumBalance(self):
        if float(self.balance) <= 50:
            print(f"Minimum balance reached. Your account will be deducted ${self.fees}")
            return True
        else:
            print(f"Your balance is above the minimum required. Your balance is ${self.balance}")
            return False 
        
    
    
# Sub Class
class SavingsAccount(BankAccount):
    """ """
    def __init__(self, accountNumber, balance):
        super().__init__(accountNumber, balance)
        self.interestRate = 0.02    
    def addInterest(self):

     self.balance = self.balance + (self.balance * self.interestRate)
     return self.balance
    
    

ba = BankAccount(849849, 200)
ca = CheckingAccount(849889, 200)
sa = SavingsAccount(436546, 200)

print("The account balance starts with $200")
print("Checkings Account balance", ca.getBalance())
print("Savings Account balance", sa.getBalance())
ca.checkMinimumBalance()
print("Savings balance", sa.addInterest())

ba = BankAccount(849849, 25)
ca = CheckingAccount(849889, 25)
sa = SavingsAccount(436546, 25)

print("\nThe account balance starts with $25")
print("Checkings Account getBalance", ca.getBalance())
ca.checkMinimumBalance()
print("Checkings Account deductFees", ca.deductFees())


print("To run again press r to exit press x.")
i = input("please enter your choice: ")

while i != 'x':

    if i == 'r':
        ba = BankAccount(849849, 200)
        ca = CheckingAccount(849889, 200)
        sa = SavingsAccount(436546, 200)
        
        print("The account balance starts with $200")
        print("Checkings Account balance", ca.getBalance())
        print("Savings Account balance", sa.getBalance())
        ca.checkMinimumBalance()
        print("Savings balance", sa.addInterest())

        ba = BankAccount(849849, 25)
        ca = CheckingAccount(849889, 25)
        sa = SavingsAccount(436546, 25)
        
        print("\nThe account balance starts with $25")
        print("Checkings Account getBalance", ca.getBalance())
        ca.checkMinimumBalance()
        print("Checkings Account deductFees", ca.deductFees())
        
    elif i == "x":
     break

    i = input("Please to run again press r to exit press x: ")
