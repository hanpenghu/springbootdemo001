package comm.hanhan.springboot001.springbootdemo001.controller;

import com.alibaba.fastjson.JSON;
import comm.hanhan.springboot001.springbootdemo001.dto.Demo;
import comm.hanhan.springboot001.springbootdemo001.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 @Controller用于普通的转发页面等,  如果要返回json 请用RestController
  * */
@RestController
public class RestController01 {

    @Autowired
    private transient DemoService demoService;

    @RequestMapping(value = "demo", method = RequestMethod.GET,produces ={"text/html;charset=UTF-8"})
    public String getDemo(){
        List<Demo> demo = demoService.getDemo();
        String s = JSON.toJSONString(demo);
        System.out.println(s);
        return s;
    }



}