package socket;

import com.google.gson.Gson;

public class AuthModel {
    public Integer AuthScheme;
    public DataModel Data;

    public void authModel() {
        AuthModel authModel = new AuthModel();
        authModel.AuthScheme = 5;
        DataModel data = new DataModel();
        data.PlatformId = 24;
        data.PartnerId = 4;
        authModel.Data = data;
    }
}

class DataModel {
    public Integer PlatformId;
    public Integer PartnerId;
}
