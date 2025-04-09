package com.SocialMedia.controller;

import com.SocialMedia.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class UserProfileController {
    private final UserProfileService userProfileService;
}
