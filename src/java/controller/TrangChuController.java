package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class TrangChuController {
    @RequestMapping(value = "/trangchu", method = RequestMethod.GET)
    public String getallTrangChu(Model m) {
        //ChatLieuModel model = new ChatLieuModel();
        //m.addAttribute("lstchatlieu", model.getAllChatLieu());
        //System.out.println("//=================="+model.getAll().size());
        return "TrangChu";
    }
}
