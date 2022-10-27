package id.tutorials.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMhs: RecyclerView
    private val list = ArrayList<Mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMhs = findViewById(R.id.rv_mahasiswa)
        rvMhs.setHasFixedSize(true)

        list.addAll(MhsData.listData)
        showRecyclerView()
    }

    private fun showRecyclerView(){
        rvMhs.layoutManager = LinearLayoutManager(this)
        val lisMhsAdapter = MhsAdapter(list)
        rvMhs.adapter = lisMhsAdapter
    }

}