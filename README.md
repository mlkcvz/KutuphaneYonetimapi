# 📚 Kütüphane Yönetim Sistemi - Spring Boot REST API

Bu proje, bir kütüphane yönetim sistemini temsil eden Spring Boot REST API uygulamasıdır.

## 🚀 Kullanılan Teknolojiler
- Java 17
- Spring Boot 3
- Maven
- PostgreSQL
- Lombok
- Jakarta Validation
- RESTful API

## 🧱 Katmanlar
- Entity
- Repository
- Service
- Controller
- DTO

## 🔌 PostgreSQL Bağlantı Bilgileri
```
URL: jdbc:postgresql://localhost:5432/kutuphane
Kullanıcı adı: postgres
Şifre: 1234
```

## 📄 API Endpoint Listesi

| Metot | Endpoint         | Açıklama                                |
|--------|------------------|-----------------------------------------|
| GET    | /categories       | Kategori listesini getirir              |
| POST   | /categories       | Yeni kategori ekler                     |
| DELETE | /categories/{id}  | Kategori siler (kitap kontrolü ile)     |
| GET    | /books            | Kitap listesini getirir                 |
| POST   | /books            | Yeni kitap ekler                        |
| GET    | /publishers       | Yayıncı listesini getirir (adressiz)    |
| POST   | /borrowings       | Kitap ödünç alma işlemi                 |

## 🧪 Validasyon
- `@NotBlank`, `@Min`, `@Valid` anotasyonları kullanılmıştır.
- Kitap stok kontrolü yapılır.
- Kategoriye ait kitap varsa silinemez.

## 🛠️ Veritabanı Tabloları (SQL)
Aşağıdaki dosyaya bakınız: `db/init.sql`

## 📦 Postman Dosyası
`kutuphane.postman_collection.json` dosyasından test edebilirsiniz.
