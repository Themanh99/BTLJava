use QLThuVien
-- taikhoan admin
insert into TAIKHOAN values 
('admin','admin',1),
('quang','admin',1),
('son','admin',1),
('manh','admin',1)

insert into NCC values
('NCC001','Nha sach Phuong Nam','0977319769','214 Thanh Xuan'),
('NCC002','Nha sach Trung Anh','0977319770','30 Pho Nhon'),
('NCC003','Nha sach Hoa Hong','0977319771','Tu Hoang Ha Noi'),
('NCC004','Nha sach Tuoi Tre','0977319772','132 Cau Dien'),
('NCC005','Nha sach Su Pham','0977319773','100 Cau Giay')




insert into SACH (maSach,tenSach,tenTacGia,tenNXB,giaSach ,theLoai,trangthai ,soluong )
values 
('MS0010' ,'sql server'     ,'Nguyen Duc Nhat' ,'Nha xuat ban KHKT'      ,35000,'sach giao khoa'  ,'false',20),
('MS0005' ,'sql server'     ,'Nguyen Duc Nhat' ,'Nha xuat ban KHKT'      ,35000,'sach giao khoa'  ,'true' ,20),
('MS0003' ,'phap luat dc'   ,'Dang Quynh Nga'  ,'Nha xuat ban Su Pham'   ,45000,'sach giao khoa'  ,'true' ,54),
('MS0008' ,'phap luat dc'   ,'Dang Quynh Nga'  ,'Nha xuat ban Su Pham'   ,45000,'sach nguoi lon'  ,'false',54),
('MS0004' ,'toan roi rac'   ,'Phan Van Vien'   ,'Nha xuat ban Tu Tai'    ,55000,'sach giao khoa'  ,'false',24),
('MS0009' ,'toan roi rac'   ,'Phan Van Vien'   ,'Nha xuat ban Tu Tai'    ,55000,'sach giao khoa'  ,'true' ,24),

('MS0001' ,'toan cao cap1'  ,'Do Ngoc Son'     ,'Nha xuat ban GD va DT'  ,40000,'sach giao khoa'  ,'true' ,74),
('MS0006' ,'toan cao cap1'  ,'Do Ngoc Son'     ,'Nha xuat ban GD va DT'  ,40000,'sach giao khoa'  ,'false',34),
('MS0002' ,'toan cao cap2'  ,'Tran The Binh'   ,'Nha xuat ban Kim Dong'  ,50000,'sach tre em'     ,'false',46),
('MS0007' ,'toan cao cap2'  ,'Tran The Binh'   ,'Nha xuat ban Kim Dong'  ,50000,'sach giao khoa'  ,'true' ,46)

insert into SINHVIEN values
('2017601707','Chu The Manh','themanh@gmail.com','0345574951'),
('2017602342','Nguyen Khac Son','khacson@gmail.com','0345574952'),
('2017602401','Nguyen Nhu Quang','nhuquang@gmail.com','0345574953'),
('2017601710','Do The Ky','theky@gmail.com','0345574954'),
('2017601711','Tran Tuan Anh','tuananh@gmail.com','0345574955')


insert into PHIEUMUA(maPMUA,maSV,tongtien) values
('PM0001','2017601707',23604),
('PM0002','2017601707',23604),
('PM0003','2017601709',23604),
('PM0004','2017601710',23604),
('PM0005','2017601709',23604)


insert into PHIEUNHAP(maPN,maNCC,tongtien) values
('PN0001','NCC001',23604),
('PN0002','NCC002',23604),
('PN0003','NCC003',23604),
('PN0004','NCC001',23604),
('PN0005','NCC004',23604)



insert into PHIEUMUONTRA(maPMUON,maSV,tongtien) values
('PM0001','2017601708',23604),
('PM0002','2017601707',23604),
('PM0003','2017601709',23604),
('PM0004','2017601707',23604),
('PM0005','2017601709',23604)

insert into CHITIETMUONTRA(maPMUON,maSach ,soluong ,gia ) values
('PM0001','MS0001',1,20000),
('PM0002','MS0002',2,30000),
('PM0003','MS0003',1,24000),
('PM0004','MS0005',5,28000),
('PM0005','MS0001',7,40000)



insert into CHITIETPN values
('PN0001','MS0001',300,39000),
('PN0002','MS0002',200,49000),
('PN0003','MS0003',200,44000),
('PN0004','MS0004',300,54000),
('PN0005','MS0005',300,34000)


insert into CHITIETMUA values
('PM0001','MS0001',1,5000),
('PM0002','MS0004',1,6000),
('PM0003','MS0002',2,7000),
('PM0004','MS0003',1,12000),
('PM0005','MS0001',3,24000)

