package com.kgisl.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.springbootdemo.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    
}
    