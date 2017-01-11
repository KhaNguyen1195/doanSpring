package controller;

import entity.Sanpham;
import java.util.List;
import model.ChiTietSanPhamModel;
import model.NewHibernateUtil;
import model.SanPhamModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class ChiTietSPController {
    
    /*@RequestMapping(value = "chitietsanpham",method = RequestMethod.GET)
    public String getallChiTietSP(Model m){
        SanPhamModel model = new SanPhamModel();
        m.addAttribute("lstsanpham", model.getAllSanPham());
        return "ChiTietSanPham";
    }*/
    
    @RequestMapping(value = "chitietsanpham/{id}", method = RequestMethod.GET)
    public String getallChiTietSP(Model m, @PathVariable int id){
        ChiTietSanPhamModel model = new ChiTietSanPhamModel();
        m.addAttribute("sp", model.chitietSanPham(id));
        return "ChiTietSanPham";
    }
    
    
    
}
