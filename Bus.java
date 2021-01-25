package def;

public class Bus extends Transport{
	public int passengers;
	public int price;
	
	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public Bus(int consumption, int fuel, int maxFuelVolume, int fuelPrice, int money, int passengers, int price) {
		super(consumption, fuel, maxFuelVolume, fuelPrice, money);
		this.passengers = passengers;
		this.price = price;
	}
	public Bus() {}
	
	@Override
	public int getIncome(int km) {
		return passengers * price * 100 * km - fuelPrice * 100 * km;
	}


	
}
