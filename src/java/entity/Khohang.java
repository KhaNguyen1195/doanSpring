package entity;
// Generated Jan 10, 2017 7:57:48 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Khohang generated by hbm2java
 */
@Entity
@Table(name="khohang"
    ,catalog="doanspring"
)
public class Khohang  implements java.io.Serializable {


     private Integer id;
     private Nhacungcap nhacungcap;
     private Nhanvien nhanvien;
     private Sanpham sanpham;
     private Integer soluong;
     private String gianhap1sp;
     private Date ngaynhapkho;
     private String tongtrigia;
     private String donvitinh;

    public Khohang() {
    }

    public Khohang(Nhacungcap nhacungcap, Nhanvien nhanvien, Sanpham sanpham, Integer soluong, String gianhap1sp, Date ngaynhapkho, String tongtrigia, String donvitinh) {
       this.nhacungcap = nhacungcap;
       this.nhanvien = nhanvien;
       this.sanpham = sanpham;
       this.soluong = soluong;
       this.gianhap1sp = gianhap1sp;
       this.ngaynhapkho = ngaynhapkho;
       this.tongtrigia = tongtrigia;
       this.donvitinh = donvitinh;
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
    @JoinColumn(name="nhacungcap_id")
    public Nhacungcap getNhacungcap() {
        return this.nhacungcap;
    }
    
    public void setNhacungcap(Nhacungcap nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nhanvien_id")
    public Nhanvien getNhanvien() {
        return this.nhanvien;
    }
    
    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="sanpham_id")
    public Sanpham getSanpham() {
        return this.sanpham;
    }
    
    public void setSanpham(Sanpham sanpham) {
        this.sanpham = sanpham;
    }

    
    @Column(name="soluong")
    public Integer getSoluong() {
        return this.soluong;
    }
    
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    
    @Column(name="gianhap1sp", length=8)
    public String getGianhap1sp() {
        return this.gianhap1sp;
    }
    
    public void setGianhap1sp(String gianhap1sp) {
        this.gianhap1sp = gianhap1sp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ngaynhapkho", length=19)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getNgaynhapkho() {
        return this.ngaynhapkho;
    }
    
    public void setNgaynhapkho(Date ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
    }

    
    @Column(name="tongtrigia", length=8)
    public String getTongtrigia() {
        return this.tongtrigia;
    }
    
    public void setTongtrigia(String tongtrigia) {
        this.tongtrigia = tongtrigia;
    }

    
    @Column(name="donvitinh", length=250)
    public String getDonvitinh() {
        return this.donvitinh;
    }
    
    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }




}


