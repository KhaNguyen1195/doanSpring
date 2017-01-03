/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Chatlieu;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;



/**
 *
 * @author asus
 */
public class ChatLieuModel {
      public List<Chatlieu> getAllChatLieu(){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Chatlieu> lstchatlieu =new ArrayList<Chatlieu>();
        try{
            session.beginTransaction();
            lstchatlieu=session.createCriteria(Chatlieu.class).list();
            session.getTransaction().commit();
            
       }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
            
        return lstchatlieu;
    }
       //insert  
    public void CreateChatLieu(Chatlieu lts){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.save(lts);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
     //lấy ra  theo id
    public Chatlieu findChatLieu(int id){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Chatlieu chl =new Chatlieu();
        try{
            session.beginTransaction();
            chl=(Chatlieu) session.get(Chatlieu.class, id);
            //System.out.println("//=====findOne======"+lts.toString());
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
        return chl;
    }
    
      //update 
    public void editChatLieu(Chatlieu chl){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
               session.update(chl);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    // xóa 
    public void deleteChatLieu(Chatlieu chl){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(chl);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
}
