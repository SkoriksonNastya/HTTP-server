import java.io.BufferedOutputStream;
import java.io.IOException;

@FunctionalInterface
public interface Handler {

    void handled(Request request, BufferedOutputStream response) throws IOException;
}
