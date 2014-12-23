package entity;
// Generated Dec 23, 2014 10:18:12 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="USER"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class User  implements java.io.Serializable {


     private int id;
     private Docgia docgia;
     private Nhanvien nhanvien;
     private Serializable password;
     private Serializable passwordSalt;
     private Serializable role;

    public User() {
    }

	
    public User(int id, Docgia docgia, Nhanvien nhanvien, Serializable password) {
        this.id = id;
        this.docgia = docgia;
        this.nhanvien = nhanvien;
        this.password = password;
    }
    public User(int id, Docgia docgia, Nhanvien nhanvien, Serializable password, Serializable passwordSalt, Serializable role) {
       this.id = id;
       this.docgia = docgia;
       this.nhanvien = nhanvien;
       this.password = password;
       this.passwordSalt = passwordSalt;
       this.role = role;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USERNAME", nullable=false)
    public Docgia getDocgia() {
        return this.docgia;
    }
    
    public void setDocgia(Docgia docgia) {
        this.docgia = docgia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USERNAME", nullable=false, insertable=false, updatable=false)
    public Nhanvien getNhanvien() {
        return this.nhanvien;
    }
    
    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }

    
    @Column(name="PASSWORD", nullable=false)
    public Serializable getPassword() {
        return this.password;
    }
    
    public void setPassword(Serializable password) {
        this.password = password;
    }

    
    @Column(name="PASSWORD_SALT")
    public Serializable getPasswordSalt() {
        return this.passwordSalt;
    }
    
    public void setPasswordSalt(Serializable passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    
    @Column(name="ROLE")
    public Serializable getRole() {
        return this.role;
    }
    
    public void setRole(Serializable role) {
        this.role = role;
    }




}


