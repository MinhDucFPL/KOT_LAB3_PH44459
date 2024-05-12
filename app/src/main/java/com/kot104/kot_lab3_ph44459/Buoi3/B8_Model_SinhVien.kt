package com.kot104.kot_lab3_ph44459.Buoi3

class B8_Model_SinhVien(
    var  hoTen: String,
    var tuoi:Int,
    var lop: String
){
    override fun toString(): String {
        return "Sinh viên (họ tên: $hoTen ,tuổi: $tuoi ,lớp: $lop"
    }
}