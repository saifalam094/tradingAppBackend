package com.zosh.repository;

import com.zosh.modal.ForgotPasswordToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordToken ,String> {
    ForgotPasswordToken findByUserId(Long  userId);
}
