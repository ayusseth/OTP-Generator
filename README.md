<h1 align="center">🔐 OTP Verification System — Main Branch</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Branch-Main-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge" />
</p>

<hr/>

<h2>🚀 Overview</h2>
<p>
This is the <b>main</b> branch of the OTP Verification System.<br/>
It contains stable, production-ready code merged from the <b>integration</b> branch.<br/>
This branch is suitable for deployment and represents the complete working version of the system.
</p>

<hr/>

<h2>✨ Key Features</h2>

<ul>
  <li>🔢 Secure OTP Generation using <b>SecureRandom</b></li>
  <li>⏳ OTP Expiry Management (Time-based)</li>
  <li>🧮 In-Memory OTP Store (ConcurrentHashMap)</li>
  <li>🛡️ Custom Exceptions (Invalid & Expired OTP)</li>
  <li>⚠️ Global Exception Handler with <code>@RestControllerAdvice</code></li>
  <li>🧪 Fully Testable REST APIs</li>
  <li>📜 SLF4J Logging for Workflow Tracing</li>
  <li>🧠 DTO-based Request & Response Models</li>
</ul>

<hr/>

<h2>🧭 API Endpoints</h2>

<h3>1️⃣ Generate OTP</h3>
<pre>POST /api/v1/otp/generate</pre>

<h3>2️⃣ Verify OTP</h3>
<pre>POST /api/v1/otp/verify</pre>

<hr/>

<h2>📁 Folder Structure</h2>

<pre>
controller/
service/
dto/
exception/
util/
</pre>

<hr/>

<h2>📌 Documentation for Full Feature Details</h2>
<p>
For full technical breakdown (code, exceptions, expiry logic, DTOs, logs, etc.),  
visit:
</p>

<pre><b>feature/f1/README.md</b></pre>

<hr/>

<h2 align="center">💚 Main Branch — Stable. Clean. Deployable.</h2>

<h2>Author</h2>
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
