/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Loaida;
import model.LoaiDaModel;
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
public class LoaiDaController {
    @RequestMapping(value = "danhsachloaida",method = RequestMethod.GET)
    public String getallLD(Model m){
        LoaiDaModel model = new LoaiDaModel();
        m.addAttribute("lstloaida",model.getAllLoaiDa());
        //System.out.println("//=================="+model.getAll().size());
        return "dsloaidaad";
    }
    
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "loaida", method=RequestMethod.GET)
    public String redirectCreateLD(Model m){
        m.addAttribute("loaida", new Loaida());
        m.addAttribute("action", "themloaida");
        return "themloaidaad";
    }
    
    @RequestMapping(value = "themloaida",method = RequestMethod.POST)
    public String createLD(@ModelAttribute(value = "loaida") Loaida ld){
        LoaiDaModel model =new LoaiDaModel();
        model.CreateLoaiDa(ld);
        return "redirect:danhsachloaida.htm";
    }
    // end insert*/
    
    // edit
    @RequestMapping(value = "chinhsualoaida/{id}", method = RequestMethod.GET)
    public String showEditLD(Model model, @PathVariable int id){
        LoaiDaModel ld =new LoaiDaModel();
        model.addAttribute("loaida", ld.findLoaiDa(id));
        //System.out.println("//============"+lts.findLoaiTrangSuc(id).toString());
        model.addAttribute("action", "capnhatloaida");
        return "chinhsualoaidaad";
    }

    
    //update
    @RequestMapping(value = "chinhsualoaida/capnhatloaida",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateLD(@ModelAttribute(value = "loaida") Loaida ld){
        LoaiDaModel model =new LoaiDaModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.editLoaiDa(ld);
        return "redirect:/danhsachloaida.htm";
    }
    
    // end edit
    
    // xóa
    @RequestMapping(value = "/xoaloaida",method = RequestMethod.GET)
    public String deleteLD(@RequestParam(value = "id") int id){
        LoaiDaModel model =new LoaiDaModel();
        Loaida ld = model.findLoaiDa(id);
        model.deleteLoaiDa(ld);
        return "redirect:danhsachloaida.htm";
    }
}
