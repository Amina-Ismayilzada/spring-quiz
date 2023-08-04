package com.hwproject.quiz.service;


import com.hwproject.quiz.entity.Answer;

import java.util.List;

public interface AnswerService {
    List<Answer> getAllAnswers();

    Answer saveAnswer(Answer answer);

    Answer getAnswerById(int idAnswer);

    Answer editAnswer(Answer answer);

    void deleteAnswerById(int idAnswer);

}
