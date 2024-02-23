package org.example.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.example.entity.Event;

import java.io.IOException;

public class EventService {

    private static final CloseableHttpClient httpClient = HttpClients.createDefault();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String getAllEvents() throws IOException, ParseException {
        HttpGet request = new HttpGet("http://localhost:8080/events");
        return executeRequest(request);
    }

    public static String getEventById(Long id) throws IOException, ParseException {
        HttpGet request = new HttpGet("http://localhost:8080/events/" + id);
        return executeRequest(request);
    }

    public static String addEvent(Event event) throws IOException, ParseException {
        HttpPost request = new HttpPost("http://localhost:8080/events");
        String json = objectMapper.writeValueAsString(event);
        request.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));
        return executeRequest(request);
    }

    public static String updateEvent(Event event) throws IOException, ParseException {
        HttpPut request = new HttpPut("http://localhost:8080/events");
        String json = objectMapper.writeValueAsString(event);
        request.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));
        return executeRequest(request);
    }

    public static String deleteEventById(Long id) throws IOException, ParseException {
        HttpDelete request = new HttpDelete("http://localhost:8080/events/" + id);
        return executeRequest(request);
    }

    private static String executeRequest(HttpUriRequestBase request) throws IOException, ParseException {
        CloseableHttpResponse response = httpClient.execute(request);
        if (response.getCode() != 200) {
            System.out.println("Error occurred");
            return null;
        }
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity);
    }
}
