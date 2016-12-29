/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Nhacungcap;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class NhaCungCapModel {
    public List<Nhacungcap>getAllNhaCungCap() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Nhacungcap> lstnhacungcap  = new ArrayList<Nhacungcap>();
        try {
            session.beginTransaction();
            lstnhacungcap = session.createCriteria(Nhacungcap.class).list();
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lstnhacungcap;
    }
    
    //insert  
    public void createNhaCungCap(Nhacungcap ncc) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(ncc);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
    
    //lấy ra  theo id
    public Nhacungcap findNhaCungCap(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Nhacungcap ncc = new Nhacungcap();
        try {
            session.beginTransaction();
            ncc = (Nhacungcap) session.get(Nhacungcap.class, id);
            //System.out.println("//=====findOne======"+ts.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return ncc;
    }

    //update 
    public void editNhaCungCap(Nhacungcap ncc) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(ncc);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
}
