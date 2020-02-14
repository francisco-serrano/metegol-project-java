package com.github.franciscoserrano.metegolproject.filters;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class MdcFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        try {
            MDC.put("correlation-id", getCorrelationId());
            filterChain.doFilter(request, response);
        } finally {
            MDC.remove("correlation-id");
        }
    }

    private String getCorrelationId() {
        return UUID.randomUUID().toString();
    }
}

