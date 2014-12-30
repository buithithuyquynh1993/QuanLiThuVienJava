/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.mail.Part;

/**
 *
 * @author SalmDo
 */

@ManagedBean(name = "uplCtrl")
public class UploadController {
    
    private Part file; 

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    
    public String upload()
    {
        String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("MucLucImages");
                
        return "try_upload";
    }
}
