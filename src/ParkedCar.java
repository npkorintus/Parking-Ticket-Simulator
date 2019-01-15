// Author: Nick Korintus
//
// The ParkdedCar class holds data about a parked car.


public class ParkedCar
{
	private String make;
	private String model;
	private String color;
	private String licenseNum;
	private double minParked;

	// Constructor
	public ParkedCar (String make, String model, String color, String licenseNum, double minParked)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNum = licenseNum;
		this.minParked = minParked;
	}

	// Copy constructor
	public ParkedCar(ParkedCar object2)
	{
		make = object2.make;
		model = object2.model;
		color = object2.color;
		licenseNum = object2.licenseNum;
		minParked = object2.minParked;
	}

	// setMake method
	public void setMake(String make)
	{
		this.make = make;
	}

	// setModel method
	public void setModel(String model)
	{
		this.model = model;
	}

	// setColor method
	public void setColor(String color)
	{
		this.color = color;
	}

	// setLicenseNumber method
	public void setLicenseNumber(String licenseNum)
	{
		this.licenseNum = licenseNum;
	}

	// setMinutesParked method
	public void setMinutesParked(double minParked)
	{
		this.minParked = minParked;
	}

	// getMake method
	public String getMake()
	{
		return make;
	}

	// getModel method
	public String getModel()
	{
		return model;
	}

	// getColor method
	public String getColor()
	{
		return color;
	}

	// getLicense method
	public String getLicenseNumber()
	{
		return licenseNum;
	}

	// getMinParked method
	public double getMinutesParked()
	{
		return minParked;
	}

	// toString method
	public String toString()
	{
		String str = "Car Data: \nMake: " + make + "\nModel: " + model + "\nColor: " + color +
				"\nLicense Number: " + licenseNum + "\nMinutes Parked: " + minParked;
		return str;
	}
}
