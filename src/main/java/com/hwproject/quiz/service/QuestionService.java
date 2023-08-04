package com.hwproject.quiz.service;

import com.hwproject.quiz.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();

    Question saveQuestion(Question question);

    Question getQuestionById(int idQuestion);

    Question editQuestion(Question question);

    void deleteQuestionById(int idQuestion);
}
