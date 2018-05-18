package me.tocertify.getcertified.domain.repository;

import me.tocertify.getcertified.domain.Question;

import java.util.List;

public interface QuestionRepository {
    List<Question> getQuestionsByExamId(int examId);
}
