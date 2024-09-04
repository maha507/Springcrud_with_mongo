package com.example.Spring.Crud.repository;

import com.example.Spring.Crud.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
