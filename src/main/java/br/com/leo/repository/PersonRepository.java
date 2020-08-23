package br.com.leo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
