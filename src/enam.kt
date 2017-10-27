class Mobil3 {
    companion object {
        @JvmField var pintu = 2

        fun bukapintu(){
            println("Buka pintu...")
        }

        fun tutuppintu(){
            println("Tutup Pintu...")
        }
    }

    var mesin = 1
    var roda = 4
    var body = 1
}

fun main(args: Array<String>) {
    var avanza = Mobil3()
    println("Mesin avanza: " + avanza.mesin)
    println("Roda avanza: " + avanza.roda)

    Mobil3.bukapintu()
    Mobil3.tutuppintu()
}