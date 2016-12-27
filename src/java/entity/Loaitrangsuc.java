package entity;
// Generated Dec 27, 2016 6:33:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Loaitrangsuc generated by hbm2java
 */
@Entity
@Table(name="loaitrangsuc"
    ,catalog="doanspring"
)
public class Loaitrangsuc  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private String ma;
     private String mota;
     private Integer daxoa;
     private Set<Trangsuc> trangsucs = new HashSet<Trangsuc>(0);

    public Loaitrangsuc() {
    }

    public Loaitrangsuc(String ten, String ma, String mota, Integer daxoa, Set<Trangsuc> trangsucs) {
       this.ten = ten;
       this.ma = ma;
       this.mota = mota;
       this.daxoa = daxoa;
       this.trangsucs = trangsucs;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="loaitrangsuc")
    public Set<Trangsuc> getTrangsucs() {
        return this.trangsucs;
    }
    
    public void setTrangsucs(Set<Trangsuc> trangsucs) {
        this.trangsucs = trangsucs;
    }




}


