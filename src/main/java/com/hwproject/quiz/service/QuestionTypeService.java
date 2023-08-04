package com.hwproject.quiz.service;

import com.hwproject.quiz.entity.QuestionType;

import java.util.List;

public interface QuestionTypeService {
    List<QuestionType> getAllQuestionTypes();

    QuestionType saveQuestionType(QuestionType questionType);

    QuestionType getQuestionTypeById(int idQuestionType);

    QuestionType editQuestionType(QuestionType questionType);

    void deleteQuestionTypeById(int idQuestionType);
}
