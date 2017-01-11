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
 * @author asus
 */
public class LoginADModel {
    public List<Nhanvien> getALL(){
       Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Nhanvien> lst = new ArrayList<Nhanvien>();
        try{
            session.beginTransaction();
            lst = session.createCriteria(Nhanvien.class).list();
            session.getTransaction().commit();
        }
        catch(Exception e){          
            System.out.println("error:"+e.toString());
        }
        return lst;
    }
    
    public Nhanvien GetNV(int id){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Nhanvien tk = new Nhanvien();
        try{
            session.beginTransaction();
            tk= (Nhanvien) session.get(Nhanvien.class, id);
            session.getTransaction().commit();
        }catch(Exception e){
        }
        return tk;
        
    }
    
    public List<Nhanvien> getMK(){
        //  nhu cũ
       Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Nhanvien> lst = new ArrayList<Nhanvien>();
        try{
            session.beginTransaction();
            lst = session.createCriteria(Nhanvien.class).list();
            session.getTransaction().commit();
        }
        catch(Exception e){          
            System.out.println("error:"+e.toString());
        }
        return lst;
    }
    
    public void edit(Nhanvien md) {
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
