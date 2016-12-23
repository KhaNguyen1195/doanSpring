
package controller;

import entity.Loaitrangsuc;
import entity.Trangsuc;
import java.util.HashMap;
import java.util.List;
import model.LoaiTrangSucModel;
import model.TrangSucModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class TrangSucController {
    
    @RequestMapping(value = "/danhsachtrangsuc",method = RequestMethod.GET)
    public String getall(Model m){
        TrangSucModel model = new TrangSucModel();
        m.addAttribute("lst",model.getAll());
        System.out.println("//=================="+model.getAll().size());
        return "dstrangsuc";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/trangsuc", method=RequestMethod.GET)
    public String redirectCreate(Model m){
        m.addAttribute("trangsuc", new Trangsuc());
        m.addAttribute("action", "create");
        setLoaiTrangSucDropDownList(m);
        return "trangsuc";
    }
    
    @RequestMapping(value = "create",method = RequestMethod.POST)
    public String create(@ModelAttribute(value = "trangsuc") Trangsuc u){
        System.out.println("====>"+u.getId()+"-"+u.getTen());
        TrangSucModel model =new TrangSucModel();
        model.Create(u);
        return "redirect:danhsachtrangsuc.htm";
    }
    // end insert

    private void setLoaiTrangSucDropDownList(Model model) {
        LoaiTrangSucModel lstloaitrangsuc = new LoaiTrangSucModel();
        List<Loaitrangsuc> ltsList=lstloaitrangsuc.getAll();
        if(!ltsList.isEmpty()){
            HashMap<Integer, String> ltsMap=new HashMap<Integer, String>();
            for(Loaitrangsuc loaitrangsucEntity : ltsList){
                ltsMap.put(loaitrangsucEntity.getId(), loaitrangsucEntity.getTen());
            }
            model.addAttribute("loaitrangsucList", ltsMap);
        }
    }
    
    // edit
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEdit(Model model, @PathVariable int id){
        TrangSucModel ts =new TrangSucModel();
        System.out.println("----------------id)"+id);
        model.addAttribute("trangsuc", ts.findOne(id));
        model.addAttribute("action", "update");
        setLoaiTrangSucDropDownList(model);
        return "trangsuc";
    }

    
    //update
    @RequestMapping(value = "edit/update",method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "trangsuc") Trangsuc ts){
        TrangSucModel model =new TrangSucModel();
        model.edit(ts);
        return "redirect:/danhsachtrangsuc.htm";
    }
    
    // end edit
    
    // xóa
   /* @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id") int id){
        TrangSucModel model =new TrangSucModel();
        Trangsuc ts=model.findOne(id);
        model.delete(ts);
        return "redirect:all.htm";
    }*/
}
