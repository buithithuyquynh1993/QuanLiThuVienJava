/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.*;
import java.util.*;
import org.springframework.ui.Model;
import entity.*;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
@RequestMapping(value="/Employee")
public class EmployeeController {
    
    @RequestMapping(value = "/addbook")
    public String AddBook(Model m)
    {
        EmployeeModel data = new EmployeeModel();
        
        m.addAttribute("_listTG", data.GetAllAuthors());
        m.addAttribute("_listNXB", data.GetAllPublisher());
        m.addAttribute("_listNhomSach", data.GetAllBookGroups());
        m.addAttribute("_listChuDe", data.GetAllTopics());
        m.addAttribute("_listTang", data.GetAllFloors());
        
        return "AddBook";
    }
    @RequestMapping(value = "/saveBook", method = RequestMethod.POST )
    public String saveAddBook(@ModelAttribute(value = "_newbook") Sach _sach)
    {
        EmployeeModel data = new EmployeeModel();
        data.SaveNewBook(_sach);
        return "redirect:AddBook.htm";
    }
}
