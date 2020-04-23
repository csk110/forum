package com.example.forum.vo;

import lombok.Data;

import java.util.List;

@Data
public class LoginSuccess {
    private String userId;
    private String postStationId;
    private String postStationName;
    private String streetId;
    private String streetName;
    private Integer userType;
    private String token;
    private String userName;
    private String realName;
    private List<String> permissions;

    public LoginSuccess() {
    }

    public LoginSuccess(String userId, String postStationId, String postStationName, String streetId, String streetName, Integer userType, String token, String userName, String realName, List<String> permissions) {
        this.userId = userId;
        this.postStationId = postStationId;
        this.postStationName = postStationName;
        this.streetId = streetId;
        this.streetName = streetName;
        this.userType = userType;
        this.token = token;
        this.userName = userName;
        this.realName = realName;
        this.permissions = permissions;
    }
}
