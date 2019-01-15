// Author: Nick Korintus
//
// The PoliceOfficer class simulates a police officer inspecting parked cars

public class PoliceOfficer
{
	private String officerName;
	private String officerBadge;

	// Constructor
	public PoliceOfficer (String name, String badge)
	{
		officerName = name;
		officerBadge = badge;
	}

	// Copy constructor
	public PoliceOfficer (PoliceOfficer object2)
	{
		officerName = object2.officerName;
		officerBadge = object2.officerBadge;
	}

	// setName method
	public void setName(String name)
	{
		officerName = name;
	}

	// setBadgeNumber method
	public void setBadgeNumber(String badge)
	{
		officerBadge = badge;
	}

	// getName method
	public String getName()
	{
		return officerName;
	}

	// getBadgeNumber method
	public String getBadgeNumber()
	{
		return officerBadge;
	}

	// patrol method
	public ParkingTicket patrol(ParkedCar car, PoliceOfficer officer, ParkingMeter meter)
	{
		ParkingTicket ticket = null;

		double expiredMin = car.getMinutesParked() - meter.getMinutesPurchased();

		if(expiredMin > 0)
			ticket = new ParkingTicket(car, officer, expiredMin);

		return ticket;
	}

	// toString method
	public String toString()
	{
		String str = "Officer Data: \nOfficer Name: " + officerName + "\nBadge Number: " + officerBadge;

		return str;
	}
}
