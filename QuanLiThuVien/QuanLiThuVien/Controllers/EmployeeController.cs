﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using QuanLiThuVien.Models;
using System.Net;
using System.Net.Mail;
using System.Text;
using System.ComponentModel.DataAnnotations;

namespace QuanLiThuVien.Controllers
{
    public class EmployeeController : Controller
    {
        //
        // GET: /Employee/  
        QuanLyThuVienEntities data = new QuanLyThuVienEntities();
        public ActionResult BorrowedBook()
        {
            return View();
        }
        public ActionResult SaveBorrowedBook()
        {
            try 
            {
                int IDSach = int.Parse(@Request["IDSach"]);
                THONGTINMUONTRA muontra = new THONGTINMUONTRA();
                muontra.IDDocGia = int.Parse(@Request["IDDocGia"].ToString());
                muontra.IDNhanVienNhan = int.Parse(@Request["IDNhanVien"].ToString());
                muontra.IDSach = IDSach;
                muontra.NgayMuon = DateTime.Parse(@Request["ThoiGianMuon"].ToString());
                muontra.NgayTra = DateTime.Parse(@Request["ThoiGianTra"].ToString());
                data.THONGTINMUONTRAs.Add(muontra);
                data.SaveChanges();

                // update status of book
                SACH sach = (from s in data.SACHes where s.ID == IDSach select s).First();
                sach.TrangThai = "Đang mượn";
                data.SaveChanges();
                TempData["insert"] = "1";
                return RedirectToAction("BorrowedBook");
            }
            catch(Exception)
            {
                TempData["insert"] = "0";
                return RedirectToAction("BorrowedBook");
            }
        }
        public ActionResult BorrowedRoom()
        {
            TempData["to"] = "";
            TempData["subject"] = "";
            return View();
        }
        public ActionResult SaveBorrowedRoom()
        {
            try
            {
                QuanLyThuVienEntities data = new QuanLyThuVienEntities();
                LICHSUMUONPHONG ls = new LICHSUMUONPHONG();
                ls.IDDocGia = int.Parse(@Request["IDDocGia"].ToString());
                ls.IDPhong = int.Parse(@Request["IDPhong"].ToString());
                ls.ThoiGianMuon = DateTime.Parse(@Request["ThoiGianMuon"].ToString());
                ls.ThoiGianTra = DateTime.Parse(@Request["ThoiGianTra"].ToString());
                data.LICHSUMUONPHONGs.Add(ls);
                data.SaveChanges();
                TempData["insert"] = "1";
                return RedirectToAction("BorrowedRoom");
            }
            catch(Exception)
            {
                TempData["insert"] = "0";
                return RedirectToAction("BorrowedRoom");
            }
        }
        public ActionResult TraSach()
        {
            return View();
        }
         #region Chuc năng trả sách

        public THONGTINMUONTRA layThongTinMuonSach() { return null; }
        public decimal tinhTienTienPhatQuaHan() { return 0; }
        public decimal tinhTienTienPhatThem() { return 0; }
        public bool thuchienTraSach() { return false; }
        #endregion
        

        public ActionResult layDSNguoiMuon()
        {
            QuanLyThuVienEntities data = new QuanLyThuVienEntities();
            var result = from t in data.VIEW_BORROWERS select t;
            var tem = result.GetType();
            return View(result);
        }
        public List<string> GetEmailList()
        {
            var result = from nguoiDK in data.NGUOIDANGKies select nguoiDK.Email;
            List<string> email = result.ToList();
            return email;
        }
        public ActionResult Mail()
        {
            List<string> email = GetEmailList();
            return View();
        }
        public ActionResult SendMail()
        {
            var yourmail = @Request["yourmail"];
            var pass = @Request["password"];
            var to = @Request["to"];
            var subject = @Request["subject"];
            var content = @Request["content"];
            try
            {
                SmtpClient smtp = new SmtpClient("smtp.gmail.com", 587);
                smtp.EnableSsl = true;
                smtp.UseDefaultCredentials = false;
                smtp.Credentials = new NetworkCredential(@yourmail, @pass);

                MailMessage mail = new MailMessage(@yourmail, @to, @subject, @content);
                smtp.Send(mail);

                TempData["notice"] = "1";
                return View("Mail");
            }
            catch (Exception)
            {
                TempData["notice"] = "0";
                TempData["to"] = to;
                TempData["subject"] = subject;
                TempData["content"] = content;
                return View("Mail");
            }
        }
        
    }
}
