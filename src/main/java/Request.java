import java.util.Map;

public class Request {

    private final String method;
    private final String path;
    private String body;
    private final Map<String, String> headers;

    public Request (String method, String path, String body, Map<String, String> headers){
        this.method = method;
        this.path = path;
        this.headers = headers;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getHeaders(){
        return headers;
    }
}
