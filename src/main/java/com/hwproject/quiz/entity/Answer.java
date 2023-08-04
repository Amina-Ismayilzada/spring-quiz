package com.hwproject.quiz.entity;


import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnswer;

    @Column(nullable=false, columnDefinition="text")
    private String answerBody;

    @Column(nullable=false)
    private float isCorrect;


    @ManyToOne
    @JoinColumn(name = "idQuestion", nullable = false)
    private Question idQuestion;

    public Answer() {}

    public Answer(String answerBody, float isCorrect, Question idQuestion) {
        super();
        this.answerBody = answerBody;
        this.isCorrect = isCorrect;
        this.idQuestion = idQuestion;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public String getAnswerBody() {
        return answerBody;
    }

    public void setAnswerBody(String answerBody) {
        this.answerBody = answerBody;
    }

    public float getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(float isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Question idQuestion) {
        this.idQuestion = idQuestion;
    }
}
