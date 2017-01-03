/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Chungloai;
import model.ChungLoaiModel;
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
public class ChungLoaiController {
     @RequestMapping(value = "danhsachchungloai",method = RequestMethod.GET)
    public String getallCLoai(Model m){
        ChungLoaiModel model = new ChungLoaiModel();
        m.addAttribute("Cloaichungloai",model.getAllChungLoai());
        //System.out.println("//=================="+model.getAll().size());
        return "dschungloaiad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "chungloai", method=RequestMethod.GET)
    public String redirectCreateCloai(Model m){
        m.addAttribute("chungloai", new Chungloai());
        m.addAttribute("action", "themchungloai");
        return "themchungloaiad";
    }
    
    @RequestMapping(value = "themchungloai",method = RequestMethod.POST)
    public String createCloai(@ModelAttribute(value = "chungloai") Chungloai Cloai){
        ChungLoaiModel model =new ChungLoaiModel();
        model.CreateChungLoai(Cloai);
        return "redirect:danhsachchungloai.htm";
    }
    // end insert*/
    
     // edit
    @RequestMapping(value = "chinhsuachungloai/{id}", method = RequestMethod.GET)
    public String showEditCloai(Model model, @PathVariable int id){
        ChungLoaiModel Cloai =new ChungLoaiModel();
        model.addAttribute("chungloai", Cloai.findChungLoai(id));
        model.addAttribute("action", "capnhatchungloai");
        return "chinhsuachungloaiad";
    }

    
    //update
    @RequestMapping(value = "chinhsuachungloai/capnhatchungloai",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateCloai(@ModelAttribute(value = "chungloai") Chungloai Cloai){
        ChungLoaiModel model =new ChungLoaiModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.editChungLoai(Cloai);
        return "redirect:/danhsachchungloai.htm";
    }
    
    // end edit
    
    // xóa
    @RequestMapping(value = "/xoachungloai",method = RequestMethod.GET)
    public String deleteCLoai(@RequestParam(value = "id") int id){
        ChungLoaiModel model =new ChungLoaiModel();
        Chungloai Cloai = model.findChungLoai(id);
        model.deleteChungLoai(Cloai);
        return "redirect:danhsachchungloai.htm";
    }
}
