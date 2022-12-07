package com.kgisl.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kgisl.springbootdemo.model.Book;
import com.kgisl.springbootdemo.repository.BookRepository;

@Controller
public class MyController {
    @Autowired
    BookRepository bookRepository;
    @RequestMapping("/show")
    @ResponseBody
    public List<Book> show(){
        return bookRepository.findAll();
    }

    @RequestMapping("/books")
    @ResponseBody
    public List<Book> getall(){

       

       return bookRepository.findAll();

       

    }
}
