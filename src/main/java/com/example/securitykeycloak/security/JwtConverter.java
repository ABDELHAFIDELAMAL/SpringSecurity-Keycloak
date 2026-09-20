package com.example.securitykeycloak.security;

import org.springframework.context.annotation.Bean;



public class JwtConverter {
    @Bean
    public JwtConverter jwtConverter() {
        return new JwtConverter();
    }
}
