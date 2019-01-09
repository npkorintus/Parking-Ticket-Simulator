// Nick Korintus
//
//	This program demonstrates a set of classes working together
//	to simulate a police officer issuing a parking ticket.

public class Demo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Create a parked car object.
		ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red", "147RHZM", 125);

		// Create a parking meter object.
		ParkingMeter meter = new ParkingMeter(60);

		// Create a police officer object.
		PoliceOfficer officer = new PoliceOfficer("Joe Friday", "4788");

		// Create a parking ticket object.
		ParkingTicket ticket = officer.patrol(car, officer, meter);

		// Display Car data
		System.out.println(car);

		System.out.println();

		// Display Officer data
		System.out.println(officer);

		System.out.println();

		// Check if a ticket was issued and display results
		if (ticket == null)
			System.out.println("No crimes committed.");
		else
			System.out.println(ticket);


		System.out.println();
		System.out.println();
	}
}
