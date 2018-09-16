package app.web;

import app.model.DefaultRestResult;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SampleWebServiceController {

    @GetMapping(value = "/", produces = "application/json")
    public String index() {
        // Init required objects
        Gson gson = new Gson();
        DefaultRestResult restResult = new DefaultRestResult();

        // WebService Body
        ArrayList<String> linksList = new ArrayList<>();
        linksList.add("/hello");
        restResult.setLinks(linksList);

        // Return the object as a json string
        return gson.toJson(restResult);
    }

    @GetMapping(value = "/hello", produces = "application/json")
    public String hello() {
        // Init required objects
        Gson gson = new Gson();
        DefaultRestResult restResult = new DefaultRestResult();

        // WebService Body
        restResult.setData("Hello!");


        // Return the object as a json string
        return gson.toJson(restResult);
    }
}