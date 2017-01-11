package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class LoginController {
    @RequestMapping(value = "quantri",method = RequestMethod.GET)
    public String getallLTS(Model m){
        return "index";
    }
    @RequestMapping(value = "dangnhap",method = RequestMethod.GET)
    public String TestLogin(Model m){
        return "login";
    }
     @RequestMapping(value = "doimatkhau",method = RequestMethod.GET)
    public String TestMK(Model m){
        return "doimatkhau";
    }
}
