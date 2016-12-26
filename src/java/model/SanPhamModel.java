
package model;

import entity.Sanpham;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class SanPhamModel {
    
    public List<Sanpham>getAllSanPham() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Sanpham> lstsanpham  = new ArrayList<Sanpham>();
        try {
            session.beginTransaction();
            lstsanpham = session.createCriteria(Sanpham.class).list();

            // toString để lấy name load ra danh sách
            for (Sanpham trangsuc : lstsanpham) {
                System.out.println(trangsuc.toString());
            }
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lstsanpham;
    }
    
    //insert  
    public void createSanPham(Sanpham sp) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(sp);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }

    //lấy ra  theo id
    public Sanpham findSanPham(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Sanpham sp = new Sanpham();
        try {
            session.beginTransaction();
            sp = (Sanpham) session.get(Sanpham.class, id);
            //System.out.println("//=====findOne======"+ts.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return sp;
    }

    //update 
    public void editSanPham(Sanpham sp) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(sp);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }

    // xóa 
    /*public void delete(Sanpham sp){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(sp);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }*/
}
