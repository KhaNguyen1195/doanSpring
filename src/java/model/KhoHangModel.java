/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Khohang;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class KhoHangModel {
    public List<Khohang>getAllKhoHang() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Khohang> lstkhohang  = new ArrayList<Khohang>();
        try {
            session.beginTransaction();
            lstkhohang = session.createCriteria(Khohang.class).list();

            // toString để lấy name load ra danh sách
            for (Khohang khohang : lstkhohang) {
                System.out.println(khohang.toString());
            }
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lstkhohang;
    }
    
    
    //insert  
    public void createKhoHang(Khohang khg) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(khg);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
    
    
    //lấy ra  theo id
    public Khohang findKhoHang(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Khohang khg = new Khohang();
        try {
            session.beginTransaction();
            khg = (Khohang) session.get(Khohang.class, id);
            //System.out.println("//=====findOne======"+ts.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return khg;
    }

    //update 
    public void editKhoHang(Khohang khg) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(khg);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
    
    // xóa 
    public void deleteKhoHang(Khohang khg){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(khg);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
}
