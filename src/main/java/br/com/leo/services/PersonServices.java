package br.com.leo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leo.exception.ResourceNotFoundException;
import br.com.leo.model.Person;
import br.com.leo.repository.PersonRepository;

@Service
public class PersonServices {

	@Autowired
	private PersonRepository repository;
	
	public Person findById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
	}
	
	public List<Person> findAll() {
		return repository.findAll();
	}

	public Person create(Person person) {		
		return repository.save(person);
	}
	
	public Person update(Person person) {		
		Person entity = findById(person.getId());
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		Person entity = findById(id);
		
		repository.delete(entity);
	}
	
}
