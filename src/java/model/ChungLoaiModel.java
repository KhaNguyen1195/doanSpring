/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Chungloai;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author asus
 */
public class ChungLoaiModel {
      public List<Chungloai> getAllChungLoai(){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Chungloai> Cloaichungloai =new ArrayList<Chungloai>();
        try{
            session.beginTransaction();
            Cloaichungloai=session.createCriteria(Chungloai.class).list();
            session.getTransaction().commit();
            
       }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
            
        return Cloaichungloai;
    }
      
      //insert  
    public void CreateChungLoai(Chungloai Cloai){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.save(Cloai);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    //lấy ra  theo id
    public Chungloai findChungLoai(int id){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Chungloai Cloai =new Chungloai();
        try{
            session.beginTransaction();
            Cloai=(Chungloai) session.get(Chungloai.class, id);
            //System.out.println("//=====findOne======"+lts.toString());
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
        return Cloai;
    }
    
    //update 
    public void editChungLoai(Chungloai Cloai){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
               session.update(Cloai);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    // xóa 
    public void deleteChungLoai(Chungloai Cloai){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(Cloai);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
}
