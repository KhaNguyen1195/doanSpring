package controller;

import model.LoaiTrangSucModel;
import model.TrangSucModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class TrangChuLTSController {
    
    @RequestMapping(value = "sanphamloaitrangsuc",method = RequestMethod.GET)
    public String getallTrangChuLTS(Model m){
        TrangSucModel model = new TrangSucModel();
        m.addAttribute("lsttrangsuc",model.getAllTrangSuc());
        return "TrangChuLTS";
    }
    
}
