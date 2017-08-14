package za.ac.mzilikazi.Services;

import za.ac.mzilikazi.Domain.Coupon;

/**
 * Created by Asavela on 2017/08/10.
 */
public interface CouponService {
    Coupon create(Coupon coupon);
    Coupon read (String couponID);
    Coupon update (Coupon coupon);
    void delete (String couponID);
}
