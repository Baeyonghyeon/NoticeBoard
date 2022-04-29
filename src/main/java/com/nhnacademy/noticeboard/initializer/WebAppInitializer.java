package com.nhnacademy.noticeboard.initializer;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@Slf4j
@HandlesTypes({
    javax.servlet.Servlet.class,
    javax.servlet.Filter.class,
    javax.servlet.ServletContextListener.class
})
public class WebAppInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("counterFile", "counter.dat");
        servletContext.setAttribute("id", "admin");
        servletContext.setInitParameter("pwd", "12345");

        System.out.println("실행안됨");
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));
        log.debug("값이 들어가긴 하는거냐 : " + servletContext.getAttribute("id"));

    }



}
