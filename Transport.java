package def;

public abstract class Transport implements Reffilable {
	public int consumption;
	public int fuel;
	public int maxFuelVolume;
	public int fuelPrice;
	public int money;
	public int money_ = 0;
	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		if (fuel > getMaxFuelVolume() || fuel < 0)
		{
			throw new IllegalArgumentException("fuel is physical parameter, it can be only on legal range.");
		}
		this.fuel = fuel;
	}

	public int getMaxFuelVolume() {
		return maxFuelVolume;
	}

	public void setMaxFuelVolume(int maxFuelVolume) {
		this.maxFuelVolume = maxFuelVolume;
	}

	public int getFuelPrice() {
		return fuelPrice;
	}

	public void setFuelPrice(int fuelPrice) {
		this.fuelPrice = fuelPrice;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Transport() {}
	public Transport(int consumption, int fuel, int maxFuelVolume, int money, int fuelPrice) {
		this.consumption = consumption;
		this.fuel = fuel;
		this.maxFuelVolume = maxFuelVolume;
		this.money = money;
		this.fuelPrice = fuelPrice;
		
	}
	
	public final int drive(int km) {
		int used_fuel = consumption * 100 * km;
		if (fuel < used_fuel) {
			throw new IllegalArgumentException("Value of fuel is under the estimated one, transport couod not be used for the launched driving!");	
		}else {
			return getIncome(km);
		}
	}
	
	public int refill(int fuel, int km) {
		this.fuel += fuel * 100;
		money_ -= fuelPrice * 100 * km;
		return fuel;
	}
	
	public abstract int getIncome(int km);
	
	public String toString() {
		return "consumption: " + consumption 
				+ "\nfuel: " + fuel
				+ "\nmaxFuelVolume: " + maxFuelVolume 
				+ "\nmoney: " + money
				+ "\nfuelPrice: " + fuelPrice;
	}
}


