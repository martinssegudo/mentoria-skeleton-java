package br.com.skeleton.repositories;

import br.com.skeleton.repositories.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Long, PersonEntity> {
}
