package com.nanjolono.auth.model.biz;

import com.nanjolono.auth.service.AuthenticationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@DisplayName("the first test")
@ExtendWith(MockitoExtension.class)
public class UserDtoTest {
    @Mock
    AuthenticationService authenticationService;
    @Test
    @DisplayName("the first test of userdto")
    public void name() {
        System.out.println("success");
    }

}