package com.example.demo.controller;

import com.example.demo.model.request.GetUserContactRequest;
import com.example.demo.model.request.GetUserRequest;
import com.example.demo.model.response.GetUserContactResponse;
import com.example.demo.model.response.GetUserResponse;
import com.example.demo.service.GetUserContactService;
import com.example.demo.service.GetUserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/test/")
public class UserController {

    private GetUserContactService getUserContactService;
    private GetUserService getUserService;

    public UserController(GetUserContactService getUserContactService, GetUserService getUserService) {
        this.getUserContactService = getUserContactService;
        this.getUserService = getUserService;
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetUserResponse getUser(@RequestParam String id){
        GetUserRequest request = new GetUserRequest();
        request.setId(id);
        return getUserService.execute(request);
    }

    @GetMapping(value = "/user/contact/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetUserContactResponse getUser(GetUserContactRequest request){
        return getUserContactService.execute(request);
    }
}
