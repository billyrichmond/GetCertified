package me.tocertify.getcertified.controller;

import me.tocertify.getcertified.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String getExamById(@RequestParam("id") String examId, Model model) {
        model.addAttribute("exam", examService.getExamById(examId));

        return "exam";
    }
}
