public class FlightManager {

    public FlightManager(){}


    public int getTotalBaggageAllowance(Flight flight) {
        return flight.getPlaneWeight() / 3;
    }

    public int getPassengerAllowance(Flight flight) {
        return getTotalBaggageAllowance(flight) / flight.getTotalPlaneCapacity();
    }

    public int getTotalBaggageBookedWeight(Flight flight) {
        return flight.getPassengers().size() * getPassengerAllowance(flight);
    }


    public int remainingBaggageAllowance(Flight flight) {
        return getTotalBaggageAllowance(flight) - getTotalBaggageBookedWeight(flight);
    }
}
