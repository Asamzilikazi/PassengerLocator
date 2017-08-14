package za.ac.mzilikazi.Repository;

import za.ac.mzilikazi.Domain.Passenger;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface PassengerRepository {
    Passenger create(Passenger luggage);
    Passenger read (String passengerID);
    Passenger update(Passenger luggage);
    void delete(String passengerID);
}
