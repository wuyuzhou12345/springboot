package per.zhou.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//将resource文件夹下的application.yml中的age注入到此处的变量中
	
	@Autowired
	private Person person;
	
	@RequestMapping("/")
	public String index(){
		return "The average age is " + person.getAge() + ", person.province=" + person.getProvince();
	}
}
