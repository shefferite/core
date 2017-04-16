package de.scheff.core.config;

import com.github.shefferite.service.YDictionaryService;
import com.github.shefferite.service.impl.YDictionaryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by User on 26/03/2017.
 */
@Configuration
public class ApplicationConfig {

    private static final String KEY = "dict.1.1.20160709T070521Z.f6adbfd7915e5e2d.64e8423880abfbc7721f8b280d6d02c2886a3879";

    @Bean
    public YDictionaryService dictionaryService() {
        return new YDictionaryServiceImpl(KEY);
    }
}