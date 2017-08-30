package per.zhou.springboot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorldController {
	private static final String template = "Hello,%s!";
	private final AtomicLong counter = new AtomicLong();
	@RequestMapping("/hello-world")
	public @ResponseBody Greeting sayHello(@RequestParam(value="name",required=false,defaultValue="Stranger")String name){
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}

}
