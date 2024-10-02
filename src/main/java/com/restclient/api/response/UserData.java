package com.restclient.api.response;

import com.restclient.api.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserData {

    List<User> data;
}
