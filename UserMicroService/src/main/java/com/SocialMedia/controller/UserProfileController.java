package com.SocialMedia.controller;

import com.SocialMedia.document.UserProfile;
import com.SocialMedia.dto.request.CreateUserRequestDto;
import com.SocialMedia.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.SocialMedia.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(CREATEUSER)
    public ResponseEntity<Boolean> createUserProfile(@RequestBody CreateUserRequestDto dto) {
        userProfileService.createUser(dto);
        return ResponseEntity.ok(true);
    }

    @GetMapping(GET_ALL)
    ResponseEntity<List<UserProfile>> getAllUserProfiles() {
        return ResponseEntity.ok(userProfileService.getAll());
    }
}
