package com.hwproject.quiz.dataseed;

import com.hwproject.quiz.entity.QuestionType;
import com.hwproject.quiz.repository.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class QuestionTypeDataLoader implements CommandLineRunner {
    @Autowired
    QuestionTypeRepository questionTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        loadQuestionData();
    }

    private void loadQuestionData() {
        if (questionTypeRepository.count() == 0) {
            QuestionType qt1 = new QuestionType("MCQ", "Multiple Choice Questions - one of many statements is correct");
            QuestionType qt2 = new QuestionType("MRQ", "Multiple Response Questions - many statements are given and multiple of them are true");
            QuestionType qt3 = new QuestionType("Text", "User inputs a short text/word/phrase");
            questionTypeRepository.save(qt1);
            questionTypeRepository.save(qt2);
            questionTypeRepository.save(qt3);
        }
    }

}
