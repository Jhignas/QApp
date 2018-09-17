package com.aconex.qapp.repositories;

import com.aconex.qapp.entities.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Integer> {
}
