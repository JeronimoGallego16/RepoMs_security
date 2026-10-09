package com.uc.ms_security.dto.user;

import com.uc.ms_security.dto.profile.ProfileResponseDTO;
import lombok.Value;

@Value
public class UserDetailResponseDTO {
    Long id;
    String name;
    String email;
    ProfileResponseDTO profile; // se puede anexar la lista de las sesiones del usuario si lo queremos.
}