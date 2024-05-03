package KOSA.spring.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;


//로그를 사용하기 위한 어노테이션
@Slf4j
@Controller
public class SampleController {
	//지금 이 컨트롤러는 사용자에게 전달되는 값은 없다

	@RequestMapping(value="/ex1", method = RequestMethod.GET)
	//"/ex1"이라는 값으로 GET방법으로 요청이 오면 다음 함수를 실행한다.
    public void ex1(String name, int age){
        log.info("ex1........");
        log.info("name: " + name);
        log.info("age: " + age);
    }
	
	@GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "AAA") String name,
                    @RequestParam(name = "age", defaultValue = "20")int age){
        log.info("ex2........");
        log.info("name: " + name);
        log.info("age: " + age);
    }
	
}
