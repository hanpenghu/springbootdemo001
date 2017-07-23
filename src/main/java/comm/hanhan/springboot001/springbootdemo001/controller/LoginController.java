package comm.hanhan.springboot001.springbootdemo001.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController//注意:在springboot中是接口就用RestController,如果要返回页面就用Controller
public class LoginController {
    @RequestMapping(value="/login",method= RequestMethod.GET)
    //上面注解加了produces ={"text/html;charset=UTF-8"}下面就无法使用HttpServletRequest了
    public String loginToRegisterSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("username","韩寒");
        session.setMaxInactiveInterval(10*60);//设置session失效时间为10分钟
        return "session注册完成";
    }
}
