package controller;

import model.ChiTietSanPhamModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class ChiTietSPController {
    
    @RequestMapping(value = "chitietsanpham/{id}", method = RequestMethod.GET)
    public String getallChiTietSP(Model m, @PathVariable int id){
        ChiTietSanPhamModel model = new ChiTietSanPhamModel();
        m.addAttribute("sp", model.chitietSanPham(id));
        return "ChiTietSanPham";
    }
    
    
    
}
