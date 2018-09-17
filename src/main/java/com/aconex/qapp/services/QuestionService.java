package com.aconex.qapp.services;

import com.aconex.qapp.entities.Question;
import com.aconex.qapp.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void addQuestion(Question question){questionRepository.save(question);}

    public List<Question> getAllQuestions(){
        List<Question> questions = new ArrayList<>();
        questionRepository.findAll().forEach(questions::add);
        return questions;
    }
}
