package com.lisovskiy.myproject.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.*;

public class SpringWebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(WebMvcConfig.class);

        ServletRegistration.Dynamic servlet = servletContext.addServlet("Spring Dispatcher",
                new DispatcherServlet(applicationContext));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");

        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);

        filterRegistration.setInitParameter("encoding", "UTF-8");
        filterRegistration.setInitParameter("forceEncoding", "true");
        filterRegistration.addMappingForUrlPatterns(null, true, "/*");

    }



}
