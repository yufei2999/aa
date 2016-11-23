
CREATE TABLE `log4j_log` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` VARCHAR(100) NOT NULL COMMENT '用户ID',
  `user_name` VARCHAR(100) NOT NULL COMMENT '用户姓名',
  `class_name` VARCHAR(100) NOT NULL COMMENT '类名',
  `mothod_name` VARCHAR(100) NOT NULL COMMENT '方法名',
  `create_time` VARCHAR(30) NOT NULL COMMENT '发生时间',
  `log_level` VARCHAR(1000) NOT NULL COMMENT '日志级别',
  `log_message` VARCHAR(1000) NOT NULL COMMENT '日志信息',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
