package entity;
// Generated Dec 10, 2014 9:29:01 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Thugopy generated by hbm2java
 */
@Entity
@Table(name="THUGOPY"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class Thugopy  implements java.io.Serializable {


     private int id;
     private Serializable noiDung;
     private Date ngayGopY;

    public Thugopy() {
    }

	
    public Thugopy(int id) {
        this.id = id;
    }
    public Thugopy(int id, Serializable noiDung, Date ngayGopY) {
       this.id = id;
       this.noiDung = noiDung;
       this.ngayGopY = ngayGopY;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NoiDung")
    public Serializable getNoiDung() {
        return this.noiDung;
    }
    
    public void setNoiDung(Serializable noiDung) {
        this.noiDung = noiDung;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NgayGopY", length=10)
    public Date getNgayGopY() {
        return this.ngayGopY;
    }
    
    public void setNgayGopY(Date ngayGopY) {
        this.ngayGopY = ngayGopY;
    }




}

