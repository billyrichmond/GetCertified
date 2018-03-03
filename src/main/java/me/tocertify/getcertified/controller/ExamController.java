package me.tocertify.getcertified.controller;

import me.tocertify.getcertified.domain.ExamQuestion;
import me.tocertify.getcertified.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ExamController {

    @Autowired
    private ExamService examService;

    @RequestMapping("/exams")
    public String listExams(Model model) {
        model.addAttribute("exams", examService.getAllExams());

        return "exams";

    }

    @RequestMapping("/exam")
    public String getExamById(@RequestParam("id") int examId, Model model) {

        model.addAttribute("exam", examService.getExamById(examId));

        List<ExamQuestion> examQuestions = examService.getExamQuestions(examId);
        model.addAttribute("examQuestions", examQuestions);

        model.addAttribute("examQuestionsIsEmpty", examQuestions.isEmpty());

        /*
        ExamQuestion examQuestion = new ExamQuestion("This is the examQuestion");
        model.addAttribute("examQuestion", examQuestion);
        model.addAttribute("test", "This is a test.");
        */

        return "exam";
    }
}
