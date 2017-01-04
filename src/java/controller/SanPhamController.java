
package controller;

import entity.Chatlieu;
import entity.Chungloai;
import entity.Loaida;
import entity.Loaivang;
import entity.Mauda;
import entity.Sanpham;
import entity.Thuonghieu;
import entity.Trangsuc;
import java.util.HashMap;
import java.util.List;
import model.ChatLieuModel;
import model.ChungLoaiModel;
import model.LoaiDaModel;
import model.LoaiVangModel;
import model.MauDaModel;
import model.SanPhamModel;
import model.ThuongHieuModel;
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
public class SanPhamController {
   
    @RequestMapping(value = "danhsachsanpham",method = RequestMethod.GET)
    public String getalLSP(Model m){
        SanPhamModel model = new SanPhamModel();
        m.addAttribute("lstsanpham",model.getAllSanPham());
        System.out.println("//=================="+model.getAllSanPham().size());
        return "dssanphamad";
    }
    
    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "sanpham", method=RequestMethod.GET)
    public String redirectCreateSP(Model m){
        m.addAttribute("sanpham", new Sanpham());
        m.addAttribute("action", "themsanpham");
        setTrangSucDropDownList(m);
        setThuongHieuDropDownList(m);
        setMauDaDropDownList(m);
        setChungLoaiDropDownList(m);
        setLoaiVangDropDownList(m);
        setLoaiDaDropDownList(m);
        setChatLieuDropDownList(m);
        return "themsanphamad";
    }
    
    @RequestMapping(value = "themsanpham",method = RequestMethod.POST)
    public String createSP(@ModelAttribute(value = "sanpham") Sanpham sp){
        //System.out.println("====>"+sp.getId()+"-"+sp.getTen());
        SanPhamModel model =new SanPhamModel();
        model.createSanPham(sp);
        return "redirect:danhsachsanpham.htm";
    }
    // end insert

    // combobox trang sức
    private void setTrangSucDropDownList(Model model) {
        TrangSucModel lsttrangsuc = new TrangSucModel();
        List<Trangsuc> tsList=lsttrangsuc.getAllTrangSuc();
        if(!tsList.isEmpty()){
            HashMap<Integer, String> tsMap=new HashMap<Integer, String>();
            for(Trangsuc trangsucEntity : tsList){
                tsMap.put(trangsucEntity.getId(), trangsucEntity.getTen());
            }
            model.addAttribute("trangsucList", tsMap);
        }
    }
    
    //combobox Thương Hiệu
    private void setThuongHieuDropDownList(Model model) {
        ThuongHieuModel lstthuonghieu = new ThuongHieuModel();
        List<Thuonghieu> thlList = lstthuonghieu.getAllThuongHieu();
        if(!thlList.isEmpty()){
            HashMap<Integer, String> thMap=new HashMap<Integer, String>();
            for(Thuonghieu thuonghieuEntity : thlList){
                thMap.put(thuonghieuEntity.getId(), thuonghieuEntity.getTen());
            }
            model.addAttribute("thuonghieuList", thMap);
        }
    }
    
    //combobox Màu Đá
    private void setMauDaDropDownList(Model model) {
        MauDaModel lstmauda = new MauDaModel();
        List<Mauda> mdList = lstmauda.getAllMauDa();
        if(!mdList.isEmpty()){
            HashMap<Integer, String> mdMap=new HashMap<Integer, String>();
            for(Mauda maudaEntity : mdList){
                mdMap.put(maudaEntity.getId(), maudaEntity.getTen());
            }
            model.addAttribute("maudaList", mdMap);
        }
    }
    
    //combobox Chủng Loại
    private void setChungLoaiDropDownList(Model model) {
        ChungLoaiModel lstchungloai = new ChungLoaiModel();
        List<Chungloai> clList = lstchungloai.getAllChungLoai();
        if(!clList.isEmpty()){
            HashMap<Integer, String> clMap=new HashMap<Integer, String>();
            for(Chungloai chungloaiEntity : clList){
                clMap.put(chungloaiEntity.getId(), chungloaiEntity.getTen());
            }
            model.addAttribute("chungloaiList", clMap);
        }
    }
    
    //combobox Loại Vàng
    private void setLoaiVangDropDownList(Model model) {
        LoaiVangModel lstloaivang = new LoaiVangModel();
        List<Loaivang> lvList = lstloaivang.getAllLoaiVang();
        if(!lvList.isEmpty()){
            HashMap<Integer, String> lvMap=new HashMap<Integer, String>();
            for(Loaivang loaivangEntity : lvList){
                lvMap.put(loaivangEntity.getId(), loaivangEntity.getTen());
            }
            model.addAttribute("loaivangList", lvMap);
        }
    }
    
    //combobox Loại Đá
    private void setLoaiDaDropDownList(Model model) {
        LoaiDaModel lstloaida = new LoaiDaModel();
        List<Loaida> ldList = lstloaida.getAllLoaiDa();
        if(!ldList.isEmpty()){
            HashMap<Integer, String> ldMap=new HashMap<Integer, String>();
            for(Loaida loaidaEntity : ldList){
                ldMap.put(loaidaEntity.getId(), loaidaEntity.getTen());
            }
            model.addAttribute("loaidaList", ldMap);
        }
    }
    
    //combobox Chất Liệu
    private void setChatLieuDropDownList(Model model) {
        ChatLieuModel lstchatlieu = new ChatLieuModel();
        List<Chatlieu> chlList = lstchatlieu.getAllChatLieu();
        if(!chlList.isEmpty()){
            HashMap<Integer, String> chlMap=new HashMap<Integer, String>();
            for(Chatlieu chatlieuEntity : chlList){
                chlMap.put(chatlieuEntity.getId(), chatlieuEntity.getTen());
            }
            model.addAttribute("chatlieuList", chlMap);
        }
    }
    
    // edit
    @RequestMapping(value = "chinhsuasanpham/{id}", method = RequestMethod.GET)
    public String showEditSP(Model m, @PathVariable int id){
        SanPhamModel sp =new SanPhamModel();
        m.addAttribute("sanpham", sp.findSanPham(id));
        m.addAttribute("action", "capnhatsanpham");
//        System.out.println("--------"+sp.findOne(id).toString());
//        System.out.println("//============"+sp.findOne(id).toString());
        setTrangSucDropDownList(m);
        setThuongHieuDropDownList(m);
        setMauDaDropDownList(m);
        setChungLoaiDropDownList(m);
        setLoaiVangDropDownList(m);
        setLoaiDaDropDownList(m);
        setChatLieuDropDownList(m);
        return "chinhsuasanphamad";
    }

    
    //update
    @RequestMapping(value = "chinhsuasanpham/capnhatsanpham",method = RequestMethod.POST)
    public String updateSP(@ModelAttribute(value = "sanpham") Sanpham sp){
        SanPhamModel model =new SanPhamModel();
        model.editSanPham(sp);
        return "redirect:/danhsachsanpham.htm";
    }
    
    // end edit
    
    // xóa
    @RequestMapping(value = "/xoasanpham",method = RequestMethod.GET)
    public String deleteSP(@RequestParam(value = "id") int id){
        SanPhamModel model =new SanPhamModel();
        Sanpham sp=model.findSanPham(id);
        model.deleteSanPham(sp);
        return "redirect:danhsachsanpham.htm";
    }
    
}
