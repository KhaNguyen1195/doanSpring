
package controller;

import entity.Loaitrangsuc;
import model.LoaiTrangSucModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class LoaiTrangSucController {
    
    @RequestMapping(value = "/danhsachloaitrangsuc",method = RequestMethod.GET)
    public String getall(Model m){
        LoaiTrangSucModel model = new LoaiTrangSucModel();
        m.addAttribute("lstloaitrangsuc",model.getAll());
        //System.out.println("//=================="+model.getAll().size());
        return "dsloaitrangsuc";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/loaitrangsuc", method=RequestMethod.GET)
    public String redirectCreate(Model m){
        m.addAttribute("loaitrangsuc", new Loaitrangsuc());
        m.addAttribute("action", "create");
        return "loaitrangsuc";
    }
    
    @RequestMapping(value = "create",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String create(@ModelAttribute(value = "loaitrangsuc") Loaitrangsuc lts){
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        model.Create(lts);
        return "redirect:danhsachloaitrangsuc.htm";
    }
    // end insert*/
    
    // edit
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEdit(Model model, @PathVariable int id){
        LoaiTrangSucModel lts =new LoaiTrangSucModel();
        System.out.println("----------------id)"+id);
        model.addAttribute("loaitrangsuc", lts.findOne(id));
        System.out.println("//============"+lts.findOne(id).toString());
        model.addAttribute("action", "update");
        return "loaitrangsuc";
    }

    
    //update
    @RequestMapping(value = "edit/update",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String update(@ModelAttribute(value = "loaitrangsuc") Loaitrangsuc lts){
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.edit(lts);
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
