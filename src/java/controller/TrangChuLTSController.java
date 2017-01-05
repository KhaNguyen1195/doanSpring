package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class TrangChuLTSController {
    
    @RequestMapping(value = "sanphamloaitrangsuc",method = RequestMethod.GET)
    public String getallTrangChuLTS(Model m){
        /*SanPhamModel model = new SanPhamModel();
        m.addAttribute("lstsanpham",model.getAllSanPham());
        System.out.println("//=================="+model.getAllSanPham().size());*/
        return "TrangChuLTS";
    }
    
}
