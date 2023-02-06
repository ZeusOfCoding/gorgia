package com.pnb.cx;

import com.google.gson.Gson;
import com.pnb.model.account.Account;
import com.pnb.model.message.Message;
import com.pnb.model.ticketMessage.From;
import com.pnb.model.ticketMessage.Source;
import com.pnb.model.ticketMessage.To;
import com.pnb.ticket.Ticket;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;


public class Requests {

    private static final String BASE_URL = "https://blaisepaho.gorgias.com/api/";
    private static final String USERNAME = "dev.blaisepaho@gmail.com";
    private static final String API_KEY = "adbb7ed719959a3640a72d33de1a893ad69df8bb1e70903b42e6c15fa104991e";
    private static final long TICKET_ID = 2673266;

    public static Account getAccountInfo() throws URISyntaxException, IOException, InterruptedException {

        // Concatenate customer key and customer secret and use base64 to encode the concatenated string
        String plainCredentials = USERNAME + ":" + API_KEY;
        String base64Credentials = new String(Base64.getEncoder().encode(plainCredentials.getBytes()));
        // Create authorization header
        String authorizationHeader = "Basic " + base64Credentials;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(BASE_URL+"account"))
                .header("Authorization", authorizationHeader)
//                .headers("username", USERNAME, "password", API_KEY)
                .header("Content-Type", "application/json")
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println(response.body());
        return new Gson().fromJson(response.body(), Account.class);
    }

    public static Ticket getTicket(long ticket_id) throws URISyntaxException, IOException, InterruptedException {

        String plainCredentials = USERNAME + ":" + API_KEY;
        String base64Credentials = new String(Base64.getEncoder().encode(plainCredentials.getBytes()));
        String authorizationHeader = "Basic " + base64Credentials;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(BASE_URL+"tickets/" + ticket_id + "/"))
                .header("Authorization", authorizationHeader)
//                .headers("username", USERNAME, "password", API_KEY)
                .header("Content-Type", "application/json")
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println(response.body());
        return new Gson().fromJson(response.body(), Ticket.class);
    }


    public static void sendMessage(long ticket_id, String user_email, String message, String pass_token) throws URISyntaxException, IOException, InterruptedException {
        String plainCredentials = user_email + ":" + pass_token;
        String base64Credentials = new String(Base64.getEncoder().encode(plainCredentials.getBytes()));
        String authorizationHeader = "Basic " + base64Credentials;

        List<To> L = new ArrayList<To>();
        L.add(To.builder().name(user_email).address(user_email).build());
        Message pojoMessage = Message.builder()
                .body_text(message)
                .from_agent(false)
                .source(Source.builder().type("email")
                        .from(From.builder().address(user_email).build())
                        .to(
                                Arrays.asList(
                                        To.builder().name(user_email).address(user_email).build()
                                )
                        )
                        .build())
                .channel("email")
                .via("api")
                .build();

        Gson gson = new Gson();
        String json_message = gson.toJson(pojoMessage);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(BASE_URL+"tickets/" + ticket_id + "/messages"))
                .header("Authorization", authorizationHeader)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json_message))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("----------------------------------------------------------------");
        System.out.println(response.body());
    }

    public static void main(String[] args) {
        try {
//            Account accountInfo = Requests.getAccountInfo();
//            System.out.println(accountInfo);
//            String message = "Here is the content of the message";
//            Requests.sendMessage(TICKET_ID, USERNAME, message, API_KEY);
            Ticket ticket = Requests.getTicket(TICKET_ID);
            System.out.println("--------------------------------");
            System.out.println(ticket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
