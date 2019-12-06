package com.doubleaa.ourpeda.APIInterfaceRequest

import com.doubleaa.ejemplorestg.HttpBodyPojos.TacoBodyPojo
import retrofit2.Call
import retrofit2.http.*

interface IHostApiService {

    @POST("dummy")
    fun createTaco(@Body body: TacoBodyPojo): Call<String>


    /* @GET("autos")
     fun getHosts(): Call< ArrayList<AutoResponse> >

     @POST("autos")
     fun createAuto(@Body body: AutoBodyPojo): Call<String>

     @GET("autos/{id}")
     fun getHostById(@Path("id") id : String): Call<AutoResponse>

     @PUT("autos/{id}")
     fun updateHost(@Path("id") id : String, @Body body:AutoBodyPojo): Call<String>

     @DELETE("autos/{id}")
     fun deleteHost(@Path("id") id : String): Call<String>


     @POST("catalogos/ninas")
     fun createNina(@Body body: NinaBodyPojo): Call<String>



 ----------------------------Pedas-----------------------

     @GET("pedas")
     fun getPedas(): Call< ArrayList<PedaResponse> >

     @POST("pedas")
     fun createPeda(@Body body: PedaBody): Call<String>

     @GET("pedas/{id}")
     fun getPedaById(@Path("id") id : String): Call<PedaResponse>

     @PUT("pedas/{id}")
     fun updatePeda(@Path("id") id : String, @Body body:PedaBody): Call<String>

     @DELETE("pedas/{id}")
     fun deletePeda(@Path("id") id : String): Call<String>

 /*---------------INVITADOS--------------------------------*/
     @GET("usuarios")
     fun getInvitados(): Call< ArrayList<InvitadoResponse> >

     @POST("usuarios")
     fun createInvitado(@Body body: InvitadoBodyPojo): Call<String>

     @GET("usuarios/{id}")
     fun getInvitadoById(@Path("id") id : String): Call<InvitadoResponse>

     @PUT("usuarios/{id}")
     fun updateInvitado(@Path("id") id : String, @Body body:InvitadoBodyPojo): Call<String>

     @DELETE("usuarios/{id}")
     fun deleteInvitado(@Path("id") id : String): Call<String>
 */



}