package com.hwproject.quiz.service.impl;

import com.hwproject.quiz.entity.QuestionType;
import com.hwproject.quiz.repository.QuestionTypeRepository;
import com.hwproject.quiz.service.QuestionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    private QuestionTypeRepository questionTypeRepository;

    public QuestionTypeServiceImpl(QuestionTypeRepository questionTypeRepository) {
        this.questionTypeRepository = questionTypeRepository;
    }


    public List<QuestionType> getAllQuestionTypes(){
        return this.questionTypeRepository.findAll();
    }

    public QuestionType saveQuestionType(QuestionType questionType){
        return this.questionTypeRepository.save(questionType);
    }

    public QuestionType getQuestionTypeById(int idQuestionType){
        return this.questionTypeRepository.findById(idQuestionType).get();
    }

    public QuestionType editQuestionType(QuestionType questionType){
        return this.questionTypeRepository.save(questionType);
    }

    public void deleteQuestionTypeById(int idQuestionType){
        this.questionTypeRepository.deleteById(idQuestionType);
    }
}
