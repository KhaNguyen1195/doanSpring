package controller;

import entity.Chatlieu;
import entity.Chungloai;
import entity.Loaida;
import entity.Loaivang;
import entity.Mauda;
import entity.Sanpham;
import entity.Thuonghieu;
import entity.Trangsuc;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping(value = "/")
public class SanPhamController {

    @RequestMapping(value = "danhsachsanpham", method = RequestMethod.GET)
    public String getalLSP(Model m) {
        SanPhamModel model = new SanPhamModel();
        m.addAttribute("lstsanpham", model.getAllSanPham());
        //System.out.println("//=================="+model.getAllSanPham().size());
        return "dssanphamad";
    }

    // insert 
    //chuyển từ all sang create
    @RequestMapping(value = "sanpham", method = RequestMethod.GET)
    public String redirectCreateSP(Model m) {
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

    @RequestMapping(value = "themsanpham", method = RequestMethod.POST)
    public String createSP(HttpServletRequest request, @RequestParam CommonsMultipartFile img, HttpSession session) {
        String path = session.getServletContext().getRealPath("/");
        System.out.println("//===path==" + path);
        String filename = img.getOriginalFilename();
        SanPhamModel model = new SanPhamModel();
        try {
            //System.out.println("//===============1================");
            Sanpham sp = new Sanpham();
            sp.setMa(request.getParameter("ma"));
            //System.out.println("//===============ma================");
            sp.setTen(request.getParameter("ten"));
            //System.out.println("//===============ten================");
            sp.setGiaban(request.getParameter("giaban"));
            //System.out.println("//===============gia================" + sp.getGiaban());
            sp.setImg(filename + "");
            sp.setMota(request.getParameter("mota"));
            Trangsuc trangsuc = new Trangsuc();
            trangsuc.setId(Integer.parseInt(request.getParameter("trangsuc.id")));
            sp.setTrangsuc(trangsuc);

            Thuonghieu thuonghieu = new Thuonghieu();
            thuonghieu.setId(Integer.parseInt(request.getParameter("thuonghieu.id")));
            sp.setThuonghieu(thuonghieu);

            Chungloai chungloai = new Chungloai();
            chungloai.setId(Integer.parseInt(request.getParameter("chungloai.id")));
            sp.setChungloai(chungloai);

            Loaivang loaivang = new Loaivang();
            loaivang.setId(Integer.parseInt(request.getParameter("loaivang.id")));
            sp.setLoaivang(loaivang);

            Chatlieu chatlieu = new Chatlieu();
            chatlieu.setId(Integer.parseInt(request.getParameter("chatlieu.id")));
            sp.setChatlieu(chatlieu);

            Loaida loaida = new Loaida();
            loaida.setId(Integer.parseInt(request.getParameter("loaida.id")));
            sp.setLoaida(loaida);

            Mauda mauda = new Mauda();
            mauda.setId(Integer.parseInt(request.getParameter("mauda.id")));
            sp.setMauda(mauda);
            //System.out.println("demo" + sp.toString());

            byte barr[] = img.getBytes();
            BufferedOutputStream bout = new BufferedOutputStream(
                    new FileOutputStream(path + "/libs/img/" + filename));
            //System.out.println("//===filename==" + filename);
            bout.write(barr);
            model.createSanPham(sp);
            bout.flush();
            bout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:danhsachsanpham.htm";
    }
    // end insert

    // edit
    @RequestMapping(value = "chinhsuasanpham/{id}", method = RequestMethod.GET)
    public String showEditSP(Model m, @PathVariable int id) {
        SanPhamModel sp = new SanPhamModel();
        m.addAttribute("sanpham", sp.findSanPham(id));
        m.addAttribute("action", "capnhatsanpham");
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
    @RequestMapping(value = "chinhsuasanpham/capnhatsanpham", method = RequestMethod.POST)
    public String updateSP(HttpServletRequest request, @RequestParam CommonsMultipartFile img, HttpSession session) {
        String path = session.getServletContext().getRealPath("/");
        System.out.println("//===path==" + path);
        String filename = img.getOriginalFilename();
        SanPhamModel model = new SanPhamModel();
        BufferedOutputStream bout;
        Sanpham sp = new Sanpham();
            try {
                if (!img.isEmpty()) {
                //System.out.println("//===============1================");
                
                
                byte barr[] = img.getBytes();
                bout = new BufferedOutputStream(
                        new FileOutputStream(path + "/libs/img/" + filename));
                System.out.println("//===filename==" + filename);
                bout.write(barr);
                bout.flush();
                bout.close();
                }
                sp.setId(Integer.parseInt(request.getParameter("id")));
                sp.setMa(request.getParameter("ma"));
                //System.out.println("//===============ma================");
                sp.setTen(request.getParameter("ten"));
                //System.out.println("//===============ten================");
                sp.setGiaban(request.getParameter("giaban"));
                //System.out.println("//===============gia================" + sp.getGiaban());
                sp.setImg(filename + "");

                sp.setMota(request.getParameter("mota"));
                Trangsuc trangsuc = new Trangsuc();
                trangsuc.setId(Integer.parseInt(request.getParameter("trangsuc.id")));
                sp.setTrangsuc(trangsuc);

                Thuonghieu thuonghieu = new Thuonghieu();
                thuonghieu.setId(Integer.parseInt(request.getParameter("thuonghieu.id")));
                sp.setThuonghieu(thuonghieu);

                Chungloai chungloai = new Chungloai();
                chungloai.setId(Integer.parseInt(request.getParameter("chungloai.id")));
                sp.setChungloai(chungloai);

                Loaivang loaivang = new Loaivang();
                loaivang.setId(Integer.parseInt(request.getParameter("loaivang.id")));
                sp.setLoaivang(loaivang);

                Chatlieu chatlieu = new Chatlieu();
                chatlieu.setId(Integer.parseInt(request.getParameter("chatlieu.id")));
                sp.setChatlieu(chatlieu);

                Loaida loaida = new Loaida();
                loaida.setId(Integer.parseInt(request.getParameter("loaida.id")));
                sp.setLoaida(loaida);

                Mauda mauda = new Mauda();
                mauda.setId(Integer.parseInt(request.getParameter("mauda.id")));
                sp.setMauda(mauda);
                //System.out.println("demo" + sp.toString());

                
                model.editSanPham(sp);
                
            } catch (Exception e) {
                System.out.println(e);
            }
       

        return "redirect:/danhsachsanpham.htm";
    }

    // end edit
    // xóa
    @RequestMapping(value = "/xoasanpham", method = RequestMethod.GET)
    public String deleteSP(@RequestParam(value = "id") int id) {
        SanPhamModel model = new SanPhamModel();
        Sanpham sp = model.findSanPham(id);
        model.deleteSanPham(sp);
        return "redirect:danhsachsanpham.htm";
    }

    // combobox trang sức
    private void setTrangSucDropDownList(Model model) {
        TrangSucModel lsttrangsuc = new TrangSucModel();
        List<Trangsuc> tsList = lsttrangsuc.getAllTrangSuc();
        if (!tsList.isEmpty()) {
            HashMap<Integer, String> tsMap = new HashMap<Integer, String>();
            for (Trangsuc trangsucEntity : tsList) {
                tsMap.put(trangsucEntity.getId(), trangsucEntity.getTen());
            }
            model.addAttribute("trangsucList", tsMap);
        }
    }

    //combobox Thương Hiệu
    private void setThuongHieuDropDownList(Model model) {
        ThuongHieuModel lstthuonghieu = new ThuongHieuModel();
        List<Thuonghieu> thlList = lstthuonghieu.getAllThuongHieu();
        if (!thlList.isEmpty()) {
            HashMap<Integer, String> thMap = new HashMap<Integer, String>();
            for (Thuonghieu thuonghieuEntity : thlList) {
                thMap.put(thuonghieuEntity.getId(), thuonghieuEntity.getTen());
            }
            model.addAttribute("thuonghieuList", thMap);
        }
    }

    //combobox Màu Đá
    private void setMauDaDropDownList(Model model) {
        MauDaModel lstmauda = new MauDaModel();
        List<Mauda> mdList = lstmauda.getAllMauDa();
        if (!mdList.isEmpty()) {
            HashMap<Integer, String> mdMap = new HashMap<Integer, String>();
            for (Mauda maudaEntity : mdList) {
                mdMap.put(maudaEntity.getId(), maudaEntity.getTen());
            }
            model.addAttribute("maudaList", mdMap);
        }
    }

    //combobox Chủng Loại
    private void setChungLoaiDropDownList(Model model) {
        ChungLoaiModel lstchungloai = new ChungLoaiModel();
        List<Chungloai> clList = lstchungloai.getAllChungLoai();
        if (!clList.isEmpty()) {
            HashMap<Integer, String> clMap = new HashMap<Integer, String>();
            for (Chungloai chungloaiEntity : clList) {
                clMap.put(chungloaiEntity.getId(), chungloaiEntity.getTen());
            }
            model.addAttribute("chungloaiList", clMap);
        }
    }

    //combobox Loại Vàng
    private void setLoaiVangDropDownList(Model model) {
        LoaiVangModel lstloaivang = new LoaiVangModel();
        List<Loaivang> lvList = lstloaivang.getAllLoaiVang();
        if (!lvList.isEmpty()) {
            HashMap<Integer, String> lvMap = new HashMap<Integer, String>();
            for (Loaivang loaivangEntity : lvList) {
                lvMap.put(loaivangEntity.getId(), loaivangEntity.getTen());
            }
            model.addAttribute("loaivangList", lvMap);
        }
    }

    //combobox Loại Đá
    private void setLoaiDaDropDownList(Model model) {
        LoaiDaModel lstloaida = new LoaiDaModel();
        List<Loaida> ldList = lstloaida.getAllLoaiDa();
        if (!ldList.isEmpty()) {
            HashMap<Integer, String> ldMap = new HashMap<Integer, String>();
            for (Loaida loaidaEntity : ldList) {
                ldMap.put(loaidaEntity.getId(), loaidaEntity.getTen());
            }
            model.addAttribute("loaidaList", ldMap);
        }
    }

    //combobox Chất Liệu
    private void setChatLieuDropDownList(Model model) {
        ChatLieuModel lstchatlieu = new ChatLieuModel();
        List<Chatlieu> chlList = lstchatlieu.getAllChatLieu();
        if (!chlList.isEmpty()) {
            HashMap<Integer, String> chlMap = new HashMap<Integer, String>();
            for (Chatlieu chatlieuEntity : chlList) {
                chlMap.put(chatlieuEntity.getId(), chatlieuEntity.getTen());
            }
            model.addAttribute("chatlieuList", chlMap);
        }
    }

}
