package me.tocertify.getcertified.service.impl;

import me.tocertify.getcertified.domain.Exam;
import me.tocertify.getcertified.domain.repository.ExamRepository;
import me.tocertify.getcertified.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Override
    public List<Exam> getAllExams() {
        List<Exam> allExams = examRepository.getAllExams();

        return allExams;
    }

    @Override
    public Exam getExamById(String examId) {
        return examRepository.getExamById(examId);
    }
}
