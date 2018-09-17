package com.aconex.qapp.controllers;

import com.aconex.qapp.entities.Question;
import com.aconex.qapp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/questions")
    public void addQuestion(@RequestBody Question question){questionService.addQuestion(question);}

    @RequestMapping(method = RequestMethod.GET, value = "questions")
    public List<Question> getAllQuestions(){return questionService.getAllQuestions();}

}
