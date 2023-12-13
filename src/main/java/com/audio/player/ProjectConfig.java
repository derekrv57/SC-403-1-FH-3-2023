/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class ProjectConfig {

    @Bean
    public UserDetailsService users() {
        UserDetails admin = User.builder()
                .username("ADMIN")
                .password("$2a$10$S2m5ZHyI68/Z3JGF6B2Jt.0eDk/mr8AfP2kD9YUG0tEl8qFdmuOyC") // BCrypt encoded password
                .roles("USUARIO", "ADMIN")
                .build();
        UserDetails artist = User.builder()
                .username("ARTIST")
                .password("$2a$10$S2m5ZHyI68/Z3JGF6B2Jt.0eDk/mr8AfP2kD9YUG0tEl8qFdmuOyC") // BCrypt encoded password
                .roles("USUARIO")
                .build();
        return new InMemoryUserDetailsManager(artist, admin);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests((requests) -> requests
                        .antMatchers("/", "/account/**", "/album/**",
                                "/artist/**", "/index/**", "/join/**",
                                "/login/**", "/playlist/**", "/song/**", "/logout/**")
                        .hasAnyRole("USUARIO", "ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login").permitAll())
                .logout((logout) -> logout.permitAll());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}


