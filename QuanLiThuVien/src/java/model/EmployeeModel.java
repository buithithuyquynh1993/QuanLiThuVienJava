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
        List<Tacgia> Result = new ArrayList<Tacgia>();
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
        List<Nhaxuatban> Result = new ArrayList<Nhaxuatban>();
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
        return null;
    }
    public List<Chude> GetAllTopics(){
        return null;
    }
    public List<Vitri> GetAllFloors(){
        return null;
    }
    public String SaveNewBook(XmlElement node)
    {   return null;
    }
    //   End:  Add New Book
}
