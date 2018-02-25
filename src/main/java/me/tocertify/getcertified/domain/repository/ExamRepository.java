package me.tocertify.getcertified.domain.repository;

import me.tocertify.getcertified.domain.Exam;

import java.util.List;

public interface ExamRepository {
    List<Exam> getAllExams();
    Exam getExamById(String exam);
}
