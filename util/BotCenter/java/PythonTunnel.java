import java.io.IOException;
import network.Connection;

public class PythonTunnel {

    private Connection connection;

    public PythonTunnel(Connection connection) {
        this.connection = connection;
    }

    public String predictStrongestBot(String action, int usX, int usY, int opponentX, int opponentY) {

        connection.sendObject("func_predictStrongestBot_5");
        connection.sendObject(action);
        connection.sendObject(usX);
        connection.sendObject(usY);
        connection.sendObject(opponentX);
        connection.sendObject(opponentY);

        try {
            return connection.getInputStream().readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
