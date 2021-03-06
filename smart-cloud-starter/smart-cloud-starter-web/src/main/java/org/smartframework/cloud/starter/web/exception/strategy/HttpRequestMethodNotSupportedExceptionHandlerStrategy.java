package org.smartframework.cloud.starter.web.exception.strategy;

import org.smartframework.cloud.common.pojo.enums.ReturnCodeEnum;
import org.smartframework.cloud.common.pojo.vo.RespHeadVO;
import org.smartframework.cloud.starter.core.business.util.RespHeadUtil;
import org.smartframework.cloud.starter.web.exception.AbstractExceptionHandlerStrategy;
import org.springframework.web.HttpRequestMethodNotSupportedException;

/**
 * @author liyulin
 * @desc http请求方式不支持异常转换
 * @date 2019/10/29
 */
public class HttpRequestMethodNotSupportedExceptionHandlerStrategy extends AbstractExceptionHandlerStrategy {

    @Override
    public boolean isNeedServletEnv() {
        return true;
    }

    @Override
    public boolean match(Throwable e) {
        return e instanceof HttpRequestMethodNotSupportedException;
    }

    @Override
    public RespHeadVO transRespHead(Throwable e) {
        return RespHeadUtil.ofI18n(ReturnCodeEnum.REQUEST_METHOD_NOT_SUPPORTED);
    }

}