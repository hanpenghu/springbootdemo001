package comm.hanhan.springboot001.springbootdemo001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
@Controller用于普通的转发页面等,  如果要返回json 请用RestController
* */
@Controller
public class ThemleafController {

    @RequestMapping(value = "/html", method = RequestMethod.GET)
    public String html(){


        return  "001index";
    }

}
