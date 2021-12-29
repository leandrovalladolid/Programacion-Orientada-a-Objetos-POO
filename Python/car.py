from account import Account
class Car:
	id	=	int
	licence	=	str
	driver	=	Account ("","")
	passegenger	=	int

	def __init__(self, license, driver):
		self.licence = license
		self.driver = driver