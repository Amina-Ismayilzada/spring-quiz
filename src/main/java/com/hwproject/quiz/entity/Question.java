package com.hwproject.quiz.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQuestion;

    @Column(nullable=false, columnDefinition="text")
    private String questionBody;

    @Column(columnDefinition = "varchar(10)", length = 10)
    private String level;

    @Column(columnDefinition="text")
    private String feedback;

    @Column(nullable=false, length = 11)
    private int score;

    @ManyToOne
    @JoinColumn(name = "idType", nullable = false)
    private QuestionType idType;

    @OneToMany(targetEntity = Answer.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "idQuestion", referencedColumnName = "idQuestion")
    private List<Answer> answers;

    public Question() {
    }

    public Question(String questionBody, String level, String feedback, int score, QuestionType idType) {
        super();
        this.questionBody = questionBody;
        this.level = level;
        this.feedback = feedback;
        this.score = score;
        this.idType = idType;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public QuestionType getIdType() {
        return idType;
    }

    public void setIdType(QuestionType idType) {
        this.idType = idType;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
