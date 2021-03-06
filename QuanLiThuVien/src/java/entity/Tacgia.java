package entity;
// Generated Dec 18, 2014 8:03:55 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Tacgia generated by hbm2java
 */
@Entity
@Table(name="TACGIA"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class Tacgia  implements java.io.Serializable {


     private int id;
     private Serializable tenTacGia;
     private Serializable quocTich;
     private Set<Sach> saches = new HashSet<Sach>(0);

    public Tacgia() {
    }

	
    public Tacgia(int id) {
        this.id = id;
    }
    public Tacgia(int id, Serializable tenTacGia, Serializable quocTich, Set<Sach> saches) {
       this.id = id;
       this.tenTacGia = tenTacGia;
       this.quocTich = quocTich;
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

    
    @Column(name="TenTacGia")
    public Serializable getTenTacGia() {
        return this.tenTacGia;
    }
    
    public void setTenTacGia(Serializable tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    
    @Column(name="QuocTich")
    public Serializable getQuocTich() {
        return this.quocTich;
    }
    
    public void setQuocTich(Serializable quocTich) {
        this.quocTich = quocTich;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="TACGIA_SACH", schema="dbo", catalog="QuanLyThuVien", joinColumns = { 
        @JoinColumn(name="IDTacGia", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="IDSach", nullable=false, updatable=false) })
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}


