package dmall.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "dmall.usermanage.mapper")
public class DmallUserManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmallUserManageApplication.class, args);
	}

}
