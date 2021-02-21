package com.nanjolono.provider8081.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class UserContextInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(
            HttpRequest request,
            byte[] body,
            ClientHttpRequestExecution execution
    ) throws IOException {
        HttpHeaders httpheaders = request.getHeaders();
        httpheaders.add(
                UserContext.CORRELATION_ID,
                UserContextHolder
                        .getContext()
                        .getCorrelationId());
        httpheaders.add(
                UserContext.AUTH_TOKEN,
                UserContextHolder
                        .getContext()
                        .getAuthToken());
        return execution.execute(request,body);
    }
}
