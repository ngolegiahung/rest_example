package com.restclient.rest_client_examples.services;

import com.restclient.api.model.User;

import java.util.List;

interface ApiService {

    List<User> getUser(Integer limit);
}
