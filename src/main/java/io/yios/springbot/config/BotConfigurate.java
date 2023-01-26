package io.yios.springbot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Data
@PropertySource("application.properties")
@Configuration
public class BotConfigurate {

@Value("${bot.name}")
    String botName;
@Value("$bot.key")
    String botKey;

}
