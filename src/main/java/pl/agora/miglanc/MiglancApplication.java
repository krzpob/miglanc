package pl.agora.miglanc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

@Slf4j
@SpringBootApplication
public class MiglancApplication implements CommandLineRunner {

    private NamedParameterJdbcOperations jdbcOperations;

    public MiglancApplication(NamedParameterJdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public static void main(String[] args) {
        SpringApplication.run(MiglancApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("TESTSTSTS");

    }
}
