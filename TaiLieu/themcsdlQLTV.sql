
-- taikhoan admin
insert into TAIKHOAN values 
('admin','admin'),
('quang','admin'),
('son','admin'),
('manh','admin')


insert into SACH values 
('MS0001','toan cao cap1','TG001','NXB001',40000,'sach giao khoa'),
('MS0002','toan cao cap2','TG001','NXB001',50000,'sach giao khoa'),
('MS0003','phap luat dc','TG002','NXB002',45000,'sach giao khoa'),
('MS0004','toan roi rac','TG003','NXB002',55000,'sach giao khoa'),
('MS0005','sql server','TG004','NXB003',35000,'sach giao khoa')

insert into SINHVIEN values
('2017601707','Chu The Manh','themanh@gmail.com','0345574951'),
('2017601708','Nguyen Khac Son','khacson@gmail.com','0345574952'),
('2017601709','Pham Nhu Quang','nhuquang@gmail.com','0345574953'),
('2017601710','Do The Ky','theky@gmail.com','0345574954'),
('2017601711','Tran Tuan Anh','tuananh@gmail.com','0345574955')

insert into TACGIA values
('TG001','Do Ngoc Son','01/01/1970'),
('TG002','Dang Quynh Nga','02/04/1971'),
('TG003','Tran The Binh','04/06/1972'),
('TG004','Nguyen Duc Nhat','11/09/1973'),
('TG005','Phan Van Vien','24/11/1970')

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
('PM0001','11/05/2020','2017601707'),
('PM0002','12/05/2020','2017601707'),
('PM0003','9/05/2020','2017601709'),
('PM0004','7/05/2020','2017601710'),
('PM0005','13/05/2020','2017601709')

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

insert into CHITIETNHAP values
('PN0001','MS0001',300,39000),
('PN0002','MS0002',200,49000),
('PN0003','MS0003',200,44000),
('PN0004','MS0004',300,54000),
('PN0005','MS0005',300,34000)

insert into PHIEUMUON values
('PM0001','04/05/2019','2017601708'),
('PM0002','04/05/2019','2017601707'),
('PM0003','04/05/2019','2017601709'),
('PM0004','05/05/2019','2017601707'),
('PM0005','05/05/2019','2017601709')

insert into CHITIETMUON values
('PM0001','MS0001',1),
('PM0002','MS0002',1),
('PM0003','MS0003',1),
('PM0004','MS0005',1),
('PM0005','MS0001',1)

insert into PHIEUTRA values
('PT0001','12/05/2020','2017601708','PM0001'),
('PT0002','12/05/2020','2017601707','PM0002'),
('PT0003','13/05/2020','2017601709','PM0003')

