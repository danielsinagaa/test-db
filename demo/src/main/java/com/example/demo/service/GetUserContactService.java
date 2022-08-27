package com.example.demo.service;

import com.example.demo.model.entity.UserContact;
import com.example.demo.model.request.GetUserContactRequest;
import com.example.demo.model.response.GetUserContactResponse;
import com.example.demo.repository.UserContactRepository;
import org.springframework.stereotype.Service;

@Service
public class GetUserContactService implements BaseService<GetUserContactResponse, GetUserContactRequest> {

    private UserContactRepository userContactRepository;

    public GetUserContactService(UserContactRepository userContactRepository) {
        this.userContactRepository = userContactRepository;
    }

    @Override
    public GetUserContactResponse execute(GetUserContactRequest request) {
        UserContact userContact = userContactRepository.findById(request.getId()).orElseThrow();

        GetUserContactResponse response = new GetUserContactResponse();
        response.setUser(userContact.getUser());
        response.setId(userContact.getId());
        response.setAddress(userContact.getAddress());

        return response;
    }
}
