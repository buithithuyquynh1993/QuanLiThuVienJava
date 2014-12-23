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
@Controller
@RequestMapping(value="/Employee")
public class EmployeeController {
    
    @RequestMapping(value = "/addbook", method = RequestMethod.GET)
    public String AddBook(Model m)
    {
        EmployeeModel data = new EmployeeModel();
        
        m.addAttribute("_listTG", data.GetAllAuthors());
        m.addAttribute("_listNXB", data.GetAllPublisher());
        
        return "AddBook";
    }
}
