// Author: Nick Korintus
//
// The ParkingTicket class represents a parking ticket.

public class ParkingTicket
{
	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private double minutes;

	private final double BASE_FINE = 25.0;
	private final double HOURLY_FINE = 10.0;


	// Constructor
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, double min)
	{
		//super();
		this.car = new ParkedCar(car);
		this.officer = new PoliceOfficer(officer);
		minutes = min;

		calculateFine();
	}


	// Copy constructor
	public ParkingTicket(ParkingTicket object2)
	{
		//super();
		car = object2.car;
		officer = object2.officer;
		minutes = object2.minutes;

		calculateFine();
	}


	// calculateFine method
	public void calculateFine()
	{
		double hours = minutes/60.0;
		int hoursAsInt = (int) hours;

		if ((hours - hoursAsInt) > 0)
		{
			hoursAsInt++;
		}

		// Assign the base fine.
		fine = BASE_FINE;

		// Add the additional hourly fines.
		fine += (hoursAsInt * HOURLY_FINE);
	}


	// setCar method
	public void setCar(ParkedCar car)
	{
		this.car = car;
	}


	// setOfficer method
	public void setOfficer(PoliceOfficer officer)
	{
		this.officer = officer;
	}


	// getCar method
	public ParkedCar getCar()
	{
		return new ParkedCar(car);
	}


	// getFine method
	public double getFine()
	{
		return fine;
	}


	// getOfficer method
	public PoliceOfficer getOfficer()
	{
		return new PoliceOfficer(officer);
	}


	// toString method
	public String toString()
	{
		String str = "Minutes Parked Illegally: " + minutes + "\nFine Amount: $" + fine;
		return str;
	}
}