package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    // membuat variabel berikut sesuai ketentuan
    val name: String = "M. Wiriawan Nasution"
    val firstName: String = "Muhammad"
    val lastName: String = "Nasution"
    val age: Int = 20
    val isSingle: Boolean = true

    // memanggil setiap variabel ke layar
    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Not Single"}")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return "Group details printed successfully."
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers = listOf("M. Wiriawan Nasution", "Meylia Herde", "Thoriq Ambia", "Vera Romandhon", "Hana Mardini",  "Jero Galih", "Safira Asari", "Adryan Eka", "Amalia", "Fajri Maulana", "Rifka Khairuna")
    println("List of Group Members: $groupMembers")

    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Reynaldi", "Malik")
    val countOfGroup = 11

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("11", listOf("M. Wiriawan Nasution", "Meylia Herde", "Thoriq Ambia", "Vera Romandhon", "Hana Mardini",  "Jero Galih", "Safira Asari", "Adryan Eka", "Amalia", "Fajri Maulana", "Rifka Khairuna"), "Morning Session")

}