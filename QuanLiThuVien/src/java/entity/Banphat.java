package entity;
// Generated Dec 10, 2014 9:29:01 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Banphat generated by hbm2java
 */
@Entity
@Table(name="BANPHAT"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class Banphat  implements java.io.Serializable {


     private int id;
     private Thongtinmuontra thongtinmuontra;
     private Serializable liDo;
     private BigDecimal phiPhat;

    public Banphat() {
    }

	
    public Banphat(int id) {
        this.id = id;
    }
    public Banphat(int id, Thongtinmuontra thongtinmuontra, Serializable liDo, BigDecimal phiPhat) {
       this.id = id;
       this.thongtinmuontra = thongtinmuontra;
       this.liDo = liDo;
       this.phiPhat = phiPhat;
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
    @JoinColumn(name="IDThongTinMuonTra")
    public Thongtinmuontra getThongtinmuontra() {
        return this.thongtinmuontra;
    }
    
    public void setThongtinmuontra(Thongtinmuontra thongtinmuontra) {
        this.thongtinmuontra = thongtinmuontra;
    }

    
    @Column(name="LiDo")
    public Serializable getLiDo() {
        return this.liDo;
    }
    
    public void setLiDo(Serializable liDo) {
        this.liDo = liDo;
    }

    
    @Column(name="PhiPhat", scale=4)
    public BigDecimal getPhiPhat() {
        return this.phiPhat;
    }
    
    public void setPhiPhat(BigDecimal phiPhat) {
        this.phiPhat = phiPhat;
    }




}

