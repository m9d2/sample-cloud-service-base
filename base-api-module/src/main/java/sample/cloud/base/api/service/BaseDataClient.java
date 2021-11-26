package sample.cloud.base.api.service;

import sample.cloud.base.api.factory.BaseDataFallbackFactory;
import sample.cloud.base.api.interfaces.IBaseDataClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "sample-cloud-service-base", path = "/service-base/feign/base-data", fallbackFactory = BaseDataFallbackFactory.class)
public interface BaseDataClient extends IBaseDataClient {
}
