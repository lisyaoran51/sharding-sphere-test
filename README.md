# sharding-sphere-test


## quick start

https://juejin.cn/post/6956387543482892295

```
CREATE TABLE `t_order_1` (
	`order_id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
	`user_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '用户 id',
	`total_price` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '订单价格',
	`state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '订单状态',
	`create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`order_id`),
	INDEX `user_id` (`user_id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;

CREATE TABLE `t_order_2` (
	`order_id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
	`user_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '用户 id',
	`total_price` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '订单价格',
	`state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '订单状态',
	`create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`order_id`),
	INDEX `user_id` (`user_id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
```

```
CREATE TABLE `platform` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '代理商所在平台名称',
  `registration_method` tinyint DEFAULT NULL COMMENT '註冊方式 1:手機 2:email',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '創建時間',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新時間',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='代理商所在平台';
```