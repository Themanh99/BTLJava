
-- taikhoan admin
insert into TAIKHOAN values 
('admin','admin',1),
('quang','admin',1),
('son','admin',1),
('manh','admin',1)

insert into TACGIA values
('TG001','Do Ngoc Son','1970/01/01'),
('TG002','Dang Quynh Nga','1971/02/06'),
('TG003','Tran The Binh','1972/12/25'),
('TG004','Nguyen Duc Nhat','1973/1/1'),
('TG005','Phan Van Vien','1970/12/10')

insert into NCC values
('NCC001','Nha sach Phuong Nam','0977319769','214 Thanh Xuan'),
('NCC002','Nha sach Trung Anh','0977319770','30 Pho Nhon'),
('NCC003','Nha sach Hoa Hong','0977319771','Tu Hoang Ha Noi'),
('NCC004','Nha sach Tuoi Tre','0977319772','132 Cau Dien'),
('NCC005','Nha sach Su Pham','0977319773','100 Cau Giay')

insert into NXB values
('NXB001','Nha xuat ban Kim Dong','0353221111','70 Hoan Kiem Ha Noi'),
('NXB002','Nha xuat ban Tu Tai','0353220732','Market Vien Lai'),
('NXB003','Nha xuat ban GD va DT','0353220733','50 Cau Giay'),
('NXB004','Nha xuat ban KHKT','0353220734','20 Pho Nhon Ha Noi'),
('NXB005','Nha xuat ban Su Pham','0353220735','Hoang Mai Ha Noi')


insert into SACH values 
('MS0001','toan cao cap1','TG001','NXB001',40000,'sach giao khoa'),
('MS0002','toan cao cap2','TG001','NXB001',50000,'sach giao khoa'),
('MS0003','phap luat dc','TG002','NXB002',45000,'sach giao khoa'),
('MS0004','toan roi rac','TG003','NXB002',55000,'sach giao khoa'),
('MS0005','sql server','TG004','NXB003',35000,'sach giao khoa')

insert into SINHVIEN values
('2017601707','Chu The Manh','themanh@gmail.com','0345574951'),
('2017601708','Nguyen Khac Son','khacson@gmail.com','0345574952'),
('2017601709','Nguyen Nhu Quang','nhuquang@gmail.com','0345574953'),
('2017601710','Do The Ky','theky@gmail.com','0345574954'),
('2017601711','Tran Tuan Anh','tuananh@gmail.com','0345574955')




insert into SACHBAN values
('MS0001',100),
('MS0002',150),
('MS0003',160),
('MS0004',170),
('MS0005',200)

insert into SACHMUON values
('MS0001',50),
('MS0002',50),
('MS0003',60),
('MS0004',70),
('MS0005',100)

insert into PHIEUMUA values
('PM0001','2020/11/05','2017601707'),
('PM0002','2020/12/05','2017601707'),
('PM0003','2020/9/05','2017601709'),
('PM0004','2020/7/05','2017601710'),
('PM0005','2020/1/05','2017601709')

insert into CHITIETMUA values
('PM0001','MS0001',1),
('PM0002','MS0004',1),
('PM0003','MS0002',2),
('PM0004','MS0003',1),
('PM0005','MS0001',3)

insert into PHIEUNHAP values
('PN0001','01/04/2020','NCC001'),
('PN0002','01/04/2020','NCC002'),
('PN0003','01/05/2020','NCC003'),
('PN0004','01/05/2020','NCC001'),
('PN0005','01/05/2020','NCC004')

insert into CHITIETPN values
('PN0001','MS0001',300,39000),
('PN0002','MS0002',200,49000),
('PN0003','MS0003',200,44000),
('PN0004','MS0004',300,54000),
('PN0005','MS0005',300,34000)

insert into PHIEUMUON values
('PM0001','2019/04/05','2017601708'),
('PM0002','2019/04/05','2017601707'),
('PM0003','2019/04/05','2017601709'),
('PM0004','2019/05/05','2017601707'),
('PM0005','2019/05/05','2017601709')

insert into CHITIETMUON values
('PM0001','MS0001',1),
('PM0002','MS0002',1),
('PM0003','MS0003',1),
('PM0004','MS0005',1),
('PM0005','MS0001',1)

insert into PHIEUTRA values
('PT0001',getdate(),'2017601708','PM0001'),
('PT0002',getdate(),'2017601707','PM0002'),
('PT0003',getdate(),'2017601709','PM0003'),
('PT0004',getdate(),'2017601709','PM0004'),
('PT0005',getdate(),'2017601709','PM0005')

select * from PHIEUTRA