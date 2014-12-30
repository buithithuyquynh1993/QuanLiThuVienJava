/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SalmDo
 */
import entity.*;
import java.util.*;
import javax.xml.bind.annotation.XmlElement;
import org.hibernate.*;

public class EmployeeModel {
    
    //   Begin:  Add New Book
    public List<Tacgia> GetAllAuthors(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Tacgia> Result = new ArrayList<>();
        try{
            s.beginTransaction();
            Criteria temp = s.createCriteria(Tacgia.class);
            Result = temp.list();
            s.getTransaction().commit();
        }
        catch(Exception e)
        {
            Result = null;
        }
        return Result;
    }   
    public List<Nhaxuatban> GetAllPublisher(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Nhaxuatban> Result = new ArrayList<>();
        try{
            s.beginTransaction();
            Criteria temp = s.createCriteria(Nhaxuatban.class);
            Result = temp.list();
            s.getTransaction().commit();
        }
        catch(Exception e)
        {
            Result = null;
        }
        return Result;
    }
    public List<Nhomsach> GetAllBookGroups(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Nhomsach> Result = new ArrayList<>();
        try{
            s.beginTransaction();
            Criteria temp = s.createCriteria(Nhomsach.class);
            Result = temp.list();
            s.getTransaction().commit();
        }
        catch(Exception e)
        {
            Result = null;
        }
        return Result;
    }
    public List<Chude> GetAllTopics(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Chude> Result = new ArrayList<>();
        try{
            s.beginTransaction();
            Criteria temp = s.createCriteria(Chude.class);
            Result = temp.list();
            s.getTransaction().commit();
        }
        catch(Exception e)
        {
            Result = null;
        }
        return Result;
    }
    public List<Vitri> GetAllFloors(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Vitri> Result = new ArrayList<>();
        try{
            s.beginTransaction();
            Criteria temp = s.createCriteria(Vitri.class);
            Result = temp.list();
            s.getTransaction().commit();
        }
        catch(Exception e)
        {
            Result = null;
        }
        return Result;
    }
    public String SaveNewBook(Sach _sach, int id_tacgia)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        String result = "";
        try
        {
            s.beginTransaction();
            Tacgia _tacgia = (Tacgia)s.get(Tacgia.class, id_tacgia);
            _sach.getTacgias().add(_tacgia);
            s.save(_sach);
            s.getTransaction().commit();
            result = "Lưu thành công";
        }
        catch(Exception ex)
        {
            s.getTransaction().rollback();
            result = "Lưu không thành công";
        }
        return result;
    }
    //   End:  Add New Book
    
    //Begin Update Book
    public Sach getBook (int id_sach){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Sach Kq = new Sach();
        try{
             s.beginTransaction();
            Kq = (Sach)s.get(Sach.class, id_sach);
            s.getTransaction().commit();
        }
        catch (Exception ex){
            s.getTransaction().rollback();
            Kq = null;
        }
        return Kq;
    }
    
    public String EditBook(Sach _sach)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        String result = "";
        try
        {
            s.beginTransaction();
            s.update(_sach);
            s.getTransaction().commit();
            result = "Lưu thành công";
        }
        catch(Exception ex)
        {
            s.getTransaction().rollback();
            result = "Lưu không thành công";
        }
        return result;
    }
    //End Update Book
}
