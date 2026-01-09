package ru.university.restful.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Название книги не может быть пустым")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Автор не может быть пустым")
    @Column(nullable = false)
    private String author;

    @NotNull(message = "Год издания обязателен")
    @Positive(message = "Год издания должен быть положительным числом")
    @Column(nullable = false)
    private Integer year;

    @Column(length = 1000)
    private String description;
}

