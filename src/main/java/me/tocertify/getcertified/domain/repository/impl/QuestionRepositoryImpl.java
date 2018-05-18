package me.tocertify.getcertified.domain.repository.impl;

import me.tocertify.getcertified.domain.Question;
import me.tocertify.getcertified.domain.repository.QuestionRepository;
import me.tocertify.getcertified.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class QuestionRepositoryImpl implements QuestionRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    private QuestionService questionService;

    @Override
    public List<Question> getQuestionsByExamId(int examId) {
        String SQL = "SELECT * FROM question";
        Map<String, Object> params = new HashMap<>();
        List<Question> result = jdbcTemplate.query(SQL, params, new QuestionMapper());

        return result;
    }

    private static final class QuestionMapper implements RowMapper<Question> {
        public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
            Question question = new Question();
            question.setQuestionId(rs.getInt("question_id"));
            question.setQuestionText(rs.getString("question_text"));
            question.setExamId(rs.getInt("exam_id"));

            return question;
        }
    }
}


