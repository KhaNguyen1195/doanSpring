/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Chatlieu;
import entity.Loaitrangsuc;
import model.ChatLieuModel;
import model.LoaiTrangSucModel;
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
public class ChatLieuController {
      @RequestMapping(value = "/danhsachchatlieu",method = RequestMethod.GET)
    public String getallCHL(Model m){
        ChatLieuModel model = new ChatLieuModel();
        m.addAttribute("chlchatlieu",model.getAllChatLieu());
        //System.out.println("//=================="+model.getAll().size());
        return "dschatlieuad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/chatlieu", method=RequestMethod.GET)
    public String redirectCreateCHL(Model m){
        m.addAttribute("chatlieu", new Chatlieu());
        m.addAttribute("action", "themchatlieu");
        return "themchatlieuad";
    }
    
     @RequestMapping(value = "themchatlieu",method = RequestMethod.POST)
    public String createCHL(@ModelAttribute(value = "chatlieu") Chatlieu chl){
        ChatLieuModel model =new ChatLieuModel();
        model.CreateChatLieu(chl);
        return "redirect:danhsachchatlieu.htm";
    }
    
    // end insert*/
    
    // edit
    @RequestMapping(value = "/chinhsuachatlieu/{id}", method = RequestMethod.GET)
    public String showEditCHL(Model model, @PathVariable int id){
        ChatLieuModel chl =new ChatLieuModel();
        model.addAttribute("chatlieu", chl.findChatLieu(id));
        model.addAttribute("action", "capnhatchatlieu");
        return "chinhsuachatlieuad";
    }
    
    //update
    @RequestMapping(value = "chinhsuachatlieu/capnhatchatlieu",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateCHL(@ModelAttribute(value = "chatlieu") Chatlieu chl){
        ChatLieuModel model =new ChatLieuModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.editChatLieu(chl);
        return "redirect:/danhsachchatlieu.htm";
    }
    
    // xóa
    @RequestMapping(value = "/xoachatlieu",method = RequestMethod.GET)
    public String deleteCHL(@RequestParam(value = "id") int id){
        ChatLieuModel model =new ChatLieuModel();
        Chatlieu chl = model.findChatLieu(id);
        model.deleteChatLieu(chl);
        return "redirect:danhsachchatlieu.htm";
    }
}
