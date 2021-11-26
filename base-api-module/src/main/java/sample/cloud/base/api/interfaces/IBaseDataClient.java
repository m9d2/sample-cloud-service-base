package sample.cloud.base.api.interfaces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sample.cloud.base.domain.vo.DateVO;

public interface IBaseDataClient {

    /**
     *
     * @param info
     * @return
     */
    @RequestMapping(value = "/get/{info}", method = RequestMethod.GET)
    DateVO get(@PathVariable("info") String info);

}
