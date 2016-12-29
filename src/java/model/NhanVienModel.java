/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Nhanvien;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class NhanVienModel {
    public List<Nhanvien>getAllNhanVien() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Nhanvien> lstnhanvien  = new ArrayList<Nhanvien>();
        try {
            session.beginTransaction();
            lstnhanvien = session.createCriteria(Nhanvien.class).list();
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lstnhanvien;
    }
    
    //insert  
    public void createNhanVien(Nhanvien nv) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(nv);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
    
    //lấy ra  theo id
    public Nhanvien findNhanVien(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Nhanvien nv = new Nhanvien();
        try {
            session.beginTransaction();
            nv = (Nhanvien) session.get(Nhanvien.class, id);
            //System.out.println("//=====findOne======"+ts.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return nv;
    }

    //update 
    public void editNhanVien(Nhanvien nv) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(nv);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
}
