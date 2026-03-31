j📝 Short Note: Changes in DES, Blowfish, AES (Rijndael)

### ✅ Common Steps (Same for all)

* Create key
* Create `Cipher` object
* Encrypt data
* Decrypt data

---

# 🔁 Key Differences

## 🔹 1. DES (Data Encryption Standard)

* Algorithm: `"DES"`
* Key method: `KeyGenerator`
* Key size: **56-bit**
* Example:

<pre class="overflow-visible! px-0!" data-start="398" data-end="494"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="w-full overflow-x-hidden overflow-y-auto"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼe">KeyGenerator</span><span> </span><span class="ͼe">kg</span><span> </span><span class="ͼ8">=</span><span> </span><span class="ͼe">KeyGenerator</span><span class="ͼ8">.</span><span class="ͼe">getInstance</span><span>(</span><span class="ͼc">"DES"</span><span>);</span><br/><span class="ͼe">SecretKey</span><span> </span><span class="ͼe">key</span><span> </span><span class="ͼ8">=</span><span> </span><span class="ͼe">kg</span><span class="ͼ8">.</span><span class="ͼe">generateKey</span><span>();</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 2. Blowfish

* Algorithm: `"Blowfish"`
* Key method: `SecretKeySpec`
* Key size: **Flexible (4–56 bytes)**
* Example:

<pre class="overflow-visible! px-0!" data-start="624" data-end="706"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="w-full overflow-x-hidden overflow-y-auto"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼe">SecretKeySpec</span><span> </span><span class="ͼe">keySpec</span><span> </span><span class="ͼ8">=</span><span> </span><span class="ͼ8">new</span><span> </span><span class="ͼe">SecretKeySpec</span><span>(</span><span class="ͼe">key</span><span class="ͼ8">.</span><span class="ͼe">getBytes</span><span>(), </span><span class="ͼc">"Blowfish"</span><span>);</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 3. AES (Rijndael)

* Algorithm: `"AES"`
* Key method: `SecretKeySpec`
* Key size: **16 / 24 / 32 bytes**
* Example:

<pre class="overflow-visible! px-0!" data-start="834" data-end="911"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="w-full overflow-x-hidden overflow-y-auto"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼe">SecretKeySpec</span><span> </span><span class="ͼe">keySpec</span><span> </span><span class="ͼ8">=</span><span> </span><span class="ͼ8">new</span><span> </span><span class="ͼe">SecretKeySpec</span><span>(</span><span class="ͼe">key</span><span class="ͼ8">.</span><span class="ͼe">getBytes</span><span>(), </span><span class="ͼc">"AES"</span><span>);</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# 🎯 Key Point (Very Important for Exam)

👉 Only **two things change**:

1. Algorithm name (`DES / Blowfish / AES`)
2. Key generation method

---

# 🧠 One-Line Memory Trick

<pre class="overflow-visible! px-0!" data-start="1096" data-end="1155"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>DES → KeyGenerator  </span><br/><span>Blowfish & AES → SecretKeySpec</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# ✅

<pre class="overflow-visible! px-0!" data-start="100" data-end="298"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="w-full overflow-x-hidden overflow-y-auto"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span># 🔐 RSA Algorithm – Short Notes</span><br/><br/><span>## 📌 Why do we add 2 to `e`?</span><br/><br/><span>```java</span><br/><span>BigInteger e = BigInteger.valueOf(3);</span><br/><span>while (!phi.gcd(e).equals(BigInteger.ONE)) {</span><br/><span>    e = e.add(BigInteger.TWO);</span><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

### ✔ Reason:

* We need `gcd(e, φ) = 1` (coprime)
* φ(n) is always **even**
* Even values of `e` will share factor 2 with φ ❌
* So we check only **odd numbers**

### 👉 Sequence:

<pre class="overflow-visible! px-0!" data-start="479" data-end="506"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>3 → 5 → 7 → 9 → ...</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

### 🧠 One-line:

