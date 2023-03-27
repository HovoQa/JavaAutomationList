package socket;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class BodyToken {

    public void autoModel(){

        Gson gson = new Gson();
        Map<String,String>  params = new HashMap<>();

        params.put("client_secret","secret");
        params.put("client_id","launcher-client");
        params.put("grant_type","custom");
        params.put("scope","launcher.api");
        params.put("AuthModelSerialized", gson.toJson(AuthModel.class));
    }
}
