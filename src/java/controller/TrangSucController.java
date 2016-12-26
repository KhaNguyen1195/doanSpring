
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
    public String getalLTS(Model m){
        TrangSucModel model = new TrangSucModel();
        m.addAttribute("lsttrangsuc",model.getAllTrangSuc());
        System.out.println("//=================="+model.getAllTrangSuc().size());
        return "dstrangsucad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "/trangsuc", method=RequestMethod.GET)
    public String redirectCreateTS(Model m){
        m.addAttribute("trangsuc", new Trangsuc());
        m.addAttribute("action", "themtrangsuc");
        setLoaiTrangSucDropDownList(m);
        return "trangsucad";
    }
    
    @RequestMapping(value = "themtrangsuc",method = RequestMethod.POST)
    public String createTS(@ModelAttribute(value = "trangsuc") Trangsuc ts){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        TrangSucModel model =new TrangSucModel();
        model.createTrangSuc(ts);
        return "redirect:danhsachtrangsuc.htm";
    }
    // end insert

    private void setLoaiTrangSucDropDownList(Model model) {
        LoaiTrangSucModel lstloaitrangsuc = new LoaiTrangSucModel();
        List<Loaitrangsuc> ltsList=lstloaitrangsuc.getAllLoaiTrangSuc();
        if(!ltsList.isEmpty()){
            HashMap<Integer, String> ltsMap=new HashMap<Integer, String>();
            for(Loaitrangsuc loaitrangsucEntity : ltsList){
                ltsMap.put(loaitrangsucEntity.getId(), loaitrangsucEntity.getTen());
            }
            model.addAttribute("loaitrangsucList", ltsMap);
        }
    }
    
    // edit
    @RequestMapping(value = "/chinhsuatrangsuc/{id}", method = RequestMethod.GET)
    public String showEditTS(Model m, @PathVariable int id){
        TrangSucModel ts =new TrangSucModel();
        m.addAttribute("trangsuc", ts.findTrangSuc(id));
        m.addAttribute("action", "capnhattrangsuc");
//        System.out.println("--------"+ts.findOne(id).toString());
//        System.out.println("//============"+ts.findOne(id).toString());
        setLoaiTrangSucDropDownList(m);
        return "trangsucad";
    }

    
    //update
    @RequestMapping(value = "chinhsuatrangsuc/capnhattrangsuc",method = RequestMethod.POST)
    public String updateTS(@ModelAttribute(value = "trangsuc") Trangsuc ts){
        TrangSucModel model =new TrangSucModel();
        model.editTrangSuc(ts);
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
