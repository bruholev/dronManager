package kg.Robotics.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebService {

    public WebService() {
    }

    public String requestTask(String message){
        String responceXML="";
     try{ responceXML  = WebClient.create("http://localhost:8800").get().uri("/"+message)
                //.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).header("X-API-KEY",x_api_key)
                //.body(Mono.just("{}"),String.class)
                .retrieve().bodyToMono(String.class).toProcessor().block();
       }
     catch (Exception e){e.printStackTrace();}
        return responceXML;
    }


}
