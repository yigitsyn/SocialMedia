package com.SocialMedia.service;


import com.SocialMedia.dto.request.CreateUserRequestDto;
import com.SocialMedia.dto.request.LoginResponseDto;
import com.SocialMedia.dto.request.RegisterRequestDto;
import com.SocialMedia.entity.Auth;
import com.SocialMedia.manager.UserProfileManager;
import com.SocialMedia.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;
    private final UserProfileManager userProfileManager;

    public Auth register(RegisterRequestDto dto) {
        Auth auth = authRepository.save(Auth.builder()
                        .userName(dto.getUserName())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                .build());
        userProfileManager.creteUser(CreateUserRequestDto.builder()
                        .authId(auth.getId())
                        .email(auth.getEmail())
                        .userName(auth.getUserName())
                .build());
        return auth;
    }

    public Boolean login(LoginResponseDto dto) {
        return authRepository.existsByUserNameAndPassword(dto.getUsername(),dto.getPassword());
    }
}
