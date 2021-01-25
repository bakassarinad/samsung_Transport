package def;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean menu = true;
		int option;
		Transport t = null;
		Scanner scan = new Scanner(System.in);
		while (menu) {
			option = scan.nextInt();
			switch (option) {
			
				case (1):
					System.out.println("type of Transport (1-Bus/2-Taxi: ");
					int type_transport = scan.nextInt();
					if (type_transport == 1) {
						t = new Bus();
					System.out.println("consumption: ");
						int consumption = scan.nextInt();
						((Bus) t).setConsumption(consumption);
						int maxFuelVolume = scan.nextInt();
						((Bus) t).setMaxFuelVolume(maxFuelVolume);
						int fuel = scan.nextInt();
						((Bus) t).setFuel(fuel);
						
						int fuelPrice = scan.nextInt();
						((Bus) t).setFuelPrice(fuelPrice);
						int money = scan.nextInt();
						((Bus) t).setMoney(money);
						int passengers = scan.nextInt();
						((Bus) t).setPassengers(passengers);
						int price = scan.nextInt();
						((Bus) t).setPrice(price);
					}
					else if (type_transport == 2) {
						t = new Taxi();
						int consumption_ = scan.nextInt();
						((Taxi) t).setConsumption(consumption_);
						int maxFuelVolume_ = scan.nextInt();
						((Taxi) t).setMaxFuelVolume(maxFuelVolume_);
						int fuel_ = scan.nextInt();
						((Taxi) t).setFuel(fuel_);
						
						int fuelPrice_ = scan.nextInt();
						((Taxi) t).setFuelPrice(fuelPrice_);
						int money_ = scan.nextInt();
						((Taxi) t).setMoney(money_);
						int pricePerHundredKm = scan.nextInt();
						((Taxi) t).setPricePerHundredKm(pricePerHundredKm);
						break;
					}
					break;
				case (2):
					if (t != null) {
						int km = scan.nextInt();
						t.drive(km);
					
					}
				break;
				case (3):
					if (t != null) {
						int fuel_ = scan.nextInt();
						int km_ = scan.nextInt();
						t.refill(fuel_, km_);
					}
				break;
				case (4):
					System.out.println(t.toString());
					break;
			}
		}
	}

}
