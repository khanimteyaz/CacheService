package com.flipkart.gradle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * Created by imteyaz.khan on 05/07/17.
 */
@RestController
@Slf4j
public class GreetingController {
    @RequestMapping(path = "/greeting",method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE,
            })
    public @ResponseBody
    ResponseEntity<String> greet(@RequestParam(name = "name")String name) {
       return new ResponseEntity("Hello "+name, HttpStatus.OK);
    }

    @RequestMapping(path = "/greeting",method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE,
    })
    public @ResponseBody
    ResponseEntity<String> greetPost(@RequestParam(name = "name")String name) {
        log.info("greetPost::Got request from {}",name);
        String profile=System.getProperty("spring.profile.active");
        return new ResponseEntity("Hello "+name+" ["+profile+"]", HttpStatus.OK);
    }
}
