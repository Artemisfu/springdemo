package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ShowValueController {
    @RequestMapping("/value1")
    public ModelAndView handleRequest1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        httpServletRequest.setAttribute("from", "handleRequest1");
        httpServletRequest.setAttribute("message", "我是Daisy");
        return new ModelAndView("showValue");
    }
    @RequestMapping("/value2")
    public ModelAndView handleRequest2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        ModelAndView mav = new ModelAndView("showValue");
        mav.addObject("from", "handleRequest2");

        mav.addObject("message", "我是Daisy");
        return mav;
    }
    @RequestMapping("/value3")
    public String handleRequest3(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        httpServletRequest.setAttribute("from", "handleRequest3");
        httpServletRequest.setAttribute("message", "我是Daisy");

        return "showValue";
    }

    @RequestMapping("/value4")
    public String handleRequest3(Model model){
        model.addAttribute("from", "handleRequest4");
        model.addAttribute("message", "我是Daisy");
        return "showValue";
    }

    //
    @ModelAttribute
    public void model(Model model) {
        model.addAttribute("message", "注解成功");
    }

    @RequestMapping("/value5")
    public String handleRequest() {
        return "showValue";
    }
}
