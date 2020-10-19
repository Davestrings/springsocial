package com.springsocial.socialmedia.model.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfiguration {

    @Bean
    public AuditorAware<String> auditorProvider(){
        return new AuditorAwareImpl();

    }

    class AuditorAwareImpl implements AuditorAware<String>{

        @Override
        public Optional<String> getCurrentAuditor() {
            String user = SecurityContextHolder.getContext().getAuthentication().getName();
            return Optional.ofNullable(user);
        }
    }
}
