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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sanpham generated by hbm2java
 */
@Entity
@Table(name="sanpham"
    ,catalog="doanspring"
)
public class Sanpham  implements java.io.Serializable {


     private Integer id;
     private Chatlieu chatlieu;
     private Chungloai chungloai;
     private Loaida loaida;
     private Loaivang loaivang;
     private Mauda mauda;
     private Thuonghieu thuonghieu;
     private Trangsuc trangsuc;
     private String ten;
     private String ma;
     private Long giaban;
     private String mota;
     private Integer daxoa;
     private String img;
     private Date ngaytao;
     private Set<Khohang> khohangs = new HashSet<Khohang>(0);
     private Set<Chitietdonhang> chitietdonhangs = new HashSet<Chitietdonhang>(0);
     private Set<Giohang> giohangs = new HashSet<Giohang>(0);

    public Sanpham() {
    }

    public Sanpham(Chatlieu chatlieu, Chungloai chungloai, Loaida loaida, Loaivang loaivang, Mauda mauda, Thuonghieu thuonghieu, Trangsuc trangsuc, String ten, String ma, Long giaban, String mota, Integer daxoa, String img, Date ngaytao, Set<Khohang> khohangs, Set<Chitietdonhang> chitietdonhangs, Set<Giohang> giohangs) {
       this.chatlieu = chatlieu;
       this.chungloai = chungloai;
       this.loaida = loaida;
       this.loaivang = loaivang;
       this.mauda = mauda;
       this.thuonghieu = thuonghieu;
       this.trangsuc = trangsuc;
       this.ten = ten;
       this.ma = ma;
       this.giaban = giaban;
       this.mota = mota;
       this.daxoa = daxoa;
       this.img = img;
       this.ngaytao = ngaytao;
       this.khohangs = khohangs;
       this.chitietdonhangs = chitietdonhangs;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="chatlieu_id")
    public Chatlieu getChatlieu() {
        return this.chatlieu;
    }
    
    public void setChatlieu(Chatlieu chatlieu) {
        this.chatlieu = chatlieu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="chungloai_id")
    public Chungloai getChungloai() {
        return this.chungloai;
    }
    
    public void setChungloai(Chungloai chungloai) {
        this.chungloai = chungloai;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loaida_id")
    public Loaida getLoaida() {
        return this.loaida;
    }
    
    public void setLoaida(Loaida loaida) {
        this.loaida = loaida;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loaivang_id")
    public Loaivang getLoaivang() {
        return this.loaivang;
    }
    
    public void setLoaivang(Loaivang loaivang) {
        this.loaivang = loaivang;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mauda_id")
    public Mauda getMauda() {
        return this.mauda;
    }
    
    public void setMauda(Mauda mauda) {
        this.mauda = mauda;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="thuonghieu_id")
    public Thuonghieu getThuonghieu() {
        return this.thuonghieu;
    }
    
    public void setThuonghieu(Thuonghieu thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="trangsuc_id")
    public Trangsuc getTrangsuc() {
        return this.trangsuc;
    }
    
    public void setTrangsuc(Trangsuc trangsuc) {
        this.trangsuc = trangsuc;
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

    
    @Column(name="giaban", precision=10, scale=0)
    public Long getGiaban() {
        return this.giaban;
    }
    
    public void setGiaban(Long giaban) {
        this.giaban = giaban;
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

    
    @Column(name="img", length=250)
    public String getImg() {
        return this.img;
    }
    
    public void setImg(String img) {
        this.img = img;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ngaytao", length=19)
    public Date getNgaytao() {
        return this.ngaytao;
    }
    
    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sanpham")
    public Set<Khohang> getKhohangs() {
        return this.khohangs;
    }
    
    public void setKhohangs(Set<Khohang> khohangs) {
        this.khohangs = khohangs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sanpham")
    public Set<Chitietdonhang> getChitietdonhangs() {
        return this.chitietdonhangs;
    }
    
    public void setChitietdonhangs(Set<Chitietdonhang> chitietdonhangs) {
        this.chitietdonhangs = chitietdonhangs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sanpham")
    public Set<Giohang> getGiohangs() {
        return this.giohangs;
    }
    
    public void setGiohangs(Set<Giohang> giohangs) {
        this.giohangs = giohangs;
    }

    @Override
    public String toString() {
        return "Sanpham{" + "id=" + id + ", chatlieu=" + chatlieu + ", chungloai=" + chungloai +
                ", loaida=" + loaida + ", loaivang=" + loaivang + ", mauda=" + mauda + ", thuonghieu=" + thuonghieu + 
                ", trangsuc=" + trangsuc + ", ten=" + ten + ", ma=" + ma + ", giaban=" + giaban + ", mota=" + mota + 
                ", daxoa=" + daxoa + ", img=" + img + ", ngaytao=" + ngaytao + ", khohangs=" + khohangs +
                ", chitietdonhangs=" + chitietdonhangs + ", giohangs=" + giohangs + '}';
    }


    

}


