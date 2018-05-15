package me.tocertify.getcertified.controller;

import me.tocertify.getcertified.domain.Cert;
import me.tocertify.getcertified.domain.Exam;
import me.tocertify.getcertified.service.CertService;
import me.tocertify.getcertified.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CertService certService;

    @Autowired
    private ExamService examService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "GetCertified");
        model.addAttribute("subtitle","My personal certification web app");

        model.addAttribute("certs", certService.getAllCerts().size());
        model.addAttribute("exams", examService.getAllExams().size());
        return "home";
    }
}
