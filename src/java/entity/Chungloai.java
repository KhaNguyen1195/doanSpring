package entity;
// Generated Dec 23, 2016 8:35:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Chungloai generated by hbm2java
 */
@Entity
@Table(name="chungloai"
    ,catalog="doanspring"
)
public class Chungloai  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private String ma;
     private String mota;
     private Integer daxoa;
     private Date ngaytao;
     private Set<Sanpham> sanphams = new HashSet<Sanpham>(0);

    public Chungloai() {
    }

    public Chungloai(String ten, String ma, String mota, Integer daxoa, Date ngaytao, Set<Sanpham> sanphams) {
       this.ten = ten;
       this.ma = ma;
       this.mota = mota;
       this.daxoa = daxoa;
       this.ngaytao = ngaytao;
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

    
    @Column(name="mota", length=250)
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ngaytao", length=19)
    public Date getNgaytao() {
        return this.ngaytao;
    }
    
    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="chungloai")
    public Set<Sanpham> getSanphams() {
        return this.sanphams;
    }
    
    public void setSanphams(Set<Sanpham> sanphams) {
        this.sanphams = sanphams;
    }




}


