import people.CabinCrew;
import people.Passenger;
import people.Pilot;

import java.sql.Array;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departure;
    private String timeOfDeparture;
    private int totalBags;

    public Flight(String flightNumber, PlaneType planeType, String destination, String departure, String timeOfDeparture) {
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.destination = destination;
        this.departure = departure;
        this.timeOfDeparture = timeOfDeparture;
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.totalBags = 0;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }
    public int getPlaneWeight() {
        return this.planeType.getWeight();
    }

    public int getTotalPlaneCapacity() {
        return this.planeType.getSeatCapacity();
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureLocation() {
        return this.departure;
    }

    public String getDepartureTime() {
        return timeOfDeparture;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public ArrayList<Pilot> getPilots() {
        return this.pilots;
    }

    public void addCabinCrew(CabinCrew cabinCrew) {
        this.cabinCrew.add(cabinCrew);
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return this.cabinCrew;
    }

    public int returnEmptySeats() {
        return planeType.getSeatCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.returnEmptySeats() > 0) {
            passengers.add(passenger);
            this.totalBags += passenger.getNumberOfBags();
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public int getTotalBags() {
        return totalBags;
    }
}
