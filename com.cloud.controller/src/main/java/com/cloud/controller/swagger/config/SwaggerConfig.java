package com.cloud.controller.swagger.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/** 
 * ClassName: a
 * Function: TODO
 * Description: TODO
 * date: 2018年7月9日 下午4:26:42 
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version  
 * @since JDK 1.8
*/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	@Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.didispace.web"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Spring Boot中使用Swagger2构建RESTful APIs")
//                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
//                .termsOfServiceUrl("http://blog.didispace.com/")
//                .contact("程序猿DD")
//                .version("1.0")
//                .build();
//    }
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("对外开放接口API 文档")
				.description("HTTP对外开放接口")
				.version("1.0.0")
				.termsOfServiceUrl("http://xxx.xxx.com")
				.license("LICENSE")
				.licenseUrl("http://xxx.xxx.com")
				.build();
	}

}