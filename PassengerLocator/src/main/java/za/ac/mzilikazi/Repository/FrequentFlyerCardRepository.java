package za.ac.mzilikazi.Repository;

import za.ac.mzilikazi.Domain.FrequentFlyerCard;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface FrequentFlyerCardRepository {
    FrequentFlyerCard create(FrequentFlyerCard frequentFlyerCard);
    FrequentFlyerCard read (String FFCNumber);
    FrequentFlyerCard update(FrequentFlyerCard frequentFlyerCard);
    void delete(String FFCNumber);
}