go
create trigger tg_themchitietphieumua
on CHITIETMUA
for insert
as
begin
	declare @maPMUA char(6)
	declare @maSach char(6)
	declare @slban int
	declare @slcon int
	set @maPMUA =(	select maPMUA
						from inserted)
	set @maSach=(	select maSach
						from inserted)
	set @slban = (	select soluong
						from inserted)
	
	update Sach set soluong=soluong-@slban where maSach=@masach
end

go
create trigger tg_themchitietphieunhap
on CHITIETPN
for insert
as
begin
	declare @maPN char(6)
	declare @maSach char(6)
	declare @slnhap int
	declare @slcon int
	set @maPN =(	select @maPN
						from inserted)
	set @maSach=(	select maSach
						from inserted)
	set @slnhap = (	select soluongnhap
						from inserted)
	
	update Sach set soluong=soluong+@slnhap where maSach=@masach
end


go
create trigger tg_chitietphieumuontra
on CHITIETMUONTRA
for insert
as
begin
	declare @maPMUONTRA char(6)
	declare @maSach char(6)
	declare @slmuon int
		set @maPMUONTRA = (select maPMUON from inserted)
		set @maSach = (select maSach from inserted)
		set @slmuon = (select soluong from inserted)
	update Sach set soluong=soluong-@slmuon where maSach=@maSach
end



go
create function fn_layranam ()
Returns @bangtam table(nam int)
as
begin
	insert into @bangtam	
		select YEAR(ngayMua) from PHIEUMUA
		union
		select YEAR(ngayMuon)  from PHIEUMUONTRA
		return
end













-- thong ke
go
create function fn_thongke(@thang int, @nam int)
returns @bang table(
	luotmuasach int, 
	slsachban int,
	luotmuonsach int,
	slsachmuon int,
	ttsachban float,
	ttsachmuon float
)
as
	begin
		declare @luotmuasach int
		declare @slsachban int
		declare @luotmuonsach int
		declare @slsachmuon int
		declare @ttsachban float
		declare @ttsachmuon float

		select @luotmuasach = (select count(*) from PHIEUMUA where MONTH(ngayMua)=@thang and YEAR(ngayMua)=@nam)
		select @slsachban = (select sum(soluong) from CHITIETMUA,PHIEUMUA where CHITIETMUA.maPMUA = PHIEUMUA.maPMUA and MONTH(ngayMua)=@thang and YEAR(ngayMua)=@nam )
		select @luotmuonsach =(select count(*) from PHIEUMUONTRA where MONTH(ngayMuon)=@thang and YEAR(ngayMuon)=@nam)
		select @slsachmuon =(select sum(soluong) from CHITIETMUONTRA, PHIEUMUONTRA where CHITIETMUONTRA.maPMUON = PHIEUMUONTRA.maPMUON and MONTH(ngayMuon)=@thang and YEAR(ngayMuon)=@nam )
		select @ttsachban = (select sum(tongtien) from PHIEUMUA where MONTH(ngayMua)=@thang and YEAR(ngayMua)=@nam )
		select @ttsachmuon = (select sum(tongtien) from PHIEUMUONTRA where MONTH(ngayMuon)=@thang and YEAR(ngayMuon)=@nam)

		insert into @bang values (@luotmuasach, @slsachban, @luotmuonsach, @slsachmuon, @ttsachban, @ttsachmuon)
		return
	end



go
create function fn_thongkenam(@nam int)
returns @bang table(
	luotmuasach int, 
	slsachban int,
	luotmuonsach int,
	slsachmuon int,
	ttsachban float,
	ttsachmuon float
)
as
	begin
		declare @luotmuasach int
		declare @slsachban int
		declare @luotmuonsach int
		declare @slsachmuon int
		declare @ttsachban float
		declare @ttsachmuon float

		select @luotmuasach = (select count(*) from PHIEUMUA where YEAR(ngayMua)=@nam)
		select @slsachban = (select sum(soluong) from CHITIETMUA,PHIEUMUA where CHITIETMUA.maPMUA = PHIEUMUA.maPMUA and YEAR(ngayMua)=@nam )
		select @luotmuonsach =(select count(*) from PHIEUMUONTRA where YEAR(ngayMuon)=@nam)
		select @slsachmuon =(select sum(soluong) from CHITIETMUONTRA, PHIEUMUONTRA where CHITIETMUONTRA.maPMUON = PHIEUMUONTRA.maPMUON and YEAR(ngayMuon)=@nam )
		select @ttsachban = (select sum(tongtien) from PHIEUMUA where YEAR(ngayMua)=@nam )
		select @ttsachmuon = (select sum(tongtien) from PHIEUMUONTRA where YEAR(ngayMuon)=@nam)

		insert into @bang values (@luotmuasach, @slsachban, @luotmuonsach, @slsachmuon, @ttsachban, @ttsachmuon)
		return
	end