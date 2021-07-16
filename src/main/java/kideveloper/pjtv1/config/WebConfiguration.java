package kideveloper.pjtv1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("/static/", "classpath:/static/");
    }
}
