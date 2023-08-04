package com.hwproject.quiz.dto;

import com.hwproject.quiz.entity.Answer;

import java.util.ArrayList;
import java.util.List;

public class AnswersCreateDto {
    private List<Answer> answers = new ArrayList<Answer>();

    public AnswersCreateDto() {
    }

    public AnswersCreateDto(List<Answer> answers) {
        this.answers = answers;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
