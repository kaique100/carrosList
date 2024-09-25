CREATE TABLE carro (

    id UUID PRIMARY KEY,

    maker VARCHAR(255) NOT NULL,

    model VARCHAR(255) NOT NULL,

    year INT NOT NULL,

    price DECIMAL(10, 2)

);

