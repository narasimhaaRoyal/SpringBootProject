package com.test.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1")
public class Controller {

    @GetMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAPI(){

        String res = "Test";
        return new ResponseEntity<>(res, HttpStatus.OK);

    }

    @PostMapping(path = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postAPI( @Valid @RequestBody DataDTO requestData){
        String res = "Accepted";
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

}
