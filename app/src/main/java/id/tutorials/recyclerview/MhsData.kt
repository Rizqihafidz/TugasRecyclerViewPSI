package id.tutorials.recyclerview

object MhsData {
    private  val mhsName = arrayOf(
        "Rizqi Maulana Hafidz",
        "Frisca Putri Ayu Febriyanti",
        "Salsabila Dita Prasetya",
        "Rizqi Maulana Hafidz",
        "Frisca Putri Ayu Febriyanti",
        "Salsabila Dita Prasetya",
        "Rizqi Maulana Hafidz",
        "Frisca Putri Ayu Febriyanti",
        "Salsabila Dita Prasetya"
    )

    private val mhsDeskripsi = arrayOf(
        "NIM: 205150200111027" +
                "\nMerupakan mahasiswa Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150200111030" +
                "\nMerupakan mahasiswi Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150201111024" +
                "\nMerupakan mahasiswi Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150200111027" +
                "\nMerupakan mahasiswa Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150200111030" +
                "\nMerupakan mahasiswi Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150201111024" +
                "\nMerupakan mahasiswi Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150200111027" +
                "\nMerupakan mahasiswa Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150200111030" +
                "\nMerupakan mahasiswi Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika.",
        "NIM: 205150201111024" +
                "\nMerupakan mahasiswi Universitas Brawijaya Fakultas Ilmu Komputer Program Studi Teknik Informatika."
    )

    private val mhsPhoto = intArrayOf(
        R.drawable.rizqi,
        R.drawable.frisca,
        R.drawable.salsa,
        R.drawable.rizqi,
        R.drawable.frisca,
        R.drawable.salsa,
        R.drawable.rizqi,
        R.drawable.frisca,
        R.drawable.salsa
    )

    val listData: ArrayList<Mahasiswa>
    get() {
        var list = arrayListOf<Mahasiswa>()
        for (position in mhsName.indices){
            val mahasiswa = Mahasiswa()
            mahasiswa.name = mhsName[position]
            mahasiswa.deskripsi = mhsDeskripsi[position]
            mahasiswa.photo = mhsPhoto[position]
            list.add(mahasiswa)
        }
        return list
    }

}