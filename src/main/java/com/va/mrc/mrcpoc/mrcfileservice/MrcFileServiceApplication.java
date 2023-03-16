package com.va.mrc.mrcpoc.mrcfileservice;

import com.va.mrc.mrcpoc.mrcfileservice.configs.FileConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileConfigProperties.class
})
public class MrcFileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrcFileServiceApplication.class, args);
	}

}
