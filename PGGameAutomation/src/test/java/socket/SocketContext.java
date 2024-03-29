package socket;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class SocketContext {
     private String URI;
     private String expectedMessage;
     private Map <String,String> requestHeaders = new HashMap<>();
     private List<String> massageList = new ArrayList<>();
     private int statusCode;
     private int timeOut = 10;
     private int timeToken;
     private String body;
     private Runnable runnable;
}
