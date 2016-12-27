/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Nhacungcap;
import model.NhaCungCapModel;
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
public class NhaCungCapController {
    @RequestMapping(value = "/danhsachnhacungcap",method = RequestMethod.GET)
    public String getallNCC(Model m){
        NhaCungCapModel model = new NhaCungCapModel();
        m.addAttribute("lstnhacungcap",model.getAllNhaCungCap());
        System.out.println("//=================="+model.getAllNhaCungCap().size());
        return "dsnhacungcapad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/nhacungcap", method=RequestMethod.GET)
    public String redirectCreateTS(Model m){
        m.addAttribute("nhacungcap", new Nhacungcap());
        m.addAttribute("action", "themnhacungcap");
        return "nhacungcapad";
    }
    
    @RequestMapping(value = "themnhacungcap",method = RequestMethod.POST)
    public String createTS(@ModelAttribute(value = "nhacungcap") Nhacungcap ncc){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        NhaCungCapModel model =new NhaCungCapModel();
        model.createNhaCungCap(ncc);
        return "redirect:danhsachnhacungcap.htm";
    }
    // end insert
}
