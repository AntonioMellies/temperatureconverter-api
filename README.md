# API Conversão de Temperatura

API RESTful para conversão de temperatura.

## Tecnologias

- Spring Boot
- Hibernate
- Swagger
- Junit
- Liquibase
- MySql
- Docker

## Docker

*Criação do Container com a imagem do MySql*

```docker
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root_password -e MYSQL_DATABASE=tempconverter -e MYSQL_USER=user -e MYSQL_PASSWORD=password mysql
```
