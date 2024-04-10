package com.example.demo.security;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @SuppressWarnings({ "deprecation", "removal" })
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() 
            .authorizeRequests(authorizeRequests ->
                authorizeRequests
                    .anyRequest().permitAll() 
            );
        return http.build();
    }
}
