package za.ac.mzilikazi.Services;

import za.ac.mzilikazi.Domain.Passenger;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface PassengerService {
    Passenger create(Passenger passenger);
    Passenger read (String passengerID);
    Passenger update(Passenger passenger);
    void delete(String passenger);
}
