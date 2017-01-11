
package controller;

import entity.Loaitrangsuc;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.LoaiTrangSucModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping(value = "/")
public class LoaiTrangSucController {
    
    @RequestMapping(value = "danhsachloaitrangsuc",method = RequestMethod.GET)
    public String getallLTS(Model m){
        LoaiTrangSucModel model = new LoaiTrangSucModel();
        m.addAttribute("lstloaitrangsuc",model.getAllLoaiTrangSuc());
        //System.out.println("//=================="+model.getAll().size());
        return "dsloaitrangsucad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "loaitrangsuc", method=RequestMethod.GET)
    public String redirectCreateLTS(Model m){
        m.addAttribute("loaitrangsuc", new Loaitrangsuc());
        m.addAttribute("action", "themloaitrangsuc");
        return "themloaitrangsucad";
    }
    
    @RequestMapping(value = "themloaitrangsuc",method = RequestMethod.POST)
    public String createLTS(@ModelAttribute(value = "loaitrangsuc") Loaitrangsuc lts){
        //System.out.println("====>"+ts.getId()+"-"+ts.getTen());
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        model.CreateLoaiTrangSuc(lts);
        return "redirect:danhsachloaitrangsuc.htm";
    }
    
    /*@RequestMapping(value = "themloaitrangsuc", method = RequestMethod.POST)
    public String createLTS(HttpServletRequest request, @RequestParam CommonsMultipartFile imgUrl, HttpSession session) {
        String path = session.getServletContext().getRealPath("/");
        System.out.println("//===path==" + path);
        String image = imgUrl.getOriginalFilename();
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        try {
            Loaitrangsuc lts = new Loaitrangsuc();
            
            //System.out.println("//===============1================");
            
            lts.setMa(request.getParameter("ma"));
            System.out.println("//===============ma================"+lts.getMa());
            lts.setTen(request.getParameter("ten"));
            System.out.println("//===============ten================"+lts.getTen());
            //System.out.println("//===============gia================" + sp.getGiaban());
            byte barrimg[] = imgUrl.getBytes();
            BufferedOutputStream bout = new BufferedOutputStream(
                    new FileOutputStream(path + "/libs/img" + image));
            System.out.println("//===filename==" + image);
            bout.write(barrimg);
            
            lts.setImgUrl(image + "");
            lts.setMota(request.getParameter("mota"));
            
            System.out.println("demo" + lts.toString());
            model.CreateLoaiTrangSuc(lts);
            bout.flush();
            bout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:danhsachloaitrangsuc.htm";
    }*/
    // end insert
    
    // edit
    /*@RequestMapping(value = "chinhsualoaitrangsuc/{id}", method = RequestMethod.GET)
    public String showEditLTS(Model model, @PathVariable int id){
        LoaiTrangSucModel lts =new LoaiTrangSucModel();
        model.addAttribute("loaitrangsuc", lts.findLoaiTrangSuc(id));
        //System.out.println("//============"+lts.findLoaiTrangSuc(id).toString());
        model.addAttribute("action", "capnhatloaitrangsuc");
        return "chinhsualoaitrangsucad";
    }

    
    //update
    @RequestMapping(value = "chinhsualoaitrangsuc/capnhatloaitrangsuc",method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateLTS(@ModelAttribute(value = "loaitrangsuc") Loaitrangsuc lts){
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        //System.out.println("loaitrangsuc"+lts.toString());
        model.editLoaiTrangSuc(lts);
        return "redirect:/danhsachloaitrangsuc.htm";
    }*/
    
    // end edit
    
    // xóa
    @RequestMapping(value = "/xoaloaitrangsuc",method = RequestMethod.GET)
    public String deleteLTS(@RequestParam(value = "id") int id){
        LoaiTrangSucModel model =new LoaiTrangSucModel();
        Loaitrangsuc lts = model.findLoaiTrangSuc(id);
        model.deleteLoaiTrangSuc(lts);
        return "redirect:danhsachloaitrangsuc.htm";
    }
}
