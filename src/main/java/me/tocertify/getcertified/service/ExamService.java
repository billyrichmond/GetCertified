package me.tocertify.getcertified.service;

import me.tocertify.getcertified.domain.Exam;
import me.tocertify.getcertified.domain.ExamQuestion;

import java.util.List;

public interface ExamService {
    List<Exam> getAllExams();
    Exam getExamById(int examId);
    List<ExamQuestion> getExamQuestions(int examId);
}
