package com.example.friend_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var listFriends = arrayOf<String>("RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",
        "RASOANOMENJANAHARY Alphonsine", "RAHOLISOA Domoina", "lALAONIRINA Nirina", "RANDIMBINIRINA Mamitiana", "RAFIDY JULIE Tassia",)

    val adapter = ListAdapter(listFriends)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.friend_list_recyclerview) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}