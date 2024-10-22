package sample.cloud.base.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import sample.cloud.base.domain.User;
import sample.cloud.common.constants.ServiceName;

@FeignClient(name = ServiceName.BASE_SERVICE, path = "/user")
public interface UserServiceClient {

    @GetMapping("/{id}")
    User getById(@PathVariable("id") Long id);

}
