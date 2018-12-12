package pl.agora.miglanc;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ToString
@ConfigurationProperties(prefix = "miglanc.oracle")
@Component
public class OracleDSProperty {
    String url;
    String username;
    String password;
    String driver;
}
