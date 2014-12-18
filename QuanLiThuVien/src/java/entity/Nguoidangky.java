package entity;
// Generated Dec 18, 2014 8:03:55 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Nguoidangky generated by hbm2java
 */
@Entity
@Table(name="NGUOIDANGKY"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class Nguoidangky  implements java.io.Serializable {


     private int id;
     private Loptaphuan loptaphuan;
     private String mssvMaHocVien;
     private Serializable hoten;
     private String email;
     private Serializable truong;
     private Boolean xacNhan;

    public Nguoidangky() {
    }

	
    public Nguoidangky(int id) {
        this.id = id;
    }
    public Nguoidangky(int id, Loptaphuan loptaphuan, String mssvMaHocVien, Serializable hoten, String email, Serializable truong, Boolean xacNhan) {
       this.id = id;
       this.loptaphuan = loptaphuan;
       this.mssvMaHocVien = mssvMaHocVien;
       this.hoten = hoten;
       this.email = email;
       this.truong = truong;
       this.xacNhan = xacNhan;
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
    @JoinColumn(name="IDLopTapHuan")
    public Loptaphuan getLoptaphuan() {
        return this.loptaphuan;
    }
    
    public void setLoptaphuan(Loptaphuan loptaphuan) {
        this.loptaphuan = loptaphuan;
    }

    
    @Column(name="MSSV_MaHocVien", length=10)
    public String getMssvMaHocVien() {
        return this.mssvMaHocVien;
    }
    
    public void setMssvMaHocVien(String mssvMaHocVien) {
        this.mssvMaHocVien = mssvMaHocVien;
    }

    
    @Column(name="Hoten")
    public Serializable getHoten() {
        return this.hoten;
    }
    
    public void setHoten(Serializable hoten) {
        this.hoten = hoten;
    }

    
    @Column(name="Email", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="Truong")
    public Serializable getTruong() {
        return this.truong;
    }
    
    public void setTruong(Serializable truong) {
        this.truong = truong;
    }

    
    @Column(name="XacNhan")
    public Boolean getXacNhan() {
        return this.xacNhan;
    }
    
    public void setXacNhan(Boolean xacNhan) {
        this.xacNhan = xacNhan;
    }




}


