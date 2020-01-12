package isep.fr.collegeinformationsystem;
public class Constants {

    public static final String POST = "POST";
    public static final String GET = "GET";


    //** Main Url ** //
    private static final String GET_DATA_URL = "http://192.168.0.2:8080/collage/";
    //root url
    private static final String ROOT_URL = GET_DATA_URL + "services/";

    private static final String GET_DATA_SERVER_URL = GET_DATA_URL + "static/";

    //img url
    public static final String IMG_URL = GET_DATA_SERVER_URL + "profile_images/";

    //documents download url
    public static final String MSG_DOWNLOAD_DOC_URL = GET_DATA_SERVER_URL + "docs/";

    //register user
    public static final String REGISTER_URL = ROOT_URL + "createUser";
    public static final String UPDATE_USER = ROOT_URL + "updateUser";
    public static final String UNIQUE_USER = ROOT_URL + "uniqueUserName";
    public static final String UPDATE_UNAME_URL = ROOT_URL + "updateUserName";
    public static final String UPLOAD_IMG_URL = ROOT_URL + "imageUpload";
    public static final String GET_REG_NUMBERS = ROOT_URL + "allRegisteredUsers";
    public static final String GET_BASED_USERID_DETAILS = ROOT_URL + "userDetails";
    public static final String SEND_MESSAGE = ROOT_URL + "createMessage";
    public static final String SEND_GROUP_MSGS = ROOT_URL + "groupMessage";




    //database create tables
    public static final String APP_ALL_USERS = "app_users_data";


    //table variables
    public static final String ID = "autogenerated_id";
    public static final String USER_LOCAL_ID = "user_id";
    public static final String USER_U_NAME = "user_name";
    public static final String USER_TYPE = "user_type";
    public static final String USER_MAIL = "user_mail";
    public static final String USER_DEPT = "user_dept";
    public static final String USER_PRFLE_IMG = "user_profile";



    public static final String SP_USER_ID = "user_Id";


}
