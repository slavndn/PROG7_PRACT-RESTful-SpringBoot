# RESTful веб-приложение на Spring Boot

## Описание

RESTful веб-приложение для управления библиотекой книг, реализованное на Spring Boot с использованием Spring Data JPA, H2 базы данных и Lombok.

## Технологии

- **Spring Boot 3.2.0**
- **Spring Data JPA** - для работы с базой данных
- **H2 Database** - in-memory база данных
- **Lombok** - для уменьшения boilerplate кода
- **Spring Validation** - для валидации данных
- **Maven** - система сборки

## Запуск приложения

### Требования

- Java 17 или выше
- Maven 3.6+

### Команды для запуска

```bash
# Сборка проекта
mvn clean install

# Запуск приложения
mvn spring-boot:run
```

Приложение будет доступно по адресу: `http://localhost:8080`

## API Endpoints

### Получить все книги
```
GET /api/books
```

### Получить книгу по ID
```
GET /api/books/{id}
```

### Создать новую книгу
```
POST /api/books
Content-Type: application/json

{
  "title": "Название книги",
  "author": "Автор",
  "year": 2024,
  "description": "Описание книги"
}
```

### Обновить книгу
```
PUT /api/books/{id}
Content-Type: application/json

{
  "title": "Обновленное название",
  "author": "Автор",
  "year": 2024,
  "description": "Описание"
}
```

### Удалить книгу
```
DELETE /api/books/{id}
```

### Поиск по автору
```
GET /api/books/search/author?author=Имя автора
```

### Поиск по названию
```
GET /api/books/search/title?title=Название
```

## H2 Console

Для просмотра базы данных доступна H2 Console:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (пусто)

## Примеры использования

### Создание книги
```bash
curl -X POST http://localhost:8080/api/books \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Война и мир",
    "author": "Лев Толстой",
    "year": 1869,
    "description": "Роман-эпопея"
  }'
```

### Получение всех книг
```bash
curl http://localhost:8080/api/books
```

### Обновление книги
```bash
curl -X PUT http://localhost:8080/api/books/1 \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Война и мир",
    "author": "Л.Н. Толстой",
    "year": 1869,
    "description": "Роман-эпопея"
  }'
```

### Удаление книги
```bash
curl -X DELETE http://localhost:8080/api/books/1
```

