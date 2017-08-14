package za.ac.mzilikazi.Services.Impl;

import za.ac.mzilikazi.Domain.Coupon;
import za.ac.mzilikazi.Repository.Impl.CouponRepositoryImpl;
import za.ac.mzilikazi.Services.CouponService;

/**
 * Created by Asavela on 2017/08/10.
 */
public class CouponServiceImpl implements CouponService {

    public static CouponServiceImpl couponService = null;

    CouponRepositoryImpl couponRepository = CouponRepositoryImpl.getInstance();

    public static CouponServiceImpl getInstance()
    {
        if (couponService == null)
            couponService = new CouponServiceImpl();
        return couponService;
    }

    public Coupon create(Coupon coupon){
        return couponRepository.create(coupon);    }

    public Coupon read(String couponID){
        return couponRepository.read(couponID);    }

    public Coupon update(Coupon coupon){
        return couponRepository.update(coupon);    }

    public void delete(String couponID)
    {
        couponRepository.delete(couponID);
    }

}
