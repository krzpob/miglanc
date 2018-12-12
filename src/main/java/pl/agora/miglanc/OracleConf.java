package pl.agora.miglanc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class OracleConf {

    final private OracleDSProperty oracleDSProperty;

    public OracleConf(OracleDSProperty oracleDSProperty) {
        this.oracleDSProperty = oracleDSProperty;
    }

    private DataSource oracleDataSource(){
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(oracleDSProperty.getDriver());
        dataSource.setUrl(oracleDSProperty.getUrl());
        dataSource.setUsername(oracleDSProperty.getUsername());
        dataSource.setPassword(oracleDSProperty.password);
        return dataSource;
    }

    @Bean
    NamedParameterJdbcOperations jdbcOperations(){
        return new NamedParameterJdbcTemplate(oracleDataSource());
    }
}
