fun main() {
    val amanda = Orang("Amanda", 33, "bermain tenis", null)
    val atiqah = Orang("Atiqah", 28, "mendaki", amanda)

    amanda.tampilkanProfil()
    atiqah.tampilkanProfil()
}

class Orang(val nama: String, val umur: Int, val hobi: String?, val referensi: Orang?) {
    fun tampilkanProfil() {
        println("Nama: $nama")
        println("Umur: $umur")
        if(hobi != null) {
            print("Suka $hobi. ")
        }
        if(referensi != null) {
            print("Memiliki referensi bernama ${referensi.nama}")
            if(referensi.hobi != null) {
                print(", yang suka ${referensi.hobi}.")
            } else {
                print(".")
            }
        } else {
            print("Tidak memiliki referensi.")
        }
        print("\n\n")
    }
}
