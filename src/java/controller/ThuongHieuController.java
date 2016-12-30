
package controller;

import entity.Thuonghieu;
import model.ThuongHieuModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class ThuongHieuController {
    
    @RequestMapping(value = "danhsachthuonghieu",method = RequestMethod.GET)
    public String getallTH(Model m){
        ThuongHieuModel model = new ThuongHieuModel();
        m.addAttribute("lstthuonghieu",model.getAllThuongHieu());
        return "dsthuonghieuad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "thuonghieu", method=RequestMethod.GET)
    public String redirectCreateLTH(Model m){
        m.addAttribute("thuonghieu", new Thuonghieu());
        m.addAttribute("action", "themthuonghieu");
        return "themthuonghieuad";
    }
    
    @RequestMapping(value = "themthuonghieu",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String createTH(@ModelAttribute(value = "thuonghieu") Thuonghieu th){
        ThuongHieuModel model =new ThuongHieuModel();
        model.CreateThuongHieu(th);
        return "redirect:danhsachthuonghieu.htm";
    }
    // end insert
    
    // edit
    @RequestMapping(value = "chinhsuathuonghieu/{id}", method = RequestMethod.GET)
    public String showEditTH(Model model, @PathVariable int id){
        ThuongHieuModel th =new ThuongHieuModel();
        model.addAttribute("thuonghieu", th.findThuongHieu(id));
        model.addAttribute("action", "capnhatthuonghieu");
        return "chinhsuathuonghieuad";
    }

    
    //update
    @RequestMapping(value = "chinhsuathuonghieu/capnhatthuonghieu",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateTH(@ModelAttribute(value = "thuonghieu") Thuonghieu th){
        ThuongHieuModel model =new ThuongHieuModel();
        model.editThuongHieu(th);
        return "redirect:/danhsachthuonghieu.htm";
    }
    
    // end edit
    
    // xóa
    @RequestMapping(value = "/xoathuonghieu",method = RequestMethod.GET)
    public String deleteTH(@RequestParam(value = "id") int id){
        ThuongHieuModel model =new ThuongHieuModel();
        Thuonghieu th = model.findThuongHieu(id);
        model.deleteThuongHieu(th);
        return "redirect:danhsachthuonghieu.htm";
    }
    
 
}
