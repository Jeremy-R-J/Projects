class BankAccount:
    def __init__(self , int_rate, balance):
        self.int_rate = int_rate
        self.balance = 0	
	def deposit(self , amount):
		self.balance += amount
        return self
	def withdraw(self, amount):
		self.balance -= amount
        return self
	def display_account_info(self):
		print self.balance
	def yield_interest(self):
		self.interest += balance*int_rate
        return self

account1 = BankAccount('3','100')
print(account1.balance)