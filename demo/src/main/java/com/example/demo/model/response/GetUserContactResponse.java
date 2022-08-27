package com.example.demo.model.response;

import com.example.demo.model.entity.User;
import lombok.Data;

@Data
public class GetUserContactResponse {
    private String id;

    private String address;

    private User user;

}
