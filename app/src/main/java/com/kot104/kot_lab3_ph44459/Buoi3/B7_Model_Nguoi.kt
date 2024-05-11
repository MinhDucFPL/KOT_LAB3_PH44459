package com.kot104.kot_lab3_ph44459.Buoi3

class B7_Model_Nguoi {
        var hoTen: String = ""
        var tuoi: Int = 0
        var queQuan: String = ""

        constructor(hoTen: String, tuoi: Int, queQuan: String) {
            this.hoTen = hoTen
            this.tuoi = tuoi
            this.queQuan = queQuan
        }

        override fun toString(): String {
            return "Họ tên: $hoTen, Tuổi: $tuoi, Quê quán: $queQuan"
        }
}