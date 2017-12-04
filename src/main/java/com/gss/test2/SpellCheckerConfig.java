package com.gss.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class SpellCheckerConfig {

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
