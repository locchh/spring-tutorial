# HTTP Request and Response Overview

## 📤 HTTP Request

An HTTP request is sent by a client (typically a browser or API client) to a server to initiate an action such as retrieving, updating, creating, or deleting resources.

### 🔹 Request Components

#### 1. **Path**

* The specific endpoint or resource on the server.
* Example: `/api/users/123`, `/login`, `/products/list`

#### 2. **Method**

* Describes the action to be performed on the resource.
* Common HTTP methods:

  * `GET` – Retrieve data (no body usually).
  * `POST` – Create a new resource (includes body).
  * `PUT` – Update an existing resource (complete update).
  * `PATCH` – Update part of a resource (partial update).

#### 3. **Authorization**

* Credentials or tokens included to authenticate the request.
* Common schemes:

  * `Basic <base64-encoded-credentials>`
  * `Bearer <JWT or token string>`
* Example:

  ```http
  Authorization: Bearer eyJhbGciOi...
  ```

#### 4. **Headers**

* Metadata about the request.
* Common headers:

  * `Content-Type`: Specifies the format of the request body.
  * `Accept`: Expected response format.
  * `User-Agent`: Client details.
* Example:

  ```http
  Content-Type: application/json
  Accept: application/json
  ```

#### 5. **Body**

* Data sent to the server in `POST`, `PUT`, or `PATCH` requests.

* Can be in various formats:

  * **Binary** – Files, images, audio, etc.
  * **Raw Text** – Plain text content.
  * **JavaScript** – Often used in debugging or developer tools.
  * **JSON** – Most common for APIs.
  * **HTML** – Used in form submissions or rendering.
  * **XML** – Structured data, especially in legacy systems.

* Example JSON body:

  ```json
  {
    "username": "john_doe",
    "email": "john@example.com"
  }
  ```

---

## 📥 HTTP Response

The server returns a response to the client after processing the request.

### 🔸 Response Components

#### 1. **Status**

* Indicates the result of the request.
* Common status codes:

  * `200 OK` – Success
  * `201 Created` – Resource created
  * `400 Bad Request` – Invalid request
  * `401 Unauthorized` – Authentication required
  * `403 Forbidden` – No permission
  * `404 Not Found` – Resource not found
  * `500 Internal Server Error` – Server error

#### 2. **Headers**

* Provide metadata about the response.
* Common headers:

  * `Content-Type`: Type of the returned content.
  * `Content-Length`: Size of the response body.
  * `Set-Cookie`: For session management.
* Example:

  ```http
  Content-Type: application/json
  ```

#### 3. **Body**

* The actual data returned from the server.
* Format depends on the `Content-Type`.
* Example JSON body:

  ```json
  {
    "id": 123,
    "username": "john_doe",
    "email": "john@example.com"
  }
  ```

---

## 🧪 Example

**Request:**

```http
POST /api/login HTTP/1.1
Host: example.com
Authorization: Basic dXNlcjpwYXNzd29yZA==
Content-Type: application/json

{
  "username": "user",
  "password": "pass"
}
```

**Response:**

```http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
  "expires_in": 3600
}
```