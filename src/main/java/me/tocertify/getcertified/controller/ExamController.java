package me.tocertify.getcertified.controller;

import me.tocertify.getcertified.domain.Cert;
import me.tocertify.getcertified.domain.Exam;
import me.tocertify.getcertified.domain.ExamQuestion;
import me.tocertify.getcertified.domain.NewExam;
import me.tocertify.getcertified.service.CertService;
import me.tocertify.getcertified.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExamController {

    @Autowired
    private ExamService examService;

    @Autowired
    private CertService certService;

    @RequestMapping("/exams")
    public String listExams(Model model) {
        model.addAttribute("exams", examService.getAllExams());

        return "exams";
    }

    @RequestMapping("/exam")
    public String getExamById(@RequestParam("id") int examId, Model model) {

        Exam exam = examService.getExamById(examId);
        Cert cert = certService.getCertById(exam.getCertId());
        // model.addAttribute("exam", examService.getExamById(examId));
        model.addAttribute("exam", exam);
        model.addAttribute("cert", cert);

        // List<ExamQuestion> examQuestions = examService.getExamQuestions(examId);
        // model.addAttribute("examQuestions", examQuestions);

        // model.addAttribute("examQuestionsIsEmpty", examQuestions.isEmpty());

        /*
        ExamQuestion examQuestion = new ExamQuestion("This is the examQuestion");
        model.addAttribute("examQuestion", examQuestion);
        model.addAttribute("test", "This is a test.");
        */

        return "exam";
    }

    @RequestMapping(value = "/addexam", method = RequestMethod.GET)
    public String showForm(Model model) {
        NewExam newExam = new NewExam();
        newExam.setCertList(certService.getAllCerts());
        model.addAttribute("newExam", newExam);

        return "addexam";
    }
}
