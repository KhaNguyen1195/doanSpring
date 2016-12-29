/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Mauda;
import model.MauDaModel;
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
public class MauDaController {
    @RequestMapping(value = "/danhsachmauda",method = RequestMethod.GET)
    public String getallMD(Model m){
        MauDaModel model = new MauDaModel();
        m.addAttribute("lstmauda",model.getAllMauDa());
        System.out.println("//=================="+model.getAllMauDa().size());
        return "dsmaudaad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/mauda", method=RequestMethod.GET)
    public String redirectCreateTS(Model m){
        m.addAttribute("mauda", new Mauda());
        m.addAttribute("action", "themmauda");
        return "maudaad";
    }
    
    @RequestMapping(value = "themmauda",method = RequestMethod.POST)
    public String createTS(@ModelAttribute(value = "mauda") Mauda md){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        MauDaModel model =new MauDaModel();
        model.createMauDa(md);
        return "redirect:danhsachmauda.htm";
    }
    // end insert
    
    // edit
    @RequestMapping(value = "chinhsuamauda/{id}", method = RequestMethod.GET)
    public String showEditMD(Model m, @PathVariable int id){
        MauDaModel md =new MauDaModel();
        m.addAttribute("mauda", md.findMauDa(id));
        m.addAttribute("action", "capnhatmauda");
//        System.out.println("--------"+ts.findOne(id).toString());
//        System.out.println("//============"+ts.findOne(id).toString());
        return "chinhsuamaudaad";
    }

    
    //update
    @RequestMapping(value = "chinhsuamauda/capnhatmauda",method = RequestMethod.POST)
    public String updateMD(@ModelAttribute(value = "mauda") Mauda md){
        MauDaModel model =new MauDaModel();
        model.editMauDa(md);
        return "redirect:/danhsachmauda.htm";
    }
}
