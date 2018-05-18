package me.tocertify.getcertified.service;

import me.tocertify.getcertified.domain.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionsByExamId(int examId);
}
