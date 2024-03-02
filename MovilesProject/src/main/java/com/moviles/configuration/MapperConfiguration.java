package com.moviles.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.moviles.mapper.UserDTO2UserMapper;

@Configuration
public class MapperConfiguration {
	private final PasswordEncoder encoder;
	
    public MapperConfiguration(PasswordEncoder encoder) {
		super();
		this.encoder = encoder;
	}

	@Bean
    public UserDTO2UserMapper dto2UserMapper() {
        return new UserDTO2UserMapper(encoder);
    }

}
