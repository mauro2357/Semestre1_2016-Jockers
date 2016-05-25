package BD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ManagerFitnesRepositorios {
	public void crearUsuario(String nombre){		
	try {

		URL url = new URL("http://localhost:8080/practice/rest/anuncios/880/"+nombre+"/ensayo");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	//	conn.setRequestMethod("GET");
	//	conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }

	}

public static void main(String[] args){
	new ManagerFitnesRepositorios().crearUsuario("juan");
	}
}