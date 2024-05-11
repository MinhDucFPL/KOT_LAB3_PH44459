package com.kot104.kot_lab3_ph44459

fun main(){
    val soA:Int?=5
    val soB:Int?=10
    val tong= tinhtong(soA!!,soB!!)
    val hieu= tinhhieu(soA!!,soB!!)
    val binhphuong = binhphuong(soA!!)
    val tinhthuong= tinhthuong(soA.toFloat(),soB.toFloat())
    val tenSV:String="Minh Đức"
    println("Tổng: $soA + $soB = $tong")
    println("Hiệu: $soA - $soB = $hieu")
    println("Bình Phương $soA: $binhphuong")
    println("Thương: $soA / $soB = $tinhthuong")
    println("Chuỗi: $tenSV ; In hoa: ${inHoa(tenSV)}")
    val length= tenSV.let{
        val l=it.length
        l
    }
    println("Độ dài chuỗi: $tenSV = $length")
    val a2 = soA.run {
        val kq= this*2
        kq
    }
    println("$soA * 2 = $a2")
}
//lamda
val tinhtong:(Int,Int) -> Int
= { soA:Int, soB :Int ->(soA+soB) }
val tinhhieu = { soA:Int, soB :Int ->(soA-soB) }
val binhphuong: (Int) ->Int={it*it}
val tinhthuong= {soA:Float,soB:Float ->
    if (soB==0f) {
        "Số bị chia phải khác 0"
    }else
    {soA/soB}
}
val inHoa: (String) ->String=String::uppercase