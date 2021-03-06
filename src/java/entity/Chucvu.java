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
 * Chucvu generated by hbm2java
 */
@Entity
@Table(name="chucvu"
    ,catalog="doanspring"
)
public class Chucvu  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private String ma;
     private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);

    public Chucvu() {
    }

    public Chucvu(String ten, String ma, Set<Nhanvien> nhanviens) {
       this.ten = ten;
       this.ma = ma;
       this.nhanviens = nhanviens;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="chucvu")
    public Set<Nhanvien> getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set<Nhanvien> nhanviens) {
        this.nhanviens = nhanviens;
    }




}


