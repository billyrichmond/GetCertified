package me.tocertify.getcertified.domain.repository.impl;

import me.tocertify.getcertified.domain.Exam;
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
        Map<String, Object> params = new HashMap<String, Object>();
        List<Exam> result = jdbcTemplate.query(SQL, params, new ExamMapper());

        return result;
    }

    @Override
    public Exam getExamById (String examdId) {
        String SQL = "SELECT * FROM EXAM WHERE ID = :id";
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", examdId);

        return jdbcTemplate.queryForObject(SQL, params, new ExamMapper());
    }

    /* Inner class */
    private static final class ExamMapper implements RowMapper<Exam> {

        public Exam mapRow(ResultSet rs, int rowNum) throws SQLException{
            Exam exam = new Exam();
            exam.setExamId(rs.getString("ID"));
            exam.setName((rs.getString("NAME")));

            return exam;
        }
    }
}

