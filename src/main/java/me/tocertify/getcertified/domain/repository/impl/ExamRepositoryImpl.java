package me.tocertify.getcertified.domain.repository.impl;

import me.tocertify.getcertified.domain.Exam;
import me.tocertify.getcertified.domain.ExamQuestion;
import me.tocertify.getcertified.domain.repository.ExamRepository;
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
public class ExamRepositoryImpl implements ExamRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Exam> getAllExams() {
        String SQL = "SELECT * FROM EXAM";
        Map<String, Object> params = new HashMap<>();
        List<Exam> result = jdbcTemplate.query(SQL, params, new ExamMapper());

        return result;
    }

    @Override
    public Exam getExamById (int examId) {
        String SQL = "SELECT * FROM exam WHERE exam_id = :examId";
        Map<String, Object> params = new HashMap<>();
        params.put("examId", examId);

        return jdbcTemplate.queryForObject(SQL, params, new ExamMapper());
    }

    @Override
    public List<ExamQuestion> getExamQuestions (int examId) {
        String SQL = "SELECT * FROM exam_question WHERE exam_id = :examId";
        Map<String, Object> params = new HashMap<>();
        params.put("examId", examId);
        List<ExamQuestion> examQuestions = jdbcTemplate.query(SQL, params, new ExamQuestionMapper());

        return examQuestions;
    }

    /* Inner class */
    private static final class ExamMapper implements RowMapper<Exam> {

        public Exam mapRow(ResultSet rs, int rowNum) throws SQLException{
            Exam exam = new Exam();
            exam.setExamId(rs.getInt("exam_id"));
            exam.setExamName(rs.getString("exam_name"));
            exam.setExamNumber(rs.getString("exam_number"));

            return exam;
        }
    }

    private static final class ExamQuestionMapper implements RowMapper<ExamQuestion> {

        public ExamQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
            ExamQuestion examQuestion = new ExamQuestion();
            examQuestion.setQuestionId(rs.getInt("exam_question_id"));
            examQuestion.setQuestionText(rs.getString("question_text"));
            examQuestion.setExamId(rs.getInt("exam_id"));

            return examQuestion;
        }

    }
}

