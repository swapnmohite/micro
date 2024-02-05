package com.question.controller;
import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/question")
public class QuestionController {
    
    private final QuestionService questionService;
    
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    
    @PostMapping
    public Question add(@RequestBody Question question) {
        return questionService.create(question);
    }
    
    @GetMapping("/all")
    public Iterable<Question> getAll() {
        return questionService.getall();
    }
    
    @GetMapping("/{id}")
    public Question get(@PathVariable Long id) {
        return questionService.getOne(id);
    }
    
    @GetMapping("/quiz/{quizid}")
    public List<Question> getByQuizId(@PathVariable Long quizid) {
        return questionService.getByQuizId(quizid);
    }
}