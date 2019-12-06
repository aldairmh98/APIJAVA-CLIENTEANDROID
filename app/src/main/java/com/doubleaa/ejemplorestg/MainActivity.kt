package com.doubleaa.ejemplorestg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.doubleaa.ejemplorestg.HttpBodyPojos.TacoBodyPojo
import com.doubleaa.ourpeda.APIInterfaceRequest.IHostApiService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {











    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        guardarTaco()
        Toast.makeText(this,"Bienvenido",Toast.LENGTH_LONG).show()

        btnRegistrar.setOnClickListener {
            insertOne()
            Toast.makeText(this,"Ingresado",Toast.LENGTH_LONG).show()
        }

    }


    fun insertOne(){
        //INICIA POST
        var taco = TacoBodyPojo()
        taco.id_taco="uno"
        taco.nombre="uno"
        taco.precio="200.00"
        retrofitobj.createTaco(taco).enqueue(
            object : Callback<String> {
                override fun onFailure(call: Call<String>, t: Throwable) {
                    var t = Toast.makeText(this@MainActivity, "ERROR ADDING", Toast.LENGTH_LONG)
                    t.show()
                }

                override fun onResponse(call: Call<String>, response: Response<String>) {
                    if (response.isSuccessful()){
                        var t = Toast.makeText(this@MainActivity, "ADDED", Toast.LENGTH_LONG)
                        t.show()
                    }
                }

            }

        )

        // TERMINA POST
    }


    fun guardarTaco(){
        //INICIA POST
        val retrofit = Retrofit.Builder().addCallAdapterFactory(
        RxJava2CallAdapterFactory.create())
        .addConverterFactory(
            GsonConverterFactory.create())
        .baseUrl("http://192.168.1.76:8084/dummy/webresources/")
        .build();

        var retrofitobj = retrofit.create(IHostApiService::class.java)
        var newTaco = TacoBodyPojo()
        newTaco.nombre ="aldairmh4"
        newTaco.precio = "100"
        newTaco.id_taco = "trece"
        retrofitobj.createTaco(newTaco).enqueue(
            object : Callback<String> {
                override fun onFailure(call: Call<String>, t: Throwable) {
                    var t = Toast.makeText(this@MainActivity, "ERROR ADDING", Toast.LENGTH_LONG)

                }
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    if (response.isSuccessful()){
                        var t = Toast.makeText(this@MainActivity, "ADDED", Toast.LENGTH_LONG)
                        t.show()
                    }
                }

            }

        )

        // TERMINA POST

    }












}
