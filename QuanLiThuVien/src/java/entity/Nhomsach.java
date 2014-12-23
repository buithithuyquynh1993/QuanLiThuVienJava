package entity;
// Generated Dec 23, 2014 10:18:12 AM by Hibernate Tools 4.3.1


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
 * Nhomsach generated by hbm2java
 */
@Entity
@Table(name="NHOMSACH"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class Nhomsach  implements java.io.Serializable {


     private int id;
     private String tenNhom;
     private Set<Sach> saches = new HashSet<Sach>(0);

    public Nhomsach() {
    }

	
    public Nhomsach(int id) {
        this.id = id;
    }
    public Nhomsach(int id, String tenNhom, Set<Sach> saches) {
       this.id = id;
       this.tenNhom = tenNhom;
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

    
    @Column(name="TenNhom")
    public String getTenNhom() {
        return this.tenNhom;
    }
    
    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nhomsach")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}


