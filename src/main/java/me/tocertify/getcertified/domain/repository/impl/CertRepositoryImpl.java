package me.tocertify.getcertified.domain.repository.impl;

import me.tocertify.getcertified.domain.Cert;
import me.tocertify.getcertified.domain.repository.CertRepository;
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
public class CertRepositoryImpl implements CertRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Cert> getAllCerts() {
        String SQL = "SELECT * FROM certification ORDER BY cert_name";
        Map<String, Object> params = new HashMap<>();
        List<Cert> result = jdbcTemplate.query(SQL, params, new CertMapper());

        return result;
    }

    @Override
    public Cert getCertById(int certId) {
        String SQL = "SELECT * FROM certification WHERE cert_id = :certId";
        Map<String, Object> params = new HashMap<>();
        params.put("certId", certId);

        return jdbcTemplate.queryForObject(SQL, params, new CertMapper());
    }

    @Override
    public void addCert(Cert cert) {
        String SQL = "INSERT INTO certification "
                + "(cert_name) "
                + "VALUES (:cert_name)";

        Map<String, Object> params = new HashMap<>();

        params.put("cert_name", cert.getCertName());

        jdbcTemplate.update(SQL, params);
    }

    private static final class CertMapper implements RowMapper<Cert> {

        public Cert mapRow(ResultSet rs, int rowNum) throws SQLException {
            Cert cert = new Cert();
            cert.setCertId(rs.getInt("cert_id"));
            cert.setCertName(rs.getString("cert_name"));

            return cert;
        }
    }
}
