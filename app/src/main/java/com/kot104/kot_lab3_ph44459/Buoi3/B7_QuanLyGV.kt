package com.kot104.kot_lab3_ph44459.Buoi3

import java.util.Scanner

fun main() {
    val CBGV = mutableListOf<B7_Model_CBGV>()
    val scanner = Scanner(System.`in`)
    val gv1 = B7_Model_CBGV(B7_Model_Nguoi("Lê Minh Đức", 21, "Vĩnh Phúc"), "PH44459", 5000000, 1000000, 500000)
    val gv2 = B7_Model_CBGV(B7_Model_Nguoi("Vũ Minh Quân", 20, "Bắc Giang"), "PH44046", 4500000, 800000, 0)
    CBGV.add(gv1)
    CBGV.add(gv2)
    while (true) {
        // Menu
        println("\nChọn chức năng:")
        println("1. Thêm GV")
        println("2. Sửa GV")
        println("3. Xóa GV")
        println("4. In danh sách GV")
        println("5. Thoát")

        print("Nhập lựa chọn: ")
        val choice = scanner.nextInt()
        scanner.nextLine() // Consume newline

        when (choice) {
            1 -> themGV(CBGV, scanner)
            2 -> suaGV(CBGV, scanner)
            3 -> xoaGV(CBGV, scanner)
            4 -> inDanhSachGV(CBGV)
            5 -> break
            else -> println("Lựa chọn không hợp lệ!")
        }
    }

    println("\nThoát chương trình!")
}
fun themGV(dsCBGV: MutableList<B7_Model_CBGV>, scanner: Scanner) {
    println("\nNhập thông tin GV mới:")
    print("Họ tên: ")
    val hoTen = scanner.nextLine()
    print("Tuổi: ")
    val tuoi = scanner.nextInt()
    scanner.nextLine() // Consume newline
    print("Quê quán: ")
    val queQuan = scanner.nextLine()
    print("Mã số GV: ")
    val maSoGV = scanner.nextLine()
    print("Lương cứng: ")
    val luongCung = scanner.nextInt()
    scanner.nextLine() // Consume newline
    print("Lương thưởng: ")
    val luongThuong = scanner.nextInt()
    scanner.nextLine() // Consume newline
    print("Tiền phạt: ")
    val tienPhat = scanner.nextInt()
    scanner.nextLine() // Consume newline

    val gv = B7_Model_CBGV(B7_Model_Nguoi(hoTen, tuoi, queQuan), maSoGV, luongCung, luongThuong, tienPhat)
    dsCBGV.add(gv)
    println("GV đã được thêm thành công!")
}
fun suaGV(dsCBGV: MutableList<B7_Model_CBGV>, scanner: Scanner) {
    if (dsCBGV.isEmpty()) {
        println("Danh sách GV đang trống!")
        return
    }

    println("\nNhập mã số GV cần sửa:")
    val maSoGV = scanner.nextLine()

    val gvIndex = dsCBGV.indexOfFirst { it.maSoGV == maSoGV }
    if (gvIndex == -1) {
        println("GV với mã số $maSoGV không tồn tại!")
        return
    }

    val gv = dsCBGV[gvIndex]

    println("\nNhập thông tin GV đã sửa:")
    print("Họ tên (để trống nếu không đổi): ")
    val hoTenNew = scanner.nextLine()
    print("Tuổi (để trống nếu không đổi): ")
    val tuoiNew = scanner.nextLine()
    print("Quê quán (để trống nếu không đổi): ")
    val queQuanNew = scanner.nextLine()
    print("Mã số GV (để trống nếu không đổi): ")
    val maSoGVNew = scanner.nextLine()
    print("Lương cứng (để trống nếu không đổi): ")
    val luongCungNew = scanner.nextLine()
    print("Lương thưởng (để trống nếu không đổi): ")
    val luongThuongNew = scanner.nextLine()
    print("Tiền phạt (để trống nếu không đổi): ")
    val tienPhatNew = scanner.nextLine()

    // Update GV information if the new value is not empty
    if (hoTenNew.isNotEmpty()) {
        gv.nguoi.hoTen = hoTenNew
    }
    if (tuoiNew.isNotEmpty()) {
        gv.nguoi.tuoi = tuoiNew.toInt()
    }
    if (queQuanNew.isNotEmpty()) {
        gv.nguoi.queQuan = queQuanNew
    }
    if (maSoGVNew.isNotEmpty()) {
        gv.maSoGV = maSoGVNew
    }
    if (luongCungNew.isNotEmpty()) {
        gv.luongCung = luongCungNew.toInt()
    }
    if (luongThuongNew.isNotEmpty()) {
        gv.luongThuong = luongThuongNew.toInt()
    }
    if (tienPhatNew.isNotEmpty()) {
        gv.tienPhat = tienPhatNew.toInt()
    }

    gv.tinhLuongThucLinh()

    // Update the list reference to reflect the changes
    dsCBGV[gvIndex] = gv

    println("GV đã được cập nhật thành công!")
}

fun xoaGV(dsCBGV: MutableList<B7_Model_CBGV>, scanner: Scanner) {
    if (dsCBGV.isEmpty()) {
        println("Danh sách GV đang trống!")
        return
    }

    println("\nNhập mã số GV cần xóa:")
    val maSoGV = scanner.nextLine()

    val gvIndex = dsCBGV.indexOfFirst { it.maSoGV == maSoGV }
    if (gvIndex == -1) {
        println("GV với mã số $maSoGV không tồn tại!")
        return
    }

    dsCBGV.removeAt(gvIndex)
    println("GV với mã số $maSoGV đã được xóa thành công!")
}

fun inDanhSachGV(dsCBGV: MutableList<B7_Model_CBGV>) {
    if (dsCBGV.isEmpty()) {
        println("\nDanh sách GV đang trống!")
        return
    }

    println("\nDanh sách GV:")
    for (gv in dsCBGV) {
        println(gv)
    }
}