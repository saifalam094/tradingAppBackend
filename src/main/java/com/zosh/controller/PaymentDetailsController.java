package com.zosh.controller;

import com.zosh.modal.PaymentDetails;
import com.zosh.modal.User;
import com.zosh.service.PaymentDetailsService;
import com.zosh.service.UserService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentDetailsController {
    @Autowired
    private UserService userService;
    @Autowired
    private PaymentDetailsService paymentDetailsService;
    @PostMapping("/payment-details")
    public ResponseEntity<PaymentDetails> addPaymentDetails(
            @RequestBody PaymentDetails paymentDetailsRequest,
            @RequestHeader("Authorization") String jwt
    ) throws Exception {
        User user=userService.findUserProfileByJwt(jwt);
        PaymentDetails paymentDetails=paymentDetailsService.addPaymentDetails(
                paymentDetailsRequest.getAccountNumber(),
                paymentDetailsRequest.getAccountHolderName(),
                paymentDetailsRequest.getIfsc(),
                paymentDetailsRequest.getBankName(),
                user
        );
        return new ResponseEntity<>(paymentDetails, HttpStatus.CREATED);
    }
    @GetMapping("/payment-details")
    public  ResponseEntity<PaymentDetails> getUserPaymentDetails(
            @RequestHeader("Authorization") String jwt
    ) throws Exception{
        User user=userService.findUserProfileByJwt(jwt);
        PaymentDetails paymentDetails= paymentDetailsService.getUserPaymentDetails(user);
        return new ResponseEntity<>(paymentDetails,HttpStatus.CREATED);

    }
}
