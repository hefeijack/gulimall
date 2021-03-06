package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1、 整合MyBatis-Plus
 * 		1）导入依赖 pom.xml
 * 			<!--  mybatis-plus  -->
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1</version>
 *         </dependency>
 *      2） 配置
 *      	1、配置数据源  application.yml
 *      		1)导入数据库驱动 pom.xml
 *      			<dependency>
		 *             <groupId>mysql</groupId>
		 *             <artifactId>mysql-connector-java</artifactId>
		 *             <version>8.0.16</version>
		 *         </dependency>
 *      		2）在application.yml中配置数据源相关信息
 *          2、配置MyBatis-Plus:
 *          	1)使用MyBatis-Plus 告诉mapper接口的位置
 *          	2）告诉MyBatis-Plus， sql映射文件位置（在application.yml中配置）
 *
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
