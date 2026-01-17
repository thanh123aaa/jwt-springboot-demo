# JWT Spring Boot Demo

## Mô tả
Project demo xác thực người dùng bằng JWT sử dụng Spring Boot.

## Chức năng chính
- Tạo JWT token
- Gửi token qua Header Authorization
- Xác thực token khi truy cập API

## Công nghệ sử dụng
- Java
- Spring Boot
- JWT (jjwt)
- Maven

## API demo
- Lấy token:
  GET /token

- Gọi API bảo vệ:
  GET /hello  
  Header:
  Authorization: Bearer <token>

## Cách chạy
1. Import project vào IntelliJ IDEA
2. Run file `JwtDemoApplication.java`
3. Truy cập: http://localhost:8080/token
