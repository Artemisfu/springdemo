package mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//public class HelloController implements Controller {
//    @Override
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        //这里表示视图的是index.jsp
//        //模型数据的是 message，内容是 “Hello Spring MVC”
//        ModelAndView mav = new ModelAndView("web/index.jsp");
//        mav.addObject("message", "Hello Spring MVC");
//        return mav;
//    }
//}


@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView handleReqggetuest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        //这里表示视图的是index.jsp
        //模型数据的是 message，内容是 “Hello Spring MVC”
        ModelAndView mav = new ModelAndView("internalIndex");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}
