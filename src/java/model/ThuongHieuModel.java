
package model;

import entity.Thuonghieu;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class ThuongHieuModel {
    
    public List<Thuonghieu> getAllThuongHieu(){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Thuonghieu> lstthuonghieu =new ArrayList<Thuonghieu>();
        try{
            session.beginTransaction();
            lstthuonghieu=session.createCriteria(Thuonghieu.class).list();
            session.getTransaction().commit();
            
       }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
            
        return lstthuonghieu;
    }
    
    //insert  
    public void CreateThuongHieu(Thuonghieu th){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.save(th);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    //lấy ra  theo id
    public Thuonghieu findThuongHieu(int id){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Thuonghieu th =new Thuonghieu();
        try{
            session.beginTransaction();
            th=(Thuonghieu) session.get(Thuonghieu.class, id);
            //System.out.println("//=====findOne======"+lts.toString());
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
        return th;
    }
    
    //update 
    public void editThuongHieu(Thuonghieu th){
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
               session.update(th);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
    
    // xóa 
    /*public void delete(Thuonghieu lts){
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
