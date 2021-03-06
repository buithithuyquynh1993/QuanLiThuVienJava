package entity;
// Generated Dec 18, 2014 8:03:55 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Chude generated by hbm2java
 */
@Entity
@Table(name="CHUDE"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class Chude  implements java.io.Serializable {


     private int id;
     private Serializable tenChuDe;
     private Set<Sach> saches = new HashSet<Sach>(0);

    public Chude() {
    }

	
    public Chude(int id) {
        this.id = id;
    }
    public Chude(int id, Serializable tenChuDe, Set<Sach> saches) {
       this.id = id;
       this.tenChuDe = tenChuDe;
       this.saches = saches;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="TenChuDe")
    public Serializable getTenChuDe() {
        return this.tenChuDe;
    }
    
    public void setTenChuDe(Serializable tenChuDe) {
        this.tenChuDe = tenChuDe;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="chude")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}


