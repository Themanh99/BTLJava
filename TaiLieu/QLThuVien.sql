use master

if exists(select * from sys.databases where name = 'QLThuVien')
	drop database QLThuVien
GO
create database QLThuVien
GO

USE QLThuVien
GO
create table TAIKHOAN(
	tk varchar(10) primary key,
	mk varchar(10) ,
	loaitk varchar(5);
)
create table  TACGIA(
	maTacGia char(6) primary key,
	tenTacGia nvarchar(30) ,
	namSinhTacgia date,
)


create table NXB(
	maNXB char(6) primary key,
	tenNXB nvarchar(40),
	sdtNXB char(10),
	diaChiNXB nvarchar(40),
)


create table NCC(
	maNCC char(6) primary key,
	tenNCC nvarchar(20),
	sdtNCC char(10),
	diachiNCC nvarchar(40),
)

create table SINHVIEN(
	maSV char(10) primary key,
	tenSV nvarchar(20),
	emailSV varchar(30),
	sdtSV char(10),
	CONSTRAINT UN_EMAIL unique (emailSV,sdtSV),
)
create table PHIEUMUON(
	maPMUON char(6) primary key,
	ngayMuon date,
	maSV char(10),
	CONSTRAINT FK_PMUON_SV FOREIGN KEY(maSV) REFERENCES SINHVIEN(maSV),
) 

create table PHIEUMUA(
	maPMUA char(6) primary key,
	ngayMua date,
	maSV char(10),
	CONSTRAINT FK_PMUA_SV FOREIGN KEY(maSV) REFERENCES SINHVIEN(maSV),
) 

create table PHIEUTRA(
	maPTRA char(6) primary key,
	ngayTra date,
	maSV char(10),
	maPMUON char(6),
	CONSTRAINT FK_PTRA_SV FOREIGN KEY(maSV) REFERENCES SINHVIEN(maSV),
	CONSTRAINT FK_PTRA_PMUON FOREIGN KEY(maPMUON) REFERENCES PHIEUMUON(maPMUON),
)

create table SACH(
	maSach char(6) PRIMARY KEY,
	tenSach nvarchar(20),
	maTacGia char(6),
	maNXB char(6),
	giaSach float,
	theLoai nvarchar(20),
	CONSTRAINT FK_SACH_NXB FOREIGN KEY(maNXB) REFERENCES NXB(maNXB),
	CONSTRAINT FK_SACH_TACGIA FOREIGN KEY(maTacGia) REFERENCES TACGIA(maTacGia),
	)

create table SACHMUON(
	maSach char(6) PRIMARY KEY,
	soluong int,
	CONSTRAINT FK_SACHMUON_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSACH),
)

create table SACHBAN(
	maSach char(6) PRIMARY KEY,
	soluong int,
	CONSTRAINT FK_SACHBAN_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSACH),
)

create table PHIEUNHAP(
	maPN char(6) primary key,
	ngaynhap date,
	maNCC char(6),
	CONSTRAINT FK_PHIEUNHAP_NCC FOREIGN KEY(maNCC) REFERENCES NCC(maNCC),
)

create table CHITIETPN(
	maPN char(6),
	maSach char(6),
	soluongnhap int ,
	gianhap float,
	CONSTRAINT PK_CTPHIEU PRIMARY KEY(mapn,masach),
	CONSTRAINT FK_CTPHIEU_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSach),
	CONSTRAINT FK_CTPHIEU_PN FOREIGN KEY(maPN) REFERENCES PHIEUNHAP(maPN),
)



create table CHITIETMUON(
	maPMUON char(6),
	maSach char(6),
	soluong int,
	CONSTRAINT PK_CTPHIEUMUON PRIMARY KEY(maPMUON,masach),
	CONSTRAINT FK_CTPHIEUMUON_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSach),
	CONSTRAINT FK_CTPHIEUMUON_PM FOREIGN KEY(maPMUON) REFERENCES PHIEUMUON(maPMUON),
)

create table CHITIETMUA(
	maPMUA char(6),
	maSach char(6),
	soluong int,
	CONSTRAINT PK_CTPHIEUMUA PRIMARY KEY(maPMUA,masach),
	CONSTRAINT FK_CTPHIEUMUA_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSach),
	CONSTRAINT FK_CTPHIEUMUA_PM FOREIGN KEY(maPMUA) REFERENCES PHIEUMUA(maPMUA),
)

