package com.nanjolono.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: nanjolono-parent
 * @description: WebSecurityConfigurer
 * @author: nanjolono
 * @create: 2020-11-09 22:02
 **/
@Configuration
public class WebSecurityConfigurer
        extends WebSecurityConfigurerAdapter {
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }

    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return super.userDetailsServiceBean();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("john.carnell")
                .password(new BCryptPasswordEncoder().encode("password1"))
                .roles("USER")
                .and()
                .withUser("william.woodward")
                .password(new BCryptPasswordEncoder().encode("password2"))
                .roles("USER", "ADMIN");
    }
}
