package me.tocertify.getcertified.domain.repository;

import me.tocertify.getcertified.domain.Exam;
import me.tocertify.getcertified.domain.NewExam;

import java.util.List;

public interface ExamRepository {
    List<Exam> getAllExams();
    Exam getExamById(int examId);
    NewExam getNewExam();
}
