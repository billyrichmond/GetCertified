package me.tocertify.getcertified.service.impl;

import me.tocertify.getcertified.domain.Question;
import me.tocertify.getcertified.domain.repository.QuestionRepository;
import me.tocertify.getcertified.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionsByExamId(int examId) {
        return questionRepository.getQuestionsByExamId(examId);
    }

}
