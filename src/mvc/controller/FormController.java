package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.event.MouseListener;

@Controller
public class FormController {

    @RequestMapping("/form")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView mav = new ModelAndView("form");
        return mav;
    }

    @RequestMapping("/param1")
    public ModelAndView getParam(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        System.out.println("/param1 httpServletRequest.getParameter");

        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return null;
    }

    @RequestMapping("/param2")
    public ModelAndView getParam(@RequestParam(required = true, name = "username", defaultValue = "unknown") String username, @RequestParam(name = "password", defaultValue = "unknown") String password) {
        System.out.println("/param2 requestParam");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return null;
    }

    @RequestMapping("/param3")
    public ModelAndView getParam(User user) {
        System.out.println("/param3 with pojo");
        System.out.println("username:" + user.getUsername());
        System.out.println("password:" + user.getPassword());
        return null;
    }
}
