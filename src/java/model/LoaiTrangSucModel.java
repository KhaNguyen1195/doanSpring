
package model;

import entity.Loaitrangsuc;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class LoaiTrangSucModel {
    public List<Loaitrangsuc> getAll(){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Loaitrangsuc> lstloaitrangsuc =new ArrayList<Loaitrangsuc>();
        try{
            session.beginTransaction();
            lstloaitrangsuc=session.createCriteria(Loaitrangsuc.class).list();
            session.getTransaction().commit();
            
       }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
            
        return lstloaitrangsuc;
    }
    
    //insert  
    public void Create(Loaitrangsuc lts){
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
    public Loaitrangsuc findOne(int id){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Loaitrangsuc lts =new Loaitrangsuc();
        try{
            session.beginTransaction();
            lts=(Loaitrangsuc) session.get(Loaitrangsuc.class, id);
            //System.out.println("//=====findOne======"+lts.toString());
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
        return lts;
    }
    
    //update 
    public void edit(Loaitrangsuc lts){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
               session.update(lts);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    // xóa 
    /*public void delete(Loaitrangsuc lts){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(lts);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }*/
}
