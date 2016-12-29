/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Mauda;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class MauDaModel {
    public List<Mauda> getAllMauDa() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Mauda> lstmauda  = new ArrayList<Mauda>();
        try {
            session.beginTransaction();
            lstmauda = session.createCriteria(Mauda.class).list();
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lstmauda;
    }
    
    //insert  
    public void createMauDa(Mauda md) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(md);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
    
    //lấy ra  theo id
    public Mauda findMauDa(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Mauda md = new Mauda();
        try {
            session.beginTransaction();
            md = (Mauda) session.get(Mauda.class, id);
            //System.out.println("//=====findOne======"+ts.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return md;
    }

    //update 
    public void editMauDa(Mauda md) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(md);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }
}
