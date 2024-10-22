package sample.cloud.base.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.cloud.base.api.client.UserServiceClient;
import sample.cloud.base.domain.User;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController implements UserServiceClient {

    @Override
    public User getById(Long id) {
        log.info("getById({})", id);
        User user = new User();
        user.setId(id);
        user.setName("admin");
        return user;
    }

}
