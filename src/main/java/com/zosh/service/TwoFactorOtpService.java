package com.zosh.service;

import com.zosh.modal.TwoFactorOTP;
import com.zosh.modal.User;

import java.util.Optional;

public interface TwoFactorOtpService {
    TwoFactorOTP createTwoFactorOtp(User user, String otp, String jwt);
     TwoFactorOTP findByUser(Long userId);
     Optional<TwoFactorOTP> findById(String id);
     boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP ,String otp);
      void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);
}
