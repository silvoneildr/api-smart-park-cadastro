package br.com.smartpark.api.cadastro.service;

import br.com.smartpark.api.cadastro.entity.PersonEntity;
import br.com.smartpark.api.cadastro.repository.PersonRepository;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.RequestScoped;

@RequestScoped
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public PersonEntity getPerson() {
        var person = new PersonEntity();
        person.setPersonType("F");

        return person;
    }

    public void savePerson(PersonEntity person) {
        personRepository.persist(person);
    }
}
