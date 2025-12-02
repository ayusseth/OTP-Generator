<h1 align="center">🔄 Integration Branch</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Branch-Integration-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Workflow-Clean%20%26%20Stable-brightgreen?style=for-the-badge" />
</p>

<hr/>

<h2>📌 Purpose of This Branch</h2>
<p>
The <b>integration branch</b> acts as the central staging area for merging all feature branches.<br/>
It ensures that code is stable, conflict-free, and ready before going to the <b>main</b> branch.
</p>

<hr/>

<h2>🌿 Branching Strategy</h2>

<ul>
  <li>🌱 Create new branches from <code>integration</code> only.</li>
  <li>🛠 Develop and commit inside <code>feature/*</code> branches.</li>
  <li>🔁 Merge feature branches back into <code>integration</code> once stable.</li>
  <li>🚫 No direct commits on <code>integration</code>.</li>
</ul>

<hr/>

<h2>🧪 Pre-Merge Checklist</h2>

<ul>
  <li>✔ Code compiles successfully</li>
  <li>✔ All OTP APIs tested via Postman</li>
  <li>✔ Logs (SLF4J) verified</li>
  <li>✔ Exceptions handled by global handler</li>
  <li>✔ No unused/test code left</li>
  <li>❌ No console prints or debugging junk</li>
</ul>

<hr/>

<h2>📦 What This Branch Contains</h2>

<ul>
  <li>🧩 Combined features from multiple <code>feature/*</code> branches</li>
  <li>🛠 A stable and tested codebase</li>
  <li>📄 Workflow documentation (this README)</li>
  <li>📘 Full project documentation resides in <b>feature branch & main branch</b></li>
</ul>

<hr/>

<h2>📚 Full Project Documentation</h2>

<p>
The detailed project features (OTP generation, verification, logging, expiry, exceptions)  
are available in:
</p>

<pre><b>main/README.md</b>
<b>feature/f1/README.md</b></pre>

<hr/>

<h2 align="center">🤝 Integration Branch — Stability First, Features Second</h2>
