package comm.hanhan.springboot001.springbootdemo001.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class RegisterInterceptor extends WebMvcConfigurerAdapter {

    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new InterceptorLogin()).addPathPatterns("/**").excludePathPatterns("/login");

        super.addInterceptors(registry);
    }
}
