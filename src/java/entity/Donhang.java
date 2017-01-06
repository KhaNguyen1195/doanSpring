package entity;
// Generated Jan 6, 2017 10:56:46 AM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Donhang generated by hbm2java
 */
@Entity
@Table(name="donhang"
    ,catalog="doanspring"
)
public class Donhang  implements java.io.Serializable {


     private Integer id;
     private Khachhang khachhang;
     private Date ngaydathang;
     private String ghichu;
     private Date ngaytao;
     private Set<Chitietdonhang> chitietdonhangs = new HashSet<Chitietdonhang>(0);
     private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);

    public Donhang() {
    }

    public Donhang(Khachhang khachhang, Date ngaydathang, String ghichu, Date ngaytao, Set<Chitietdonhang> chitietdonhangs, Set<Hoadon> hoadons) {
       this.khachhang = khachhang;
       this.ngaydathang = ngaydathang;
       this.ghichu = ghichu;
       this.ngaytao = ngaytao;
       this.chitietdonhangs = chitietdonhangs;
       this.hoadons = hoadons;
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
    @JoinColumn(name="khachhang_id")
    public Khachhang getKhachhang() {
        return this.khachhang;
    }
    
    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ngaydathang", length=10)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getNgaydathang() {
        return this.ngaydathang;
    }
    
    public void setNgaydathang(Date ngaydathang) {
        this.ngaydathang = ngaydathang;
    }

    
    @Column(name="ghichu", length=65535)
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ngaytao", length=10)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getNgaytao() {
        return this.ngaytao;
    }
    
    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="donhang")
    public Set<Chitietdonhang> getChitietdonhangs() {
        return this.chitietdonhangs;
    }
    
    public void setChitietdonhangs(Set<Chitietdonhang> chitietdonhangs) {
        this.chitietdonhangs = chitietdonhangs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="donhang")
    public Set<Hoadon> getHoadons() {
        return this.hoadons;
    }
    
    public void setHoadons(Set<Hoadon> hoadons) {
        this.hoadons = hoadons;
    }




}


