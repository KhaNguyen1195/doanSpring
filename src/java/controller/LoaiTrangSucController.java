
package controller;

import entity.Loaitrangsuc;
import model.LoaiTrangSucModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/")
public class LoaiTrangSucController {
    
    @RequestMapping(value = "/danhsachloaitrangsuc",method = RequestMethod.GET)
    public String getallLTS(Model m){
        LoaiTrangSucModel model = new LoaiTrangSucModel();
        m.addAttribute("lstloaitrangsuc",model.getAllLoaiTrangSuc());
        //System.out.println("//=================="+model.getAll().size());
        return "dsloaitrangsucad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/loaitrangsuc", method=RequestMethod.GET)
    public String redirectCreateLTS(Model m){
        m.addAttribute("loaitrangsuc", new Loaitrangsuc());
        m.addAttribute("action", "themloaitrangsuc");
        return "loaitrangsucad";
    }
    
    @RequestMapping(value = "themloaitrangsuc",method = RequestMethod.POST)
    public String createLTS(@ModelAttribute(value = "loaitrangsuc") Loaitrangsuc lts){
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        model.CreateLoaiTrangSuc(lts);
        return "redirect:danhsachloaitrangsuc.htm";
    }
    // end insert*/
    
    // edit
    @RequestMapping(value = "/chinhsualoaitrangsuc/{id}", method = RequestMethod.GET)
    public String showEditLTS(Model model, @PathVariable int id){
        LoaiTrangSucModel lts =new LoaiTrangSucModel();
        System.out.println("----------------id)"+id);
        model.addAttribute("loaitrangsuc", lts.findLoaiTrangSuc(id));
        System.out.println("//============"+lts.findLoaiTrangSuc(id).toString());
        model.addAttribute("action", "capnhatloaitrangsuc");
        return "loaitrangsucad";
    }

    
    //update
    @RequestMapping(value = "chinhsualoaitrangsuc/capnhatloaitrangsuc",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateLTS(@ModelAttribute(value = "loaitrangsuc") Loaitrangsuc lts){
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.editLoaiTrangSuc(lts);
        return "redirect:/danhsachloaitrangsuc.htm";
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
