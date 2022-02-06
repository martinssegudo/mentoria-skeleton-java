package br.com.skeleton.domain;

import br.com.skeleton.domain.entities.Person;

public interface PersonDomain {
    Person getPerson(Long personId);
}
