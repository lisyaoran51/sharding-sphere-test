package com.linkpay.agencyBase.sharding;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.stream.Collectors;

//https://juejin.cn/post/6890772387000762382
@Slf4j
public class TablePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    public TablePreciseShardingAlgorithm() {
        log.info("初始化 DatabaseHintShardingAlgorithm");
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        log.info("aaaaaasdasdasdfaasdasdasdbasdbasbdasdbasdbasdbasb");
        return "course_ggggg";
    }
}
