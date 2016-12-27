/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Khachhang;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class KhachHangModel {
    public List<Khachhang>getAllKhachHang() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Khachhang> lstkhachhang  = new ArrayList<Khachhang>();
        try {
            session.beginTransaction();
            lstkhachhang = session.createCriteria(Khachhang.class).list();

            // toString để lấy name load ra danh sách
            /*for (Khachhang khachhang : lstkhachhang) {
                System.out.println(khachhang.toString());
            }*/
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lstkhachhang;
    }
    
    //lấy ra  theo id
    public Khachhang findKhachHang(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Khachhang kh = new Khachhang();
        try {
            session.beginTransaction();
            kh = (Khachhang) session.get(Khachhang.class, id);
            //System.out.println("//=====findOne======"+ts.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return kh;
    }

    //update 
    public void editKhachHang(Khachhang kh) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(kh);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
    
    
}
