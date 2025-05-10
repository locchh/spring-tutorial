# 📡 `curl` Command: Complete Guide

`curl` is a command-line tool used to send HTTP requests to a server and interact with APIs. It supports a wide range of protocols including HTTP, HTTPS, FTP, and more.

---

## 📘 Basic Syntax

```bash
curl [options] [URL]
```

---

## 🚀 Common Request Types

### 🔹 GET Request (default)

```bash
curl https://api.example.com/users
```

### 🔹 POST Request with JSON

```bash
curl -X POST https://api.example.com/login \
     -H "Content-Type: application/json" \
     -d '{"username": "user", "password": "pass"}'
```

### 🔹 PUT Request

```bash
curl -X PUT https://api.example.com/users/123 \
     -H "Content-Type: application/json" \
     -d '{"email": "new@example.com"}'
```

### 🔹 PATCH Request

```bash
curl -X PATCH https://api.example.com/users/123 \
     -H "Content-Type: application/json" \
     -d '{"status": "active"}'
```

### 🔹 DELETE Request

```bash
curl -X DELETE https://api.example.com/users/123
```

---

## 🛂 Authorization

### 🔐 Bearer Token

```bash
curl -H "Authorization: Bearer <your_token>" https://api.example.com/data
```

### 🔐 Basic Auth

```bash
curl -u username:password https://api.example.com/protected
```

---

## 📦 Sending Data

### JSON

```bash
curl -X POST https://api.example.com/data \
     -H "Content-Type: application/json" \
     -d '{"name":"John","age":30}'
```

### Form Data (`application/x-www-form-urlencoded`)

```bash
curl -X POST https://api.example.com/form \
     -d "username=john&password=secret"
```

### Multipart Form Data (File Upload)

```bash
curl -X POST https://api.example.com/upload \
     -F "file=@myfile.jpg"
```

---

## 📥 Handling Responses

### Verbose Output

```bash
curl -v https://api.example.com
```

### Show Headers Only

```bash
curl -I https://api.example.com
```

### Save Output to File

```bash
curl https://example.com/image.jpg -o image.jpg
```

---

## 📋 Headers

### Add Custom Header

```bash
curl -H "X-Custom-Header: value" https://api.example.com
```

### Multiple Headers

```bash
curl -H "Content-Type: application/json" \
     -H "Accept: application/json" \
     https://api.example.com
```

---

## 🌐 Working with Different Content Types

| Type           | `Content-Type` Header Value         | Example Use Case    |
| -------------- | ----------------------------------- | ------------------- |
| JSON           | `application/json`                  | APIs, data exchange |
| HTML           | `text/html`                         | Webpage data        |
| XML            | `application/xml` or `text/xml`     | Legacy APIs         |
| Plain Text     | `text/plain`                        | Logs, debugging     |
| Form-Encoded   | `application/x-www-form-urlencoded` | Login, forms        |
| Multipart Form | `multipart/form-data`               | File upload         |

---

## 📌 Useful Flags and Options

| Option      | Description                                  |
| ----------- | -------------------------------------------- |
| `-X`        | Specify request method (`GET`, `POST`, etc.) |
| `-H`        | Set request header                           |
| `-d`        | Send request body                            |
| `-F`        | Send multipart form data (e.g., file)        |
| `-u`        | Basic auth credentials                       |
| `-o <file>` | Save output to file                          |
| `-v`        | Verbose mode (debugging)                     |
| `-I`        | Show response headers only                   |
| `-L`        | Follow redirects                             |
| `--http2`   | Use HTTP/2 protocol                          |

---

## 🧪 Full Example: PUT Request with Authorization

```bash
curl -X PUT https://api.example.com/users/123 \
     -H "Content-Type: application/json" \
     -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..." \
     -d '{"name": "Updated Name", "email": "new@example.com"}'
```