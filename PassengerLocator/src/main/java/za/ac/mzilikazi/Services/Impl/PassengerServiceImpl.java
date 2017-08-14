package za.ac.mzilikazi.Services.Impl;

import za.ac.mzilikazi.Domain.Passenger;
import za.ac.mzilikazi.Repository.Impl.PassengerRepositoryImpl;

/**
 * Created by Asavela on 2017/08/10.
 */
public class PassengerServiceImpl {
    public static PassengerServiceImpl passengerService = null;

    PassengerRepositoryImpl passengerRepository = PassengerRepositoryImpl.getInstance();

    public static PassengerServiceImpl getInstance()
    {
        if (passengerService == null)
            passengerService = new PassengerServiceImpl();
        return passengerService;
    }

    public Passenger create(Passenger passenger){
        return passengerRepository.create(passenger);    }

    public Passenger read(String passengerID){
        return passengerRepository.read(passengerID);    }

    public Passenger update(Passenger passenger){
        return passengerRepository.update(passenger);    }

    public void delete(String passengerID)
    {
        passengerRepository.delete(passengerID);
    }

}
