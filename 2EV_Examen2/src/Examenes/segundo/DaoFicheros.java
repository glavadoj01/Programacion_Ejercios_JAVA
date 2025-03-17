package Examenes.segundo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DaoFicheros {

    public List<Servicios> leerServicios() {
        List<Servicios> ls = new ArrayList<>();
        int idServicio,id, numeroSensores;
        String nombre, cliente, tipo;
        LocalDate fecha_inicio;
        double metrosCuadrados, precioMetroCuadrado;
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/Examenes/segundo/servicios.csv"), StandardCharsets.UTF_8);
            for (String s : lines) {
                String[] parts = s.split(",");
                tipo=parts[0];
                idServicio = Integer.parseInt(parts[1]);
                id = Integer.parseInt(parts[2]);
                nombre = parts[3];
                Empleado t = new Empleado(id, nombre);
                fecha_inicio = LocalDate.parse(parts[4], Util.FORMATO);
                cliente = parts[5];
                if(tipo.equals("RevisionAlarma")){
                    numeroSensores = Integer.parseInt(parts[6]);
                    ls.add(new RevisionAlarma(idServicio,t, fecha_inicio, cliente, numeroSensores));
                }else{
                    metrosCuadrados = Double.parseDouble(parts[6]);
                    precioMetroCuadrado = Double.parseDouble(parts[7]);
                    ls.add(new TrabajoPintura(idServicio,t, fecha_inicio, cliente, metrosCuadrados,precioMetroCuadrado));
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();


        }
        return ls;
    }

    public void guardarServicio(List<String> lp) {
        try {

            Files.write(Paths.get("src/Examenes/segundo/servicios.csv"), lp, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}