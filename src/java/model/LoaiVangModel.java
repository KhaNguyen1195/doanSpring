/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Loaivang;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author asus
 */
public class LoaiVangModel {
     public List<Loaivang> getAllLoaiVang(){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Loaivang> lstloaivang =new ArrayList<Loaivang>();
        try{
            session.beginTransaction();
            lstloaivang=session.createCriteria(Loaivang.class).list();
            session.getTransaction().commit();
            
       }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
            
        return lstloaivang;
    }
     
      //insert  
    public void CreateLoaiVang(Loaivang lv){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.save(lv);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    //lấy ra  theo id
    public Loaivang findLoaiVang(int id){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Loaivang lv =new Loaivang();
        try{
            session.beginTransaction();
            lv=(Loaivang) session.get(Loaivang.class, id);
            //System.out.println("//=====findOne======"+lts.toString());
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
        return lv;
    }
    
    //update 
    public void editLoaiVang(Loaivang lv){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
               session.update(lv);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    // xóa 
    public void deleteLoaiVang(Loaivang lv){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(lv);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
}
