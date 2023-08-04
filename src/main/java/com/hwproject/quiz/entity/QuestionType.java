package com.hwproject.quiz.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="question_types")
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idType;

    @Column(columnDefinition = "varchar(20)", nullable = false, length = 20)
    private String type;

    @Column(columnDefinition = "text")
    private String description;

    @OneToMany(targetEntity = Question.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "idType", referencedColumnName = "idType")
    private List<Question> questions;

    public QuestionType() {
    }

    public QuestionType(String type, String description) {
        super();
        this.type = type;
        this.description = description;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
