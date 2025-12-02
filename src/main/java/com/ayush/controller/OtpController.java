package com.ayush.controller;

import com.ayush.dto.OtpRequest;
import com.ayush.dto.OtpResponse;
import com.ayush.dto.OtpVerifyRequest;
import com.ayush.dto.VerifyOtpResponse;
import com.ayush.service.OtpService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/v1/otp")
@Slf4j
@RequiredArgsConstructor
public class OtpController {
    private final OtpService otpService;


    @PostMapping("/generate")
    public ResponseEntity<OtpResponse> generateOtp(@RequestBody OtpRequest request){
        log.info("Getting request to Generate OTP..");
        String otp= otpService.generateOtp(request.getIdentifier(), request.getLength());

        OtpResponse response = new OtpResponse();
        response.setMessage("OTP generated successfully");
        log.info("OTP is generated....");
        response.setOtp(otp);

        log.info("Setting generation date time....");
        response.setGeneratedAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/verify")
    public ResponseEntity<VerifyOtpResponse> verify(@RequestBody OtpVerifyRequest request){
        log.info("Getting request to verify OTP");
        log.info("Getting identifier and otp...");
        boolean isValid= otpService.verifyOtp(
                request.getIdentifier(),
                request.getOtp()
        );
        VerifyOtpResponse response = new VerifyOtpResponse();
        response.setMessage(isValid? "OTP verified successfully": "Invalid OTP");

        return ResponseEntity.ok(response);
    }
}
