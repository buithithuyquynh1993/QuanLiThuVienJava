﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace QuanLiThuVien.Models
{
    using System;
    using System.Data.Entity;
    using System.Data.Entity.Infrastructure;
    
    public partial class QuanLyThuVienEntities : DbContext
    {
        public QuanLyThuVienEntities()
            : base("name=QuanLyThuVienEntities")
        {
        }
    
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            throw new UnintentionalCodeFirstException();
        }
    
        public virtual DbSet<BANPHAT> BANPHATs { get; set; }
        public virtual DbSet<CHUDE> CHUDEs { get; set; }
        public virtual DbSet<DOCGIA> DOCGIAs { get; set; }
        public virtual DbSet<LICHSUMUONPHONG> LICHSUMUONPHONGs { get; set; }
        public virtual DbSet<LOPTAPHUAN> LOPTAPHUANs { get; set; }
        public virtual DbSet<NGUOIDANGKY> NGUOIDANGKies { get; set; }
        public virtual DbSet<NHANVIEN> NHANVIENs { get; set; }
        public virtual DbSet<NHAXUATBAN> NHAXUATBANs { get; set; }
        public virtual DbSet<NHOMSACH> NHOMSACHes { get; set; }
        public virtual DbSet<PHONG> PHONGs { get; set; }
        public virtual DbSet<SACH> SACHes { get; set; }
        public virtual DbSet<TACGIA> TACGIAs { get; set; }
        public virtual DbSet<THONGTINMUONTRA> THONGTINMUONTRAs { get; set; }
        public virtual DbSet<THUGOPY> THUGOPies { get; set; }
        public virtual DbSet<VITRI> VITRIs { get; set; }
        public virtual DbSet<VIEW_BORROWERS> VIEW_BORROWERS { get; set; }
    }
}
