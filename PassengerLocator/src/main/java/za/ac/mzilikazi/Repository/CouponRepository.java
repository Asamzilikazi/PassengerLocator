package za.ac.mzilikazi.Repository;

import za.ac.mzilikazi.Domain.Coupon;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface CouponRepository {
    Coupon create(Coupon coupon);
    Coupon read (String couponID);
    Coupon update(Coupon coupon);
    void delete(String couponID);
}
