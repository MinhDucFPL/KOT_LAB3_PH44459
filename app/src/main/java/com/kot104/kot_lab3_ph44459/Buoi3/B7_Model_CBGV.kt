package com.kot104.kot_lab3_ph44459.Buoi3

class B7_Model_CBGV(val nguoi: B7_Model_Nguoi) { // Use val for person information

    var maSoGV: String = ""
    var luongCung: Int = 0
    var luongThuong: Int = 0
    var tienPhat: Int = 0
    var luongThucLinh: Int = 0

    init {
        this.maSoGV = ""
        this.luongCung = 0
        this.luongThuong = 0
        this.tienPhat = 0
        this.luongThucLinh = 0
    }

    constructor(nguoi: B7_Model_Nguoi, maSoGV: String, luongCung: Int, luongThuong: Int, tienPhat: Int) : this(nguoi) {
        this.maSoGV = maSoGV
        this.luongCung = luongCung
        this.luongThuong = luongThuong
        this.tienPhat = tienPhat
        tinhLuongThucLinh()
    }

    fun tinhLuongThucLinh() {
        luongThucLinh = luongCung + luongThuong - tienPhat
    }

    override fun toString(): String {
        return "Mã số GV: $maSoGV, $nguoi, Lương thực lĩnh: $luongThucLinh"
    }
}
