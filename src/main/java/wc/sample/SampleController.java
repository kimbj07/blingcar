package wc.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	private Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		logger.debug("LOGGING TEST!");
		model.addAttribute("name", name);
		return "helloworld";
	}
}
