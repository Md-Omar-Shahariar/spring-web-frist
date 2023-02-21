package first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/")
    public Greeting greet(){
        Greeting response = new Greeting("Afridi",List.of("ta","pa"),new Person("Afridi"));
        
        return response;
    }

    record Greeting(
            String name,
            List<String> favlang,
            Person person
    ){}
    record Person(String name){}
}
