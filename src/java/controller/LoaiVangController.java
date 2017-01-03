/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import entity.Loaivang;
import model.LoaiVangModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author asus
 */
@Controller
@RequestMapping(value = "/")
public class LoaiVangController {
      @RequestMapping(value = "/danhsachloaivang",method = RequestMethod.GET)
    public String getallLV(Model m){
        LoaiVangModel model = new LoaiVangModel();
        m.addAttribute("lstloaivang",model.getAllLoaiVang());
        //System.out.println("//=================="+model.getAll().size());
        return "dsloaivangad";
    }
    
    
     // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/loaivang", method=RequestMethod.GET)
    public String redirectCreateLV(Model m){
        m.addAttribute("loaivang", new Loaivang());
        m.addAttribute("action", "themloaivang");
        return "themloaivangad";
    }
    
    @RequestMapping(value = "themloaivang",method = RequestMethod.POST)
    public String createLV(@ModelAttribute(value = "loaitrangsuc") Loaivang lv){
        LoaiVangModel model =new LoaiVangModel();
        model.CreateLoaiVang(lv);
        return "redirect:danhsachloaivang.htm";
    }
    // end insert*/
    
    // edit
    @RequestMapping(value = "/chinhsualoaivang/{id}", method = RequestMethod.GET)
    public String showEditLV(Model model, @PathVariable int id){
        LoaiVangModel lts =new LoaiVangModel();
        model.addAttribute("loaivang", lts.findLoaiVang(id));
        model.addAttribute("action", "capnhatloaivang");
        return "chinhsualoaivangad";
    }

    
    //update
    @RequestMapping(value = "chinhsualoaivang/capnhatloaivang",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateLV(@ModelAttribute(value = "loaitrangsuc") Loaivang lv){
        LoaiVangModel model =new LoaiVangModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.editLoaiVang(lv);
        return "redirect:/danhsachloaivang.htm";
    }
    
    // end edit
    
    // xóa
    @RequestMapping(value = "/xoaloaivang",method = RequestMethod.GET)
    public String deleteLV(@RequestParam(value = "id") int id){
        LoaiVangModel model =new LoaiVangModel();
        Loaivang lv = model.findLoaiVang(id);
        model.deleteLoaiVang(lv);
        return "redirect:danhsachloaivang.htm";
    }
}
