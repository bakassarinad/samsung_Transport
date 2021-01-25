package def;

public class Taxi extends Transport{
	int pricePerHundredKm;
	
	public int getPricePerHundredKm() {
		return pricePerHundredKm;
	}


	public void setPricePerHundredKm(int pricePerHundredKm) {
		this.pricePerHundredKm = pricePerHundredKm;
	}


	public Taxi(int pricePerHundredKm, int consumption, int fuel, int maxFuelVolume, int fuelPrice, int money) {
		super(consumption, fuel, maxFuelVolume, fuelPrice, money);
		this.pricePerHundredKm = pricePerHundredKm;
	}
	
	public Taxi() {}
	@Override
	public int getIncome(int km) {
		return pricePerHundredKm * 100 * km - fuelPrice * 100 * km;
	}







}
