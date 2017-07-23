package comm.hanhan.springboot001.springbootdemo001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication//写上这个注解是为了自动扫描该文件下所有的包
//下面一个注解是扫描接口完成dao层注入
@MapperScan("comm.hanhan.springboot001.springbootdemo001.dao.mapperJava01")
public class Springbootdemo001Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo001Application.class, args);
	}
}
