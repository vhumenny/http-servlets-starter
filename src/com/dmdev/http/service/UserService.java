package com.dmdev.http.service;

import com.dmdev.http.dao.UserDao;
import com.dmdev.http.dto.CreateUserDto;
import com.dmdev.http.exception.ValidationException;
import com.dmdev.http.mapper.CreateUserMapper;
import com.dmdev.http.validator.CreateUserValidator;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserService {
    private static final UserService INSTANCE = new UserService();
    private final CreateUserValidator createUserValidator = CreateUserValidator.getInstance();
    private final UserDao userDao = UserDao.getInstance();
    private final CreateUserMapper mapper = CreateUserMapper.getInstance();

    public Integer create(CreateUserDto userDto) {
        var validationResult = createUserValidator.isValid(userDto);
        if (!validationResult.isValid()) {
            throw new ValidationException((validationResult.getErrors()));
        }
        var userEntity = mapper.mapFrom(userDto);
        userDao.save(userEntity);
        return userEntity.getId();
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}
