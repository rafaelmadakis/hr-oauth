package com.madakis.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {

    /**
     * Para trabalhar com segurança/JWT
     */
    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
        tokenConverter.setSigningKey("MY-SECRETE-KEY");
        return tokenConverter;
    }

    /**
     * JWT/Segurança
     */
    @Bean
    public JwtTokenStore TokenStore() {
        return new JwtTokenStore(accessTokenConverter());
    }
}

