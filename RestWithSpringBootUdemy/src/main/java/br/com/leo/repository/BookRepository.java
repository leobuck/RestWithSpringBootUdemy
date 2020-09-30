package br.com.leo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leo.data.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
