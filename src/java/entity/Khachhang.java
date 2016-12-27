package entity;
// Generated Dec 27, 2016 10:57:08 AM by Hibernate Tools 4.3.1


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
 * Khachhang generated by hbm2java
 */
@Entity
@Table(name="khachhang"
    ,catalog="doanspring"
)
public class Khachhang  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private String ma;
     private String email;
     private Date ngaysinh;
     private Integer gioitinh;
     private String sodienthoai;
     private String diachi;
     private String tendangnhap;
     private String matkhau;
     private Integer daxoa;
     private Date ngaytao;
     private Set<Donhang> donhangs = new HashSet<Donhang>(0);
     private Set<Giohang> giohangs = new HashSet<Giohang>(0);

    public Khachhang() {
    }

    public Khachhang(String ten, String ma, String email, Date ngaysinh, Integer gioitinh, String sodienthoai, String diachi, String tendangnhap, String matkhau, Integer daxoa, Date ngaytao, Set<Donhang> donhangs, Set<Giohang> giohangs) {
       this.ten = ten;
       this.ma = ma;
       this.email = email;
       this.ngaysinh = ngaysinh;
       this.gioitinh = gioitinh;
       this.sodienthoai = sodienthoai;
       this.diachi = diachi;
       this.tendangnhap = tendangnhap;
       this.matkhau = matkhau;
       this.daxoa = daxoa;
       this.ngaytao = ngaytao;
       this.donhangs = donhangs;
       this.giohangs = giohangs;
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

    
    @Column(name="email", length=250)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ngaysinh", length=19)
    public Date getNgaysinh() {
        return this.ngaysinh;
    }
    
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    
    @Column(name="gioitinh")
    public Integer getGioitinh() {
        return this.gioitinh;
    }
    
    public void setGioitinh(Integer gioitinh) {
        this.gioitinh = gioitinh;
    }

    
    @Column(name="sodienthoai", length=250)
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    
    @Column(name="diachi", length=250)
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
    @Column(name="tendangnhap", length=250)
    public String getTendangnhap() {
        return this.tendangnhap;
    }
    
    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    
    @Column(name="matkhau", length=250)
    public String getMatkhau() {
        return this.matkhau;
    }
    
    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="khachhang")
    public Set<Donhang> getDonhangs() {
        return this.donhangs;
    }
    
    public void setDonhangs(Set<Donhang> donhangs) {
        this.donhangs = donhangs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="khachhang")
    public Set<Giohang> getGiohangs() {
        return this.giohangs;
    }
    
    public void setGiohangs(Set<Giohang> giohangs) {
        this.giohangs = giohangs;
    }




}


