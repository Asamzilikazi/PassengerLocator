package za.ac.mzilikazi.Services.Impl;

import za.ac.mzilikazi.Domain.Luggage;
import za.ac.mzilikazi.Repository.Impl.LuggageRepositoryImpl;

/**
 * Created by Asavela on 2017/08/10.
 */
public class LuggageServiceImpl {
    public static LuggageServiceImpl luggageService = null;

    LuggageRepositoryImpl luggageRepository = LuggageRepositoryImpl.getInstance();

    public static LuggageServiceImpl getInstance()
    {
        if (luggageService == null)
            luggageService = new LuggageServiceImpl();
        return luggageService;
    }

    public Luggage create(Luggage luggage){
        return luggageRepository.create(luggage);    }

    public Luggage read(String luggageNumber){
        return luggageRepository.read(luggageNumber);    }

    public Luggage update(Luggage luggage){
        return luggageRepository.update(luggage);    }

    public void delete(String luggageNumber)
    {
        luggageRepository.delete(luggageNumber);
    }

}
