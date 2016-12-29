/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Nhanvien;
import model.NhanVienModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/")
public class NhanVienController {
    @RequestMapping(value = "/danhsachnhanvien",method = RequestMethod.GET)
    public String getallNV(Model m){
        NhanVienModel model = new NhanVienModel();
        m.addAttribute("lstnhanvien",model.getAllNhanVien());
        System.out.println("//=================="+model.getAllNhanVien().size());
        return "dsnhanvienad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/nhanvien", method=RequestMethod.GET)
    public String redirectCreateNV(Model m){
        m.addAttribute("nhanvien", new Nhanvien());
        m.addAttribute("action", "themnhanvien");
        return "nhanvienad";
    }
    
    @RequestMapping(value = "themnhanvien",method = RequestMethod.POST)
    public String createNV(@ModelAttribute(value = "nhanvien") Nhanvien nv){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        NhanVienModel model =new NhanVienModel();
        model.createNhanVien(nv);
        return "redirect:danhsachnhanvien.htm";
    }
    // end insert
    
    // edit
    @RequestMapping(value = "chinhsuanhanvien/{id}", method = RequestMethod.GET)
    public String showEditNV(Model m, @PathVariable int id){
        NhanVienModel nv =new NhanVienModel();
        m.addAttribute("nhanvien", nv.findNhanVien(id));
        m.addAttribute("action", "capnhatnhanvien");
//        System.out.println("--------"+ts.findOne(id).toString());
//        System.out.println("//============"+ts.findOne(id).toString());
        return "chinhsuanhanvienad";
    }

    
    //update
    @RequestMapping(value = "chinhsuanhanvien/capnhatnhanvien",method = RequestMethod.POST)
    public String updateTS(@ModelAttribute(value = "nhanvien") Nhanvien nv){
        NhanVienModel model =new NhanVienModel();
        model.editNhanVien(nv);
        return "redirect:/danhsachnhanvien.htm";
    }
}
