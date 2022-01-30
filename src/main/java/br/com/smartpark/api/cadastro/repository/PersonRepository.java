package br.com.smartpark.api.cadastro.repository;

import br.com.smartpark.api.cadastro.entity.PersonEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.Dependent;
@Dependent
public class PersonRepository implements PanacheRepository<PersonEntity> {

}