> We add 2 to skip even numbers and find a valid `e` faster.

---

# 🧠 Full RSA Process (Step-by-Step)

## 🔹 Step 1: Choose two prime numbers

<pre class="overflow-visible! px-0!" data-start="669" data-end="690"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>p = 3, q = 11</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 Step 2: Compute n

<pre class="overflow-visible! px-0!" data-start="721" data-end="752"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>n = p × q = 3 × 11 = 33</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 Step 3: Compute φ(n)

<pre class="overflow-visible! px-0!" data-start="786" data-end="834"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>φ(n) = (p - 1)(q - 1)</span><br/><span>     = 2 × 10 = 20</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 Step 4: Choose e

<pre class="overflow-visible! px-0!" data-start="864" data-end="894"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>e = 3</span><br/><span>gcd(3, 20) = 1 ✔</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 Step 5: Compute d

<pre class="overflow-visible! px-0!" data-start="925" data-end="983"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>d = e⁻¹ mod φ(n)</span><br/><span>d = 7  (because 3 × 7 mod 20 = 1)</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 Step 6: Public & Private Keys

<pre class="overflow-visible! px-0!" data-start="1026" data-end="1095"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Public Key  = (e, n) = (3, 33)</span><br/><span>Private Key = (d, n) = (7, 33)</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 Step 7: Encryption

<pre class="overflow-visible! px-0!" data-start="1127" data-end="1202"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Message (m) = 5</span><br/><br/><span>C = m^e mod n</span><br/><span>  = 5^3 mod 33</span><br/><span>  = 125 mod 33</span><br/><span>  = 26</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🔹 Step 8: Decryption

<pre class="overflow-visible! px-0!" data-start="1234" data-end="1277"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>M = C^d mod n</span><br/><span>  = 26^7 mod 33</span><br/><span>  = 5</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## 🎯 Final Result

<pre class="overflow-visible! px-0!" data-start="1303" data-end="1376"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="w-full overflow-x-hidden overflow-y-auto pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼ5 ͼj"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Original Message = 5</span><br/><span>Encrypted Message = 26</span><br/><span>Decrypted Message = 5</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

## ✅ Conclusion

* RSA uses two keys:
  * Public key for encryption
  * Private key for decryption
* Works using modular arithmetic

```java
c.init(Cipher.ENCRYPT_MODE, keySpec);
byte[] enc = c.doFinal(text.getBytes());
String encrypted = Base64.getEncoder().encodeToString(enc);

// Decrypt
c.init(Cipher.DECRYPT_MODE, keySpec);
byte[] dec = c.doFinal(enc);
String decrypted = new String(dec);
```

```java
c.init(Cipher.ENCRYPT_MODE, keySpec);
byte[] enc = c.doFinal(text.getBytes());
String encrypted = Base64.getEncoder().encodeToString(enc);

// Decrypt
c.init(Cipher.DECRYPT_MODE, keySpec);
byte[] dec = c.doFinal(enc);
String decrypted = new String(dec);
```

**\`\`\`**`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">java</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">c.init(Cipher.ENCRYPT_MODE, keySpec);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">byte[] enc = c.doFinal(text.getBytes());</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">String encrypted = Base64.getEncoder().encodeToString(enc);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">// Decrypt</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">c.init(Cipher.DECRYPT_MODE, keySpec);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">byte[] dec = c.doFinal(enc);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">String decrypted = new String(dec);</span>`\`\`\`

**\`\`\`**`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">java</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">c.init(Cipher.ENCRYPT_MODE, keySpec);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">byte[] enc = c.doFinal(text.getBytes());</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">String encrypted = Base64.getEncoder().encodeToString(enc);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">// Decrypt</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">c.init(Cipher.DECRYPT_MODE, keySpec);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">byte[] dec = c.doFinal(enc);</span>`

`<span class="_aupe copyable-text xkrh14z xldyu6s xgfl6pn">String decrypted = new String(dec);</span>`\`\`\`
