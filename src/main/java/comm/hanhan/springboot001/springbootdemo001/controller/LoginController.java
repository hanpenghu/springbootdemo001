package comm.hanhan.springboot001.springbootdemo001.controller;

import com.alibaba.fastjson.JSON;
import comm.hanhan.springboot001.springbootdemo001.dto.Demo;
import comm.hanhan.springboot001.springbootdemo001.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
@CrossOrigin//前后分离,跨域调用的注解
@RestController//注意:在springboot中是接口就用RestController,如果要返回页面就用Controller
public class LoginController {

    @Autowired
    private transient DemoService demoService;


    @RequestMapping(value="/login",method= RequestMethod.POST)
    //上面注解加了produces ={"text/html;charset=UTF-8"}下面就无法使用HttpServletRequest了
    public String loginToRegisterSession(HttpServletRequest request, HttpServletResponse response){//
//        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
//        response.setHeader("Access-Control-Allow-Origin", "*");
      /*  response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers",
                "origin, content-type, accept, x-requested-with, sid, mycustom, smuser");*/
      /*  HttpSession session = request.getSession();
        session.setAttribute("username","韩寒");
        session.setMaxInactiveInterval(10*60);//设置session失效时间为10分钟
        System.out.println("session注册完成！！");*/
        List<Demo> demo = demoService.getDemo();
        String s = JSON.toJSONString(demo);
        System.out.println(s);
        return s;
    }
}
