package me.tocertify.getcertified.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// import javax.sql.DataSource;

@Configuration
@ComponentScan("me.tocertify.getcertified")
public class RootApplicationContextConfig {

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.56.102:3306/getcertified");
        dataSource.setUsername("cert");
        dataSource.setPassword("cert");

        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate getJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource());
    }
}
