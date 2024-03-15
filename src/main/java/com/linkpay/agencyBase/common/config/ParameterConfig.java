package com.linkpay.agencyBase.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class ParameterConfig {

    @Value("${sql.limitSize:3000}")
    public Integer sqlLimitSize;

}
