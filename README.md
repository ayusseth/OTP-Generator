<h1 align="center">🔐 OTP Verification System (Spring Boot)</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge" />
  <img src="https://img.shields.io/badge/SLF4J-Logging-blueviolet?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-Production%20Ready-blue?style=for-the-badge" />
</p>

<hr/>

<h2>🚀 Overview</h2>
<p>
This project is a fully functional, secure, and production-style <b>OTP Generation & Verification System</b> built using <b>Spring Boot</b>.  
It delivers OTP creation using <b>SecureRandom</b>, in-memory storage, verification flow, expiration logic, custom exceptions, and <b>structured request/response DTOs</b>.  
To ensure complete visibility of system operations, the project also uses <b>SLF4J Logger</b> for clean and meaningful logging throughout the application.
</p>

<hr/>

<h2>✨ Features</h2>
<ul>
  <li>🔢 <b>Secure OTP Generation</b> using <code>SecureRandom</code></li>
  <li>⏳ OTP Expiration Validation</li>
  <li>🗂️ In-Memory OTP Storage (ConcurrentHashMap)</li>
  <li>🛣️ Clean REST Endpoints (Generate + Verify)</li>
  <li>🧠 DTO-Based Request & Response Structure</li>
  <li>🛡️ Custom Exceptions for Invalid/Expired OTP</li>
  <li>⚠️ Global Exception Handling using <code>@RestControllerAdvice</code></li>
  <li>📜 <b>SLF4J Logging for Complete Flow Tracking</b> (OTP generated, verified, expired, failed attempts, API entry/exit logs)</li>
  <li>🧪 Easy Integration & Testing via Postman</li>
</ul>

<hr/>

<h2>📁 Folder Structure</h2>

<pre>
src/main/java/com/ayush/
│
├── controller/
│     └── OtpController.java
│
├── service/
│     ├── OtpService.java
│     └── OtpStorageService.java
│
├── dto/
│     ├── OtpRequest.java
│     ├── OtpVerifyRequest.java
│     └── OtpResponse.java
│
├── exception/
│     ├── OtpExpiredException.java
│     ├── InvalidOtpException.java
│     └── OtpExceptionHandler.java
│
├── util/
│     └── OtpGenerator.java
│
└── OTPprojectApplication.java
</pre>

<hr/>

<h2>🔐 API Endpoints</h2>

<h3>1️⃣ Generate OTP</h3>

<pre>POST /api/v1/otp/generate</pre>

<b>Request Body:</b>
<pre>
{
  "identifier": "user123",
  "length": 6
}
</pre>

<b>Response:</b>
<pre>
{
  "generatedAt": "2025-12-02 15:55:33"
  "message": "OTP generated successfully",
  "otp": "384920",
  
}
</pre>

<hr/>

<h3>2️⃣ Verify OTP</h3>

<pre>POST /api/v1/otp/verify</pre>

<b>Request Body:</b>
<pre>
{
  "identifier": "user123",
  "otp": "384920"
}
</pre>

<b>Response (Success):</b>
<pre>
{
  "message": "OTP verified successfully"
}
</pre>

<b>Response (Invalid OTP):</b>
<pre>
Invalid OTP
</pre>

<b>Response (Expired OTP):</b>
<pre>
OTP expired
</pre>

<hr/>

<h2>📝 Logging (SLF4J)</h2>

<p>
The project integrates <b>SLF4J Logger</b> to provide actionable and structured logs.  
Logging allows tracking the entire OTP flow end-to-end:
</p>

<ul>
  <li>🟢 When a request enters and exits a controller</li>
  <li>🔐 When an OTP is generated</li>
  <li>🕒 Timestamp when OTP is stored</li>
  <li>❌ When wrong OTP is submitted</li>
  <li>⏳ When OTP has expired</li>
  <li>🏁 When OTP is successfully verified</li>
</ul>



<p>
This ensures full observability and helps in debugging, monitoring, and auditing authentication flows.
</p>

<hr/>

<h2>⚠️ Custom Exception Handling</h2>

<p>
The project contains a <b>global exception handler</b> using <code>@RestControllerAdvice</code>  
to avoid unstructured stacktraces and return clean messages:
</p>

<ul>
  <li>❌ <b>OtpExpiredException</b> → returns <code>410 GONE</code></li>
  <li>⚠️ <b>InvalidOtpException</b> → returns <code>400 BAD REQUEST</code></li>
</ul>

<pre>
@RestControllerAdvice
public class OtpExceptionHandler {

    @ExceptionHandler(OtpExpiredException.class)
    public ResponseEntity handle(OtpExpiredException ex) {
        return ResponseEntity.status(HttpStatus.GONE).body(ex.getMessage());
    }

    @ExceptionHandler(InvalidOtpException.class)
    public ResponseEntity handle(InvalidOtpException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
</pre>

<hr/>

<h2>🛠️ Technology Stack</h2>

<ul>
  <li>☕ Java 17</li>
  <li>🌱 Spring Boot 4.x</li>
  <li>🔐 SecureRandom (OTP Generation)</li>
  <li>🧵 ConcurrentHashMap (In-Memory Store)</li>
  <li>📦 SLF4J Logging (Flow & Debugging)</li>
  <li>💬 Jackson (JSON Response Handling)</li>
  <li>🧪 Postman for API Testing</li>
</ul>

<hr/>

<h2>🧪 How to Test Using Postman</h2>

<ol>
  <li>Start the application → <code>http://localhost:8085</code></li>
  <li>Call <code>/api/v1/otp/generate</code> with identifier + length</li>
  <li>Copy OTP returned</li>
  <li>Call <code>/api/v1/otp/verify</code> with OTP</li>
  <li>Check logs in console for verification/expiry flow</li>
</ol>

<hr/>

<h2>🎯 Final Notes</h2>

<p>
This OTP system follows enterprise-grade standards with proper flow tracking using logging, clean DTO structure, custom exception layers, and secure process handling.  
Ideal for portfolio, interviews, and real-world authentication modules.
</p>

## ✨ Author
<p align="center">
  <a href="https://linkedin.com/in/ayuseth" target="_blank">
    <img src="https://readme-typing-svg.herokuapp.com?font=Orbitron&size=24&color=00FFAB&center=true&vCenter=true&width=600&lines=👨‍💻+Ayush+Seth;💡+Computer+Science+Engineer;🚀+Java+Developer" alt="Author Typing Effect" />
  </a>
</p>

<p align="center">
  <a href="https://linkedin.com/in/ayuseth" target="_blank">
    <img src="https://capsule-render.vercel.app/api?type=waving&color=00FFAB&height=100&section=footer&text=Ayush+Seth&fontSize=32&animation=twinkling&fontColor=ffffff" />
  </a>

---

## 📜 License
© 2025 Ayush Seth. All rights reserved.  
This project is provided for learning purposes only.  
</p>
