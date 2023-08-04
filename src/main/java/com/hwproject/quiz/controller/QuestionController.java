package com.hwproject.quiz.controller;

import com.hwproject.quiz.entity.Answer;
import com.hwproject.quiz.entity.Question;
import com.hwproject.quiz.dto.AnswersCreateDto;
import com.hwproject.quiz.repository.AnswerRepository;
import com.hwproject.quiz.service.AnswerService;
import com.hwproject.quiz.service.QuestionService;
import com.hwproject.quiz.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionTypeService questionTypeService;

    @Autowired
    private AnswerService answerService;


    public QuestionController(QuestionService questionService, QuestionTypeService questionTypeService, AnswerService answerService) {
        this.questionService = questionService;
        this.questionTypeService = questionTypeService;
        this.answerService = answerService;
    }



    @GetMapping("/questions")
    public String listQuestions(Model model){
        model.addAttribute("questions", questionService.getAllQuestions());
        return "questions";
    }

    @GetMapping("/questions/new")
    public String createQuestionForm(Model model){
        model.addAttribute("question", new Question());
        model.addAttribute("questionTypes", questionTypeService.getAllQuestionTypes());
        AnswersCreateDto answersForm = new AnswersCreateDto();
        for (int i = 1; i <= 3; i++) {
            answersForm.addAnswer(new Answer());
        }
        model.addAttribute("answersForm", answersForm);
        return "create_question";
    }

    @PostMapping("/questions")
    public String saveQuestion(@ModelAttribute("question") Question question, @ModelAttribute("answersForm") AnswersCreateDto answersForm){

        for(Answer answer: answersForm.getAnswers()){
            answer.setIdQuestion(question);
            answerService.saveAnswer(answer);
        }
        questionService.saveQuestion(question);
        return "redirect:/questions";
    }
}
