package com.hwproject.quiz.service.impl;

import com.hwproject.quiz.entity.Question;
import com.hwproject.quiz.repository.QuestionRepository;
import com.hwproject.quiz.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    @Override
    public Question saveQuestion(Question question){
        return questionRepository.save(question);
    }


    @Override
    public Question getQuestionById(int idQuestion){
        return questionRepository.findById(idQuestion).get();
    }

    @Override
    public Question editQuestion(Question question){
        return questionRepository.save(question);
    }

    @Override
    public void deleteQuestionById(int idQuestion){
        questionRepository.deleteById(idQuestion);
    }
}
