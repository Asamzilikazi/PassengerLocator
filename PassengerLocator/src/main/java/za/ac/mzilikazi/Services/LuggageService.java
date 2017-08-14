package za.ac.mzilikazi.Services;

import za.ac.mzilikazi.Domain.Luggage;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface LuggageService {
    Luggage create(Luggage luggage);
    Luggage read (String luggageNumber);
    Luggage update(Luggage luggage);
    void delete(String luggageNumber);
}
