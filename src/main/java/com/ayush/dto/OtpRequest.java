package com.ayush.dto;

import lombok.Data;

@Data
public class OtpRequest
{
    private String identifier;
    private int length;
}
