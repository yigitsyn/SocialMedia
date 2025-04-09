package com.SocialMedia.config;

public class RestApis {
    public static final String DEVELOPER = "/dev";
    public static final String TEST = "/test";
    public static final String RELEASE = "/prod";
    public static final String VERSIONS = "/v1";
    public static final String AUTHSERVICE = DEVELOPER+VERSIONS+"/auth";
    public static final String REGISTER = "/register";
    public static final String LOGIN = "/login";
    public static final String USERPROFILEURL="http://localhost:9091";
    public static final String USERPROFILEFEIGNCLIENT = "/dev/v1/user-profile";
    public static final String USERPROFILEFEIGNUSER = USERPROFILEURL+USERPROFILEFEIGNCLIENT;
    public static final String CREATEUSER = "/create-user";
}
