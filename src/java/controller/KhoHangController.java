/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Khohang;
import entity.Sanpham;
import java.util.HashMap;
import java.util.List;
import model.KhoHangModel;
import model.SanPhamModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/")
public class KhoHangController {
    @RequestMapping(value = "danhsachkhohang",method = RequestMethod.GET)
    public String getalLTS(Model m){
        KhoHangModel model = new KhoHangModel();
        m.addAttribute("lstkhohang",model.getAllKhoHang());
        System.out.println("//=================="+model.getAllKhoHang().size());
        return "dskhohangad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "khohang", method=RequestMethod.GET)
    public String redirectCreateKH(Model m){
        m.addAttribute("khohang", new Khohang());
        m.addAttribute("action", "themkhohang");
        //setSanPhamDropDownList(m);
        return "themkhohangad";
    }
    
    @RequestMapping(value = "themkhohang",method = RequestMethod.POST)
    public String createKH(@ModelAttribute(value = "khohang") Khohang khg){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        KhoHangModel model =new KhoHangModel();
        model.createKhoHang(khg);
        return "redirect:danhsachkhohang.htm";
    }
    // end insert

   /* private void setSanPhamDropDownList(Model model) {
        SanPhamModel lstsanpham = new SanPhamModel();
        List<Sanpham> ltsList=lstsanpham.getAllSanPham();
        if(!ltsList.isEmpty()){
            HashMap<Integer, String> ltsMap=new HashMap<Integer, String>();
            for(Sanpham sanphamEntity : ltsList){
                ltsMap.put(sanphamEntity.getId(), sanphamEntity.getTen());
            }
            model.addAttribute("sanphamList", ltsMap);
        }
    }*/
}
