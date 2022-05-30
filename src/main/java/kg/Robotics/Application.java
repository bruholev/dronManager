package kg.Robotics;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application /*extends SpringBootServletInitializer*/ {


	public static void main(String[] args) throws Exception {

		SpringApplication.run(Application.class, args);
	}

/*@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(Application.class);
}*/


}


