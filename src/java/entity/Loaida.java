package entity;
// Generated Jan 10, 2017 7:57:48 AM by Hibernate Tools 4.3.1



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
 * Loaida generated by hbm2java
 */
@Entity
@Table(name="loaida"
    ,catalog="doanspring"
)
public class Loaida  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private String ma;
     private String mota;
     private String hinhdang;
     private Long kichthuoc;
     private String chatluong;
     private Set<Sanpham> sanphams = new HashSet<Sanpham>(0);

    public Loaida() {
    }

    public Loaida(String ten, String ma, String mota, String hinhdang, Long kichthuoc, String chatluong, Set<Sanpham> sanphams) {
       this.ten = ten;
       this.ma = ma;
       this.mota = mota;
       this.hinhdang = hinhdang;
       this.kichthuoc = kichthuoc;
       this.chatluong = chatluong;
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

    
    @Column(name="mota", length=65535)
    public String getMota() {
        return this.mota;
    }
    
    public void setMota(String mota) {
        this.mota = mota;
    }

    
    @Column(name="hinhdang", length=250)
    public String getHinhdang() {
        return this.hinhdang;
    }
    
    public void setHinhdang(String hinhdang) {
        this.hinhdang = hinhdang;
    }

    
    @Column(name="kichthuoc", precision=10, scale=0)
    public Long getKichthuoc() {
        return this.kichthuoc;
    }
    
    public void setKichthuoc(Long kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    
    @Column(name="chatluong", length=50)
    public String getChatluong() {
        return this.chatluong;
    }
    
    public void setChatluong(String chatluong) {
        this.chatluong = chatluong;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loaida")
    public Set<Sanpham> getSanphams() {
        return this.sanphams;
    }
    
    public void setSanphams(Set<Sanpham> sanphams) {
        this.sanphams = sanphams;
    }




}


