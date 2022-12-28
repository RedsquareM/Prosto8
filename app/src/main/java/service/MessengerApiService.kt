package service



import data.remote.request.LoginRequestObject
import data.remote.request.MessageRequestObject
import data.remote.request.StatusUpdateRequestObject
import data.remote.request.UserRequestObject
import data.vo.ConversationVO
import data.vo.MessageVO
import data.vo.UserListVO
import data.vo.UserVO
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface MessengerApiService {
    @POST("login")
    @Headers("Content-Type: application/json")
    fun login(@Body user: LoginRequestObject): Observable<Response<ResponseBody>>

    @POST("users/registrations")
    fun createUser(@Body user: UserRequestObject): Observable<UserVO>

    @GET("users")
    fun listUsers(@Header("Authorization") authorization: String):
                  Observable<UserListVO>

    @PUT("users")
    fun updateUserStatus (
        @Body request: StatusUpdateRequestObject,
        @Header("Authorization") authorization: String): Observable<UserVO>

    @GET("users/{userId}")
    fun showUser(
        @Path(userId) userId: Long,
        @Header("Authorization") authorization: String): Observable<UserVO>

    @GET("users/details")
    fun echoDetails(@Header("Authorization") authorization: String):
                    Observable<UserVO>

    @POST("messages")
    fun createMessage(
    @Body messageRequestObject: MessageRequestObject,
    @Header("Authorization") authorization: String): Observable<MessageVO>

    @GET("conversations")
    fun listConversations(@Header("Authorization") authorization: String):
                          Observable<ConversationVO>

    @GET("conversations/{conversationId}")
    fun showConversation (
        @Path("conversationId") conversationId: Long,
        @Header("Authorization") authorization: String) : Observable<ConversationVO>




}