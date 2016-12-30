/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Nhanvien;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import model.NhanVienModel;
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
        return "themnhanvienad";
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
    public String updateNV(@ModelAttribute(value = "nhanvien") Nhanvien nv){
        NhanVienModel model =new NhanVienModel();
        model.editNhanVien(nv);
        return "redirect:/danhsachnhanvien.htm";
    }
    
    // remove
    @RequestMapping(value = "/xoanhanvien", method = RequestMethod.GET)
    public String removeNV(@RequestParam(value = "id") int id)
    {
        NhanVienModel model = new NhanVienModel();
        Nhanvien nv = model.findNhanVien(id);
        model.removeNhanVien(nv);
        return "redirect:danhsachnhanvien.htm";
    }
    
    //giới tính
    protected Map referenceData(HttpServletRequest request) throws Exception {

		Map referenceData = new HashMap();

		Map<String,String> gioitinh = new LinkedHashMap<String,String>();
		gioitinh.put("Nu", "Nữ");
		gioitinh.put("Nam", "Nam");
		referenceData.put("gioitinhList", gioitinh);

		return referenceData;
	}
}
