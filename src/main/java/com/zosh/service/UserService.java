package com.zosh.service;

import com.zosh.domain.VerificationType;
import com.zosh.modal.User;

import java.util.Optional;

public interface UserService {
    public User findUserProfileByJwt(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
     public Optional<User> findUserById(Long  userId) throws Exception;
     public User enableTwofactorAuthentication(VerificationType verificationType, String sendTo, User user);
     User updatePassword(User user, String newPassword);


}
