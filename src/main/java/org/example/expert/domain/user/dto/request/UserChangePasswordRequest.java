package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UserChangePasswordRequest {

    private String oldPassword;

    @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야 합니다.")
    @Pattern(regexp = ".*\\d.*", message = "비밀번호에는 숫자가 포함되어야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "비밀번호에는 대문자가 포함되어야 합니다.")
    private String newPassword;
}
