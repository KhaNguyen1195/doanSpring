package controller;

import entity.Nhanvien;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginADModel;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class LoginAD {
     @RequestMapping(value = "loginAdmin", method = RequestMethod.POST)
    public String loginAdmin(@RequestParam(value = "tendangnhap") String Tendangnhap,@RequestParam(value = "matkhau") String matKhau,HttpServletRequest request, HttpServletResponse response) {
        LoginADModel login=new LoginADModel();
         for (Nhanvien u : login.getALL()) {
            if (u.getTendangnhap().equals(Tendangnhap) && u.getMatkhau().equals(matKhau)) {
                System.out.println("==========="+u.getTendangnhap());
                System.out.println("==========="+u.getMatkhau());
                
                    HttpSession session = request.getSession();
                    session.setAttribute("user", u.getTendangnhap());
                    session.setAttribute("idAdmin", u.getId());
                  return "redirect:quantri.htm";
            }
        }
        return "redirect:dangnhap.htm?loi=1";
    }

    
    @RequestMapping(value = "dangXuatAdmin", method = RequestMethod.GET)
    public String dangXuatAdmin(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "redirect:dangnhap.htm";
    }
    
     @RequestMapping(value = "doimatkhau1", method = RequestMethod.GET)
    public String doimatkhau(HttpServletRequest request, HttpServletResponse response){
        //HttpSession session = request.getSession();
        //session.removeAttribute("user");
        return "redirect:admin.htm";
    }
    @RequestMapping(value = "updatematkhau", method = RequestMethod.GET)
    public String updatematkhau(@ModelAttribute(value = "tk") Nhanvien u,HttpSession session) {
        int user;
        user = (int) session.getAttribute("idAdmin");
        Nhanvien tkadmin=new Nhanvien();
        LoginADModel model = new LoginADModel();
        tkadmin=findOneMatKhauUser(String.valueOf(user));
        tkadmin.setMatkhau(u.getMatkhau());
        model.edit(tkadmin);
        return "redirect:doimatkhau1.htm?ttc=1";
    }

    public Nhanvien findOneMatKhauUser(String check) {
        LoginADModel ch = new LoginADModel();
        int id = Integer.parseInt(check);
        for (Nhanvien u : ch.getMK()) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
    @RequestMapping(value = "checkmatkhauuser", method = RequestMethod.GET)
     @ResponseBody
    public String checkMatKhauUser(HttpServletRequest request, HttpServletResponse response,HttpSession session){     
        int user;
        user = (int) session.getAttribute("userIDKhachHang");
        String matkhau = request.getParameter("matkhaucu");
        int check=0;
        response.setContentType("application/json");
        Nhanvien tkadmin=new Nhanvien();
        System.out.println("========"+matkhau);
        LoginADModel em=new LoginADModel();
        tkadmin=findOneMatKhauUser(String.valueOf(user));
        System.out.println("========"+matkhau);
            if (tkadmin.getMatkhau().equals(matkhau)) {
                check=1;
                System.out.println("========"+tkadmin.getMatkhau());
                 
            }
        
        if (check==1){
            return "true";
        } else{
            return "false";
        }
    }
}
