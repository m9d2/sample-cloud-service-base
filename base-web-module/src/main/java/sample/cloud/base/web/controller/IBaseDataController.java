package sample.cloud.base.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.cloud.base.api.interfaces.IBaseDataClient;
import sample.cloud.base.domain.vo.DateVO;

@RestController
@RequestMapping("/feign/base-data")
@Slf4j
public class IBaseDataController implements IBaseDataClient {

    @Override
    public DateVO get(String info) {
        log.info("get data, params: {}", info);
        DateVO dateVO = new DateVO();
        dateVO.setId(1L);
        dateVO.setInfo(info);
        return dateVO;
    }
}
