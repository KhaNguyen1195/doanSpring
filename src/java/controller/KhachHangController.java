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
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(value = "chinhsuakhachhang/{id}", method = RequestMethod.GET)
    public String showEditKH(Model m, @PathVariable int id){
        KhachHangModel kh =new KhachHangModel();
        m.addAttribute("khachhang", kh.findKhachHang(id));
        m.addAttribute("action", "capnhatkhachhang");
//        System.out.println("--------"+ts.findOne(id).toString());
//        System.out.println("//============"+ts.findOne(id).toString());
        return "chinhsuakhachhangad";
    }

    
    //update
    @RequestMapping(value = "chinhsuakhachhang/capnhatkhachhang",method = RequestMethod.POST)
    public String updateKH(@ModelAttribute(value = "khachhang") Khachhang kh){
        KhachHangModel model =new KhachHangModel();
        model.editKhachHang(kh);
        return "redirect:/danhsachkhachhang.htm";
    }
    
    // remove
    @RequestMapping(value = "/xoakhachhang", method = RequestMethod.GET)
    public String removeKH(@RequestParam(value = "id") int id)
    {
        KhachHangModel model = new KhachHangModel();
        Khachhang kh = model.findKhachHang(id);
        model.removeKhachHang(kh);
        return "redirect:danhsachkhachhang.htm";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "dangky", method=RequestMethod.GET)
    public String redirectCreateKH(Model m){
        m.addAttribute("khachhang", new Khachhang());
        m.addAttribute("action", "themkhachhang");
        return "DangKy";
    }
    
    @RequestMapping(value = "themkhachhang",method = RequestMethod.POST)
    public String createKH(@ModelAttribute(value = "khachhang") Khachhang kh){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        KhachHangModel model = new KhachHangModel();
        model.CreateKhachHang(kh);
        return "redirect:trangchu.htm";
    }
}
