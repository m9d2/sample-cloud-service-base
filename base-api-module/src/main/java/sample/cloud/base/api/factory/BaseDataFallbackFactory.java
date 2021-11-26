package sample.cloud.base.api.factory;

import sample.cloud.base.api.service.BaseDataClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import sample.cloud.base.domain.vo.DateVO;

@Component
public class BaseDataFallbackFactory implements BaseDataClient, FallbackFactory<BaseDataFallbackFactory> {

    private final Throwable cause;

    public BaseDataFallbackFactory() {
        this(null);
    }

    public BaseDataFallbackFactory(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public DateVO get(String info) {
        DateVO dateVO = new DateVO();
        dateVO.setId(0L);
        dateVO.setInfo("null");
        return dateVO;
    }

    @Override
    public BaseDataFallbackFactory create(Throwable cause) {
        return new BaseDataFallbackFactory(cause);
    }
}
