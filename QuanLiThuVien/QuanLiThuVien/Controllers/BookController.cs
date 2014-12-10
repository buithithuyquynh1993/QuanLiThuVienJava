﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using QuanLiThuVien.Models;

namespace QuanLiThuVien.Controllers
{
    public class BookController : Controller
    {
        //
        // GET: /Sach/

        public ActionResult Index()
        {
            return View();
        }

        public ActionResult getListBorrowers() {
            QuanLyThuVienEntities data = new QuanLyThuVienEntities();
            var result = from t in data.VIEW_BORROWERS select t;
            return View(result);
        }
    }
}
