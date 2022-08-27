package com.example.demo.service;

import com.example.demo.model.entity.User;
import com.example.demo.model.request.GetUserRequest;
import com.example.demo.model.response.GetUserResponse;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class GetUserService implements BaseService<GetUserResponse, GetUserRequest> {

    private UserRepository userRepository;

    public GetUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public GetUserResponse execute(GetUserRequest request) {
        User user = userRepository.findById(request.getId()).orElseThrow();

        GetUserResponse response = new GetUserResponse();
        response.setAge(user.getAge());
        response.setId(user.getId());
        response.setName(user.getName());
        return response;
    }
}
