package model;

import entity.Trangsuc;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class TrangSucModel {

    public List<Trangsuc>getAllTrangSuc() {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Trangsuc> lsttrangsuc  = new ArrayList<Trangsuc>();
        try {
            session.beginTransaction();
            lsttrangsuc = session.createCriteria(Trangsuc.class).list();

            // toString để lấy name load ra danh sách
            for (Trangsuc trangsuc : lsttrangsuc) {
                System.out.println(trangsuc.toString());
            }
            session.getTransaction().commit();

        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }

        return lsttrangsuc;
    }

    //insert  
    public void createTrangSuc(Trangsuc ts) {
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
    public Trangsuc findTrangSuc(int id) {
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Trangsuc ts = new Trangsuc();
        try {
            session.beginTransaction();
            ts = (Trangsuc) session.get(Trangsuc.class, id);
            //System.out.println("//=====findOne======"+ts.toString());
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("Lỗi" + ex.toString());
        }
        return ts;
    }

    //update 
    public void editTrangSuc(Trangsuc ts) {
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
    public void deleteTrangSuc(Trangsuc ts){
        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        try{
            session.beginTransaction();
            session.delete(ts);
            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Lỗi"+ex.toString());
        }
    }
}
