package BD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import Clases.Usuario;

public class ManagerFitnesRepositorio {
	
	public static void crearUsuario(Usuario Usuario1){		
		try {

			URL url = new URL("http://projectx.j.facilcloud.com/app/rest/Usuarios/"+Usuario1.getId()+"/"+Usuario1.getNombre()+"/"+Usuario1.getDireccion()+"/"+Usuario1.gettelefono()+"/"+Usuario1.getCorreo()+"/"+Usuario1.getPassword()+"/"+Usuario1.getFecha());
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

	}


