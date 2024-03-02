package com.moviles.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.moviles.mapper.UserDTO2UserMapper;

@Configuration
public class MapperConfiguration {

    @Bean
    public UserDTO2UserMapper dto2UserMapper() {
        return new UserDTO2UserMapper();
    }

}
