package com.example.jobseeker.model.request;

import lombok.Data;

@Data
public class UserSearchRequest extends BaseSearchRequest {

    String name;

    String email;

    Boolean activated;

    String gender;

}
