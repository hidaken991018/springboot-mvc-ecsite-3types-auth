package myapp.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

//import myapp.common.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	//
	//
	//    @Autowired
	////    private UserDetailsServiceImpl userDetailsService;
	//
	//    //フォームの値と比較するDBから取得したパスワードは暗号化されているのでフォームの値も暗号化するために利用
	//    @Bean
	//    public BCryptPasswordEncoder passwordEncoder() {
	//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	//        return bCryptPasswordEncoder;
	//    }

	//    
	//    @Bean
	//    public WebSecurityCustomizer webSecurityCustomizer() {
	//        return web -> web.ignoring()
	//        		.requestMatchers(
	//        				"/css/**","/js/**","/img/**");
	//        
	//    }

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/register").permitAll()
				//    	             .requestMatchers("/admin/**").hasRole("ADMIN")
				//    	             .requestMatchers("/seller/**").hasRole("SELLER")
				//    	             .requestMatchers("/buyer/**").hasRole("BUYER")
				.anyRequest().authenticated()

		)
				.formLogin(login -> login
						.loginPage("/login")
						.loginProcessingUrl("/sign_in")
						.defaultSuccessUrl("/auth_select")
						.failureUrl("/login?error")
						.permitAll())
				.logout(logout -> logout
						.logoutUrl("/logout")
						.logoutSuccessUrl("/login?logout")
						.permitAll())
				.csrf(csrf -> csrf
						.disable());
		return http.build();
	}

}
