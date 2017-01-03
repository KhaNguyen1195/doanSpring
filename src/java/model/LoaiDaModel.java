/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Loaida;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author asus
 */
public class LoaiDaModel {
     public List<Loaida> getAllLoaiDa(){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Loaida> lstloaida =new ArrayList<Loaida>();
        try{
            session.beginTransaction();
            lstloaida=session.createCriteria(Loaida.class).list();
            session.getTransaction().commit();
            
       }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
            
        return lstloaida;
    }
    
    //insert  
    public void CreateLoaiDa(Loaida ld){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.save(ld);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    //lấy ra  theo id
    public Loaida findLoaiDa(int id){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Loaida ld =new Loaida();
        try{
            session.beginTransaction();
            ld=(Loaida) session.get(Loaida.class, id);
            //System.out.println("//=====findOne======"+lts.toString());
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
        return ld;
    }
    
    //update 
    public void editLoaiDa(Loaida ld){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
               session.update(ld);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    // xóa 
    public void deleteLoaiDa(Loaida ld){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(ld);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
}
