package com.SocialMedia.manager;

import com.SocialMedia.dto.request.CreateUserRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.SocialMedia.config.RestApis.*;

@FeignClient(url = USERPROFILEFEIGNUSER, name = "userProfileManager")
public interface UserProfileManager {

    @PostMapping(CREATEUSER)
    ResponseEntity<Boolean> creteUser(@RequestBody CreateUserRequestDto createUserRequestDto);

}
