package entity;
// Generated Dec 30, 2016 10:39:50 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Trangsuc generated by hbm2java
 */
@Entity
@Table(name="trangsuc"
    ,catalog="doanspring"
)
public class Trangsuc  implements java.io.Serializable {


     private Integer id;
     private Loaitrangsuc loaitrangsuc;
     private String ten;
     private String ma;
     private String mota;
     private Integer daxoa;
     private Set<Sanpham> sanphams = new HashSet<Sanpham>(0);

    public Trangsuc() {
    }

    public Trangsuc(Loaitrangsuc loaitrangsuc, String ten, String ma, String mota, Integer daxoa, Set<Sanpham> sanphams) {
       this.loaitrangsuc = loaitrangsuc;
       this.ten = ten;
       this.ma = ma;
       this.mota = mota;
       this.daxoa = daxoa;
       this.sanphams = sanphams;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loaitrangsuc_id")
    public Loaitrangsuc getLoaitrangsuc() {
        return this.loaitrangsuc;
    }
    
    public void setLoaitrangsuc(Loaitrangsuc loaitrangsuc) {
        this.loaitrangsuc = loaitrangsuc;
    }

    
    @Column(name="ten", length=250)
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    
    @Column(name="ma", length=50)
    public String getMa() {
        return this.ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    
    @Column(name="mota", length=65535)
    public String getMota() {
        return this.mota;
    }
    
    public void setMota(String mota) {
        this.mota = mota;
    }

    
    @Column(name="daxoa")
    public Integer getDaxoa() {
        return this.daxoa;
    }
    
    public void setDaxoa(Integer daxoa) {
        this.daxoa = daxoa;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="trangsuc")
    public Set<Sanpham> getSanphams() {
        return this.sanphams;
    }
    
    public void setSanphams(Set<Sanpham> sanphams) {
        this.sanphams = sanphams;
    }

    @Override
    public String toString() {
        return "Trangsuc{" + "id=" + id + ", loaitrangsuc=" + loaitrangsuc + ", ten=" + ten +
                ", ma=" + ma + ", mota=" + mota + ", daxoa=" + daxoa + ", sanphams=" + sanphams + '}';
    }

}


