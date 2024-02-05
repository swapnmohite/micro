package com.quiz.controller;
import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/quiz")
public class QuizController {
    
    private final QuizService quizService;
    
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    
    @PostMapping
    public Quiz add(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }
    
    @GetMapping("/all")
    public Iterable<Quiz> getAll() {
        return quizService.getAll();
    }
    
    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id) {
        return quizService.get(id);
    }
}