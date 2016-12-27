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
 * Nhacungcap generated by hbm2java
 */
@Entity
@Table(name="nhacungcap"
    ,catalog="doanspring"
)
public class Nhacungcap  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private String ma;
     private String diachi;
     private String dienthoai;
     private String thanhpho;
     private String quocgia;
     private Integer daxoa;
     private Set<Khohang> khohangs = new HashSet<Khohang>(0);

    public Nhacungcap() {
    }

    public Nhacungcap(String ten, String ma, String diachi, String dienthoai, String thanhpho, String quocgia, Integer daxoa, Set<Khohang> khohangs) {
       this.ten = ten;
       this.ma = ma;
       this.diachi = diachi;
       this.dienthoai = dienthoai;
       this.thanhpho = thanhpho;
       this.quocgia = quocgia;
       this.daxoa = daxoa;
       this.khohangs = khohangs;
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

    
    @Column(name="diachi", length=250)
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
    @Column(name="dienthoai", length=50)
    public String getDienthoai() {
        return this.dienthoai;
    }
    
    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    
    @Column(name="thanhpho", length=250)
    public String getThanhpho() {
        return this.thanhpho;
    }
    
    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    
    @Column(name="quocgia", length=250)
    public String getQuocgia() {
        return this.quocgia;
    }
    
    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    
    @Column(name="daxoa")
    public Integer getDaxoa() {
        return this.daxoa;
    }
    
    public void setDaxoa(Integer daxoa) {
        this.daxoa = daxoa;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nhacungcap")
    public Set<Khohang> getKhohangs() {
        return this.khohangs;
    }
    
    public void setKhohangs(Set<Khohang> khohangs) {
        this.khohangs = khohangs;
    }




}


