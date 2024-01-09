package com.blackpearl.qa.technical.test.appconfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
@Configuration
public class BlackPearlConfig {
    @Value("${spring.service.blackPearl.getNeraPerla}")
    private String getNeraPerla;
    @Value("${spring.service.blackPearl.userNameAndPassword}")
    private String userNameAndPassword;
    @Value("${spring.service.blackPearl.userNameField}")
    private String userNameField;
    @Value("${spring.service.blackPearl.userName}")
    private String userName;
    @Value("${spring.service.blackPearl.PasswordField}")
    private String PasswordField;
    @Value("${spring.service.blackPearl.password}")
    private String password;
    @Value("${spring.service.blackPearl.loginButton}")
    private String loginButton;
    @Value("${spring.service.blackPearl.welcomeHeader}")
    private String welcomeHeader;
    @Value("${spring.service.blackPearl.userEmail}")
    private String userEmail;

}
