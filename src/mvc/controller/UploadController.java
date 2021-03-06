package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UploadController {
    @RequestMapping("/upload")
    public void upload(@RequestParam("picture") MultipartFile picture) throws Exception {
        System.out.println("Your filename is : '" + picture.getOriginalFilename() + "'");
    }

    @RequestMapping("/test_upload")
    public ModelAndView upload() {
        return new ModelAndView("redirect: /upload");
    }
}
