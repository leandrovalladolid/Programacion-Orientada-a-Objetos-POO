from car import Car
from account import Account
if __name__ == "__main__":
	print("Hola Mundo")
	
	car = Car("LIC123", Account("NOM123", "DOC123"))
	print(vars(car))
	print(vars(car.driver))




	'''
	car = Car()
	car.licence = "AMS123"
	car.driver = "Andres Herrera"
	print(vars(car))

	car2 = Car()
	car2.licence = "QWE123"
	car2.driver = "Martha Gómez"
	print(vars(car2))
	'''