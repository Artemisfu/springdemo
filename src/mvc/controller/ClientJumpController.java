package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ClientJumpController {

    @RequestMapping("/index")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }

    @RequestMapping("/jump1")
    public String handleJump3(Model model) {
        model.addAttribute("message", "from jump1");
        return "redirect: ./index";
    }

    @RequestMapping("/jump2")
    public ModelAndView handleJump2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView mav = new ModelAndView("redirect: /index");
        mav.addObject("message", "from jump2");
        return mav;
    }


}
