package com.zosh.request;

import com.zosh.domain.VerificationType;

public class ForgotPasswordTokenRequest {
    private  String sendTo;

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public VerificationType getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(VerificationType verificationType) {
        this.verificationType = verificationType;
    }

    private VerificationType verificationType;
}
