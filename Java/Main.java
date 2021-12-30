class Main {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Kia", "Picanto");
		uberX.setPassenger(3);
		uberX.printDataCar();

		UberVan uberVan = new UberVan("LIC123", new Account("Dri123", "Doc123"));
		uberVan.setPassenger(6);
		uberVan.printDataCar();
	}
}