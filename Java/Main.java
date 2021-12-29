class Main {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));

		car.passegenger = 4;
		System.out.println("Car License: " + car.license);
		
		
		Car car2 = new Car("QWE123", new Account("Martha", "asd"));
		car2.printDataCar();
	}
}