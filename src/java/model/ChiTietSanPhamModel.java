package model;

import entity.Sanpham;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ChiTietSanPhamModel {
    public Sanpham chitietSanPham(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Sanpham sp = new Sanpham();
        try {
            session.beginTransaction();
            sp = (Sanpham) session.get(Sanpham.class, id);
            //System.out.println("//=====findOne======"+sp.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return sp;
    }
}
