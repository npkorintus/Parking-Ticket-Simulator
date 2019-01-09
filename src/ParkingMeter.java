// Author: Nick Korintus
//
// The ParkingMeter class holds data about a parking meter.

public class ParkingMeter
{
	private double minPurchased;		// Number of minutes of parking time purchased.


	// Constructor
	public ParkingMeter (double minutes)
	{
		minPurchased = minutes;
	}


	// setMinutesPurchased
	public void setMintuesPurchased(double minutes)
	{
		minPurchased = minutes;
	}

	// getMinutesPurchased method
	public double getMinutesPurchased()
	{
		return minPurchased;
	}
}