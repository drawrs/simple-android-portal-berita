package com.khilman.www.aplikasiportalberita.network;

import com.khilman.www.aplikasiportalberita.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rizal Hilman on 12/02/18.
 * www.khilman.com
 */

public interface ApiServices {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita.php")
    Call<ResponseBerita> request_show_all_berita();
    // <ModelData> nama_method()

}
