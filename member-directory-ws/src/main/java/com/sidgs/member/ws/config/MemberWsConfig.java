package com.sidgs.member.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Properties;

/**
 * Used to load configuration that was provided with member-service
 * This is for Spring 4 Only
 */

@Configuration
@ImportResource ("classpath*:META-INF/*appContext.xml")
public class MemberWsConfig {
        
	
	 

}

