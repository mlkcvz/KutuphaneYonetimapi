-- PostgreSQL veritabanı oluşturma scripti

CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE publishers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address TEXT,
    phone VARCHAR(50)
);

CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    stock INT NOT NULL,
    category_id INT REFERENCES categories(id),
    publisher_id INT REFERENCES publishers(id)
);

CREATE TABLE book_borrowings (
    id SERIAL PRIMARY KEY,
    borrower_name VARCHAR(255) NOT NULL,
    borrowed_at DATE,
    book_id INT REFERENCES books(id)
);
