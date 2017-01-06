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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/")
public class KhoHangController {
    @RequestMapping(value = "danhsachkhohang",method = RequestMethod.GET)
    public String getallKHG(Model m){
        KhoHangModel model = new KhoHangModel();
        m.addAttribute("lstkhohang",model.getAllKhoHang());
        System.out.println("//=================="+model.getAllKhoHang().size());
        return "dskhohangad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "khohang", method=RequestMethod.GET)
    public String redirectCreateKHG(Model m){
        m.addAttribute("khohang", new Khohang());
        m.addAttribute("action", "themkhohang");
        setKhoHangDropDownList(m);
        return "themkhohangad";
    }
    
    @RequestMapping(value = "themkhohang",method = RequestMethod.POST)
    public String createKHG(@ModelAttribute(value = "khohang") Khohang khg){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        KhoHangModel model =new KhoHangModel();
        model.createKhoHang(khg);
        return "redirect:danhsachkhohang.htm";
    }
    // end insert

    private void setKhoHangDropDownList(Model model) {
        SanPhamModel lstsanphamsp = new SanPhamModel();
        List<Sanpham> ltsList=lstsanphamsp.getAllSanPham();
        if(!ltsList.isEmpty()){
            HashMap<Integer, String> ltsMap=new HashMap<Integer, String>();
            for(Sanpham sanphamEntity : ltsList){
                ltsMap.put(sanphamEntity.getId(), sanphamEntity.getTen());
            }
            model.addAttribute("sanphamList", ltsMap);
        }
    }
    
    // edit
    @RequestMapping(value = "chinhsuakhohang/{id}", method = RequestMethod.GET)
    public String showEditKHG(Model m, @PathVariable int id){
        KhoHangModel khg =new KhoHangModel();
        m.addAttribute("khohang", khg.findKhoHang(id));
        m.addAttribute("action", "capnhatkhohang");
//        System.out.println("--------"+ts.findOne(id).toString());
//        System.out.println("//============"+ts.findOne(id).toString());
        setKhoHangDropDownList(m);
        return "chinhsuakhohangad";
    }

    
    //update
    @RequestMapping(value = "chinhsuakhohang/capnhatkhohang",method = RequestMethod.POST)
    public String updateKHG(@ModelAttribute(value = "khohang") Khohang khg){
        KhoHangModel model =new KhoHangModel();
        model.editKhoHang(khg);
        return "redirect:/danhsachkhohang.htm";
    }
    
    // end edit
    
    // xóa
    @RequestMapping(value = "/xoakhohang",method = RequestMethod.GET)
    public String deleteTS(@RequestParam(value = "id") int id){
        KhoHangModel model =new KhoHangModel();
        Khohang khg=model.findKhoHang(id);
        model.deleteKhoHang(khg);
        return "redirect:danhsachkhohang.htm";
    }
}
