package com.ayush.dto;

import lombok.Data;

@Data
public class OtpVerifyRequest
{
    private String identifier;
    private String otp;
}
