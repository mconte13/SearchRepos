package ApiRequest
import com.mcf.searchrepos.Home.HomePresenterProtocol
import com.mcf.searchrepos.Home.RepoModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*
import io.reactivex.Observable
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

interface ApiRequest {
    @GET("repositories")
    fun search(@Query("q") query: String) : Observable<RepoModel>

    companion object Factory {
        fun create(): ApiRequest {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/search/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

            return retrofit.create(ApiRequest::class.java);
        }
    }
}
