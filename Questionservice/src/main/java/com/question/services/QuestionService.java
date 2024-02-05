package com.question.services;
import com.question.entities.Question;

import java.util.List;
public interface QuestionService {
    Question create (Question question);
    List<Question> getall();
    Question getOne(Long id);
    List<Question> getByQuizId(Long id);
}