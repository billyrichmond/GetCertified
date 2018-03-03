package me.tocertify.getcertified.domain.repository;

import me.tocertify.getcertified.domain.Exam;
import me.tocertify.getcertified.domain.ExamQuestion;

import java.util.List;

public interface ExamRepository {
    List<Exam> getAllExams();
    Exam getExamById(int examId);
    List<ExamQuestion> getExamQuestions(int examId);
}
