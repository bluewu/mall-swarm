package cn.blue.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"cn.blue.mall.mapper","cn.blue.mall.search.mapper"})
public class MyBatisConfig {
}
