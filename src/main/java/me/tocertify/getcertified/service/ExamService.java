package me.tocertify.getcertified.service;

import me.tocertify.getcertified.domain.Exam;

import java.util.List;

public interface ExamService {
    List<Exam> getAllExams();
    Exam getExamById(String examId);
}
