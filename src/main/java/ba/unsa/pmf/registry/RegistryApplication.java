package ba.unsa.pmf.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ba.unsa.pmf.registry.rest","ba.unsa.pmf.registry.core.impl","ba.unsa.pmf.registry.core.mapper",
		"ba.unsa.pmf.registry.api.model","ba.unsa.pmf.registry.dao.entity","ba.unsa.pmf.registry.dao.repository","ba.unsa.pmf.registry.web" })
//@EnableEurekaClient
@SpringBootApplication
public class RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryApplication.class, args);
	}

}
