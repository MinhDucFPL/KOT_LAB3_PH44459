package com.kot104.kot_lab3_ph44459.Buoi3

class B8_Model_TheMuon (
        var maPhieuMuon: Int,
        var ngayMuon: String,
        var hanTra: String,
        var soHieuSach: String,
        var sinhVien: B8_Model_SinhVien
) {
        override fun toString(): String {
            return "TheMuon(maPhieuMuon=$maPhieuMuon, ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach='$soHieuSach', $sinhVien)"
        }
}