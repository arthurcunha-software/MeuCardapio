package com.projeto.projeto.config;


import com.projeto.projeto.service.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final CustomUserDetailsService userDetailsService;

    public SecurityConfig(CustomUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/cadastro", "/css/**", "/js/**", "/h2-console/**").permitAll() // Páginas públicas
                        .anyRequest().authenticated() // Todo o resto exige login
                )
                .formLogin(form -> form
                        .loginPage("/login") // Sua rota da tela de login personalizada (se tiver)
                        .defaultSuccessUrl("/", true) // Para onde vai pós-login correto
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                        .permitAll()
                );

}
