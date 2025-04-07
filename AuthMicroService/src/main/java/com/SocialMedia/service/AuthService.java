package com.SocialMedia.service;


import com.SocialMedia.dto.request.LoginResponseDto;
import com.SocialMedia.dto.request.RegisterRequestDto;
import com.SocialMedia.entity.Auth;
import com.SocialMedia.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    public Auth register(RegisterRequestDto dto) {
        return authRepository.save(Auth.builder()
                        .username(dto.getUserName())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                .build());
    }

    public Boolean login(LoginResponseDto dto) {
        return authRepository.existsByUserNameAndPassword(dto.getUsername(),dto.getPassword());
    }
}
