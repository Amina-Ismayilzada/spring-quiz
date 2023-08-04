package com.hwproject.quiz.service.impl;

import com.hwproject.quiz.entity.Answer;
import com.hwproject.quiz.repository.AnswerRepository;
import com.hwproject.quiz.service.AnswerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    private AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public List<Answer> getAllAnswers(){
        return answerRepository.findAll();
    }

    @Override
    public Answer saveAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    @Override
    public Answer getAnswerById(int idAnswer){
        return answerRepository.findById(idAnswer).get();
    }

    @Override
    public Answer editAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    @Override
    public void deleteAnswerById(int idAnswer){
        answerRepository.deleteById(idAnswer);
    }
}
