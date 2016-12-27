/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Khachhang;
import model.KhachHangModel;
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
public class KhachHangController {
    @RequestMapping(value = "/danhsachkhachhang",method = RequestMethod.GET)
    public String getallKH(Model m){
        KhachHangModel model = new KhachHangModel();
        m.addAttribute("lstkhachhang",model.getAllKhachHang());
        System.out.println("//=================="+model.getAllKhachHang().size());
        return "dskhachhangad";
    }
    
    // edit
    @RequestMapping(value = "/chinhsuakhachhang/{id}", method = RequestMethod.GET)
    public String showEditKH(Model m, @PathVariable int id){
        KhachHangModel kh =new KhachHangModel();
        m.addAttribute("khachhang", kh.findKhachHang(id));
        m.addAttribute("action", "capnhatkhachhang");
//        System.out.println("--------"+ts.findOne(id).toString());
//        System.out.println("//============"+ts.findOne(id).toString());
        //setLoaiTrangSucDropDownList(m);
        return "khachhangad";
    }

    //update
    @RequestMapping(value = "chinhsuakhachhang/capnhatkhachhang",method = RequestMethod.POST)
    public String updateKH(@ModelAttribute(value = "khachhang") Khachhang kh){
        KhachHangModel model =new KhachHangModel();
        model.editKhachHang(kh);
        return "redirect:/danhsachkhachhang.htm";
    }
    
    // end edit
}
