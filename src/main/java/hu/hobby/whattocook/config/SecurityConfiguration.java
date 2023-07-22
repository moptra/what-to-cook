package hu.hobby.whattocook.config;



import hu.hobby.whattocook.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;
    private final CustomUserService customUserService;

    @Autowired
    public SecurityConfiguration(PasswordEncoder passwordEncoder, CustomUserService customUserService) {
        this.passwordEncoder = passwordEncoder;
        this.customUserService = customUserService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService).passwordEncoder(passwordEncoder);
    }

/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //@formatter:off

        //TODO

        http
                .cors()
                .and()
                .csrf().disable()
                .httpBasic()
                .and().authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .logout()
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true)
                .clearAuthentication(true);
        //@formatter:on
    }*/
}
