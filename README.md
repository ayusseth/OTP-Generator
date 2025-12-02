<h1 align="center">🧩 Feature: OTP Module (feature/f1)</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Branch-feature%2Ff1-yellow?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Module-OTP%20System-blue?style=for-the-badge" />
</p>

<hr/>

<h2>🚀 Feature Summary</h2>
<p>
This feature branch contains the <b>complete OTP system</b> including:
</p>

<ul>
  <li>🔢 OTP generation (SecureRandom)</li>
  <li>📥 OTP verification</li>
  <li>⏳ OTP expiry handling</li>
  <li>🗄 In-memory OTP storage</li>
  <li>⚠ Custom exception handling</li>
  <li>📝 Logging using SLF4J</li>
  <li>🧪 REST API endpoints</li>
  <li>📦 DTO-based structure</li>
</ul>

<hr/>

<h2>🔧 Technical Breakdown</h2>

<h3>1️⃣ OTP Generation</h3>
<p>
OTP is generated using <b>SecureRandom</b> ensuring cryptographic-level randomness.
</p>

<h3>2️⃣ OTP Storage</h3>
<p>
Stored in <code>ConcurrentHashMap</code> with expiry timestamps.
</p>

<h3>3️⃣ OTP Expiry</h3>
<p>
If OTP passes its validity window, system throws:
</p>

<pre><b>OtpExpiredException</b></pre>

<h3>4️⃣ OTP Verification</h3>
<p>
Matches user input with stored OTP and clears after success.
</p>

<h3>5️⃣ Custom Exceptions</h3>

<ul>
  <li>⚠ <b>InvalidOtpException</b></li>
  <li>⏳ <b>OtpExpiredException</b></li>
</ul>

<h3>6️⃣ Global Exception Handler</h3>
<p>Uses <code>@RestControllerAdvice</code> to return structured, user-friendly messages.</p>

<hr/>

<h2>🧭 API Endpoints (Full Feature)</h2>

<h3>📌 Generate OTP</h3>
<pre>POST /api/v1/otp/generate</pre>

<pre>
{
  "identifier": "user123",
  "length": 6
}
</pre>

<h3>📌 Verify OTP</h3>
<pre>POST /api/v1/otp/verify</pre>

<pre>
{
  "identifier": "user123",
  "otp": "385920"
}
</pre>

<hr/>

<h2>📁 Folder Structure (feature branch)</h2>

<pre>
/controller
    OtpController.java

/service
    OtpService.java
    OtpStorageService.java

/exception
    OtpExpiredException.java
    InvalidOtpException.java
    OtpExceptionHandler.java

/util
    OtpGenerator.java

/dto
    OtpRequest.java
    OtpVerifyRequest.java
    OtpResponse.java
</pre>

<hr/>

<h2>📝 SLF4J Logging</h2>
<p>Used to track:</p>

<ul>
  <li>🟢 OTP generation</li>
  <li>🟡 OTP expiry</li>
  <li>🔴 Wrong OTP attempts</li>
  <li>📤 Controller entry & exit logs</li>
  <li>🔍 Debug-level flow tracing</li>
</ul>



<hr/>

<h2 align="center">🔥 feature/f1 — Complete OTP System Delivered</h2>
<p align="center">This branch contains ALL implementations you built.</p>
