/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Public")
public class PublicController {
    @RequestMapping(value = "/SearchBook")
    public String SearchBook()
    {
        return "SearchBook";
    }
    
     @RequestMapping(value = "/DetailBook")
    public String DetailBook()
    {
        return "DetailBook";
    }
}
