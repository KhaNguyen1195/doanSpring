package model;

import entity.Trangsuc;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class TrangSucModel {

    public List<Trangsuc> getAll() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Trangsuc> lst = new ArrayList<Trangsuc>();
        try {
            session.beginTransaction();
            lst = session.createCriteria(Trangsuc.class).list();

            // toString để lấy name load ra danh sách
            for (Trangsuc trangsuc : lst) {
                System.out.println(trangsuc.toString());
            }
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lst;
    }

    //insert  
    public void Create(Trangsuc ts) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(ts);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }

    //lấy ra  theo id
    public Trangsuc findOne(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Trangsuc ts = new Trangsuc();
        try {
            session.beginTransaction();
            ts = (Trangsuc) session.get(Trangsuc.class, id);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return ts;
    }

    //update 
    public void edit(Trangsuc ts) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(ts);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
    }

    // xóa 
    /*public void delete(Trangsuc ts){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(ts);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }*/
}
