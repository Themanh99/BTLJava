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
	loaitk bit
)


create table NCC(
	maNCC char(6) primary key,
	tenNCC nvarchar(40),
	sdtNCC char(10),
	diachiNCC nvarchar(60),
)

create table SINHVIEN(
	maSV char(10) primary key,
	tenSV nvarchar(30),
	emailSV varchar(30),
	sdtSV char(10),
	CONSTRAINT UN_EMAIL unique (emailSV,sdtSV),
)


create table PHIEUMUA(
	maPMUA char(6) primary key,
	ngayMua datetime default getdate(),
	maSV char(10),
	tongtien float,
	CONSTRAINT FK_PMUA_SV FOREIGN KEY(maSV) REFERENCES SINHVIEN(maSV),
) 


create table SACH(
	maSach char(6) PRIMARY KEY,
	tenSach nvarchar(30),
	tenTacGia nvarchar(30),
	tenNXB nvarchar(40),
	giaSach float,
	theLoai nvarchar(20),
	trangthai bit,
	soluong int,
	)



create table PHIEUNHAP(
	maPN char(6) primary key,
	ngaynhap datetime default getdate(),
	maNCC char(6),
	tongtien float,
	CONSTRAINT FK_PHIEUNHAP_NCC FOREIGN KEY(maNCC) REFERENCES NCC(maNCC),
)

create table CHITIETPN(
	maPN char(6),
	maSach char(6),
	soluongnhap int ,
	gia float,
	CONSTRAINT PK_CTPHIEU PRIMARY KEY(mapn,maSach),
	CONSTRAINT FK_CTPHIEU_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSach),
	CONSTRAINT FK_CTPHIEU_PN FOREIGN KEY(maPN) REFERENCES PHIEUNHAP(maPN),
)

create table PHIEUMUONTRA(
	maPMUON char(6) primary key,
	ngayMuon datetime default getdate(),
	maSV char(10),
	tongtien float,
	CONSTRAINT FK_PMUON_SV FOREIGN KEY(maSV) REFERENCES SINHVIEN(maSV),
) 

create table CHITIETMUONTRA(
	maPMUON char(6),
	maSach char(6),
	soluong int,
	ngayTra datetime ,
	gia float,
	CONSTRAINT PK_CTPHIEUMUON PRIMARY KEY(maPMUON,maSach),
	CONSTRAINT FK_CTPHIEUMUON_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSach),
	CONSTRAINT FK_CTPHIEUMUON_PM FOREIGN KEY(maPMUON) REFERENCES PHIEUMUONTRA(maPMUON),
)

create table CHITIETMUA(
	maPMUA char(6),
	maSach char(6),
	soluong int,
	gia float,
	CONSTRAINT PK_CTPHIEUMUA PRIMARY KEY(maPMUA,maSach),
	CONSTRAINT FK_CTPHIEUMUA_SACH FOREIGN KEY(maSach) REFERENCES SACH(maSach),
	CONSTRAINT FK_CTPHIEUMUA_PM FOREIGN KEY(maPMUA) REFERENCES PHIEUMUA(maPMUA),
)

