package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //java class로 설정(configuration)하는 방법
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		//authorization 부분. 어떤 request든 모두 허용
        http        
        	.authorizeRequests()
        		.anyRequest()
        		.permitAll()
        		.and()
            .csrf().disable();
    }
}