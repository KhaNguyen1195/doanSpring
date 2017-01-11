package controller;

import model.LoaiTrangSucModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class TrangChuController {
    @RequestMapping(value = "/trangchu", method = RequestMethod.GET)
    public String getallTrangChu(Model m) {
        LoaiTrangSucModel model = new LoaiTrangSucModel();
        m.addAttribute("lstloaitrangsuc",model.getAllLoaiTrangSuc());
        return "TrangChu";
    }
}
