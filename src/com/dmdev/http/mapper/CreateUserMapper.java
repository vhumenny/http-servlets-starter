package com.dmdev.http.mapper;

import com.dmdev.http.dto.CreateUserDto;
import com.dmdev.http.entity.Gender;
import com.dmdev.http.entity.Role;
import com.dmdev.http.entity.User;
import com.dmdev.http.util.LocalDateFormatter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateUserMapper implements Mapper<CreateUserDto, User>{
    private static final CreateUserMapper INSTANCE = new CreateUserMapper();
    @Override
    public User mapFrom(CreateUserDto object) {
        return User.builder()
                .name(object.getName())
                .birthday(LocalDateFormatter.format(object.getBirthday()))
                .email(object.getEmail())
                .password(object.getPassword())
                .role(Role.valueOf(object.getRole()))
                .gender(Gender.valueOf(object.getGender()))
                .build();
    }
    public static CreateUserMapper getInstance() {
        return INSTANCE;
    }
}
