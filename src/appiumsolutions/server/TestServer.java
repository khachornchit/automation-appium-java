package appiumsolutions.server;

import java.io.IOException;

public class TestServer {
	public void Start() throws IOException, InterruptedException {
        String[] cmd = { "C:\\Appium\\node_modules\\.bin\\appium.cmd", "--address 127.0.0.1", "--port 5000" };
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
	}
}