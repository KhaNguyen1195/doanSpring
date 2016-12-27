
package controller;

import entity.Thuonghieu;
import model.ThuongHieuModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class ThuongHieuController {
    
    @RequestMapping(value = "/danhsachthuonghieu",method = RequestMethod.GET)
    public String getallTH(Model m){
        ThuongHieuModel model = new ThuongHieuModel();
        m.addAttribute("lstthuonghieu",model.getAllThuongHieu());
        //System.out.println("//=================="+model.getAll().size());
        return "dsthuonghieuad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/thuonghieu", method=RequestMethod.GET)
    public String redirectCreateLTH(Model m){
        m.addAttribute("thuonghieu", new Thuonghieu());
        m.addAttribute("action", "themthuonghieu");
        return "thuonghieuad";
    }
    
    @RequestMapping(value = "themthuonghieu",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String createTH(@ModelAttribute(value = "thuonghieu") Thuonghieu th){
        ThuongHieuModel model =new ThuongHieuModel();
        model.CreateThuongHieu(th);
        return "redirect:danhsachthuonghieu.htm";
    }
    // end insert
    
    // edit
    @RequestMapping(value = "/chinhsuathuonghieu/{id}", method = RequestMethod.GET)
    public String showEditTH(Model model, @PathVariable int id){
        ThuongHieuModel th =new ThuongHieuModel();
        System.out.println("----------------id)"+id);
        model.addAttribute("thuonghieu", th.findThuongHieu(id));
        System.out.println("//============"+th.findThuongHieu(id).toString());
        model.addAttribute("action", "capnhatthuonghieu");
        return "thuonghieuad";
    }

    
    //update
    @RequestMapping(value = "chinhsuathuonghieu/capnhatthuonghieu",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateTH(@ModelAttribute(value = "thuonghieu") Thuonghieu th){
        ThuongHieuModel model =new ThuongHieuModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.editThuongHieu(th);
        return "redirect:/danhsachthuonghieu.htm";
    }
    
    // end edit
    
    // xóa
    /*@RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id") int id){
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        Loaitrangsuc lts = model.findOne(id);
        model.delete(lts);
        return "redirect:danhsachloaitrangsuc.htm";
    }*/
    
 
}
