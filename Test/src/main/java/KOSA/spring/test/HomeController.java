package KOSA.spring.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {

private static final Logger logger = LoggerFactory.getLogger(HomeController.class);



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
	
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	
		String formattedDate = dateFormat.format(date);
	
		//추가한 부분
		String helloWorld = "Hello World - 박상훈";
		model.addAttribute("helloWorld",helloWorld);
		
		
		model.addAttribute("serverTime", formattedDate );
	
		return "home";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	//add라는 주소로 Get 요청이 오면
	//1. 주소 표시줄에 "/add"를 입력하고 엔터를 누르는 경우.
	//2. 링크를 클릭하여 "/add"로 이동하는 경우에는
	public String add_form(Model model) {
		return "add_form";
		//"add_form"이라는 jsp를 응답한다.
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	//클라이언트로부터 POST요청이 오면 add메소드가 호출됩니다.
	public String add(int a, int b, Model model) {
	//이 메소드는 int a와 int b 두 개의 파라미터를 매개변수로 받는다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	
		model.addAttribute("result", a + b);
		//받은 두 숫자를 더한 결과를  Model에 추가하여 View에 전달한다.
		return "add";
	}

	@RequestMapping(value = "/add2")
	//method 속성이 명시되지 않은 경우에는 
	//기본적으로 모든 HTTP 요청 메소드(GET, POST, PUT, DELETE 등)에 대해 동작합니다.
	public String add2(int a, int b, Model model) {
	
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	
		model.addAttribute("result", a + b);
	
		return "add";
	}
	
	@RequestMapping(value = "/add2Form")
	//add2Form의 이름으로 요청이 들어오면
	public String addForm(Model model) {
		//addForm이라는 함수가 실행되며
		return "add_form2";
		//add_form2이라는 이름의 jsp 파일이 응답된다.
	}
	

	@RequestMapping(value = "/add3Form")
	//add3Form의 이름으로 요청이 들어오면
	public String addForm3(Model model) {
		//addForm3이라는 함수가 실행되며
		return "add_form3";
		//add_form3이라는 이름의 jsp 파일이 응답된다.
	}

	@RequestMapping(value = "/add3")
	//add3의 이름으로 (post)요청이 들어오면
	public String add3(AddVO addVO, Model model) {
	//AddVO 객체를 매개변수로 받습니다. 
		System.out.println("a = " + addVO.getA());
		System.out.println("b = " + addVO.getB());
		//클라이언트가 POST요청을 보낼 때 폼 데이터로 입력한 값들이 AddVO 객체에 자동으로 매핑됩니다.
		//이 파라미터들을 AddVO객체로 변환하여 매개변수에 바인딩 합니다.
		addVO.calc();
	
		model.addAttribute("result", addVO.getResult());
		model.addAttribute("addVO", addVO);
	
		return "add3";
	}
}