package za.ac.mzilikazi.Repository.Impl;

import za.ac.mzilikazi.Domain.Luggage;
import za.ac.mzilikazi.Repository.LuggageRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asavela on 2017/08/10.
 */
public class LuggageRepositoryImpl implements LuggageRepository {
    public static LuggageRepositoryImpl luggageRepository = null;

    private Map<String, Luggage> luggageMap;

    private LuggageRepositoryImpl(){
        luggageMap = new HashMap<String, Luggage>();
    }

    public static LuggageRepositoryImpl getInstance()
    {
        if(luggageRepository == null)
            luggageRepository = new LuggageRepositoryImpl();
        return luggageRepository;
    }

    public Luggage create (Luggage luggage){
        luggageMap.put(luggage.getLuggageNumber(),luggage);
        Luggage saveLuggage = luggageMap.get(luggage.getLuggageNumber());
        return saveLuggage;
    }

    public Luggage read (String luggageNumber){
        Luggage readLuggage = luggageMap.get(luggageNumber);
        return readLuggage;
    }

    public Luggage update (Luggage luggage){
        luggageMap.put(luggage.getLuggageNumber(),luggage);
        Luggage updateLuggage = luggageMap.get(luggage.getLuggageNumber());
        return updateLuggage;
    }

    public void delete (String luggageNumber){
        luggageMap.remove(luggageNumber);


    }

}
