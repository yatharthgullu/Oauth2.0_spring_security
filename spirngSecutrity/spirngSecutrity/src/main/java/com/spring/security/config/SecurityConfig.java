package com.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails normalUser = User.withUsername("kandu")
                .password(passwordEncoder().encode("kandu@123"))
                .roles("USER").build();

        UserDetails adminUser = User.withUsername("yatharth")
                .password(passwordEncoder().encode("yatharth@123"))
                .roles("ADMIN").build();

       InMemoryUserDetailsManager memoryUserDetailsManager= new InMemoryUserDetailsManager(normalUser,adminUser);
       return memoryUserDetailsManager;


//        return  new CustomUserDetailService();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.
                csrf().
                disable().
                authorizeHttpRequests()
                .requestMatchers("/home/admin/**").
                hasRole("ADMIN").
                requestMatchers("/home/user")
                .hasRole("USER")
                .requestMatchers("/home/public")
                .permitAll().
                anyRequest().
                authenticated()
                .and().
                formLogin();
        return httpSecurity.build();
    }
}
