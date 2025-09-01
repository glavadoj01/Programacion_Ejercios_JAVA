package examen;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Operativa {
    List<String> listaSql;
    List<String> listaParams;
    AccesoBdatos bd;
    List<Producto> listaP;

    public Operativa(){
        listaSql = new ArrayList<>();
        listaParams = new ArrayList<>();
        bd = new  AccesoBdatos();
        listaP = new ArrayList<>();
    }

    public void cargaDatosFicheros(){
        AccesoFicheros af = new AccesoFicheros();
        listaSql = af.leerFicheroSql("src/examen/sql1.txt");
        listaParams = af.leerFicheroSql("src/examen/parametros.txt");
    }

    public void ejecutaInsertar(){
        String sql = listaSql.get(0);
        String[] params = listaParams.get(0).split(",");

        int n = bd.ejecutaInsert(sql, params);
        System.out.println("Filas insertadas: " + n);
    }
    public void ejecutaActualizar(){
        String sql = listaSql.get(1);
        String[] params = listaParams.get(1).split(",");

        int n =  bd.ejecutaUpdate(sql, params);
        System.out.println("Filas actualizadas: " + n);
    }
    public void ejecutaConsulta(){
        ResultSet rs = null;

        String sql = listaSql.get(2);
        String[] params = listaParams.get(2).split(",");

        rs = bd.ejecutaSelect(sql, params);
        try {
            while (rs.next()) {

                listaP.add(new Producto(rs.getString("productCode"), rs.getString("productName"),
                        rs.getString("productLine"), rs.getString("productScale"), rs.getString("productVendor"),
                        rs.getString("productDescription"), rs.getInt("quantityInStock"), rs.getDouble("buyPrice"),
                        rs.getDouble("MSRP")));

            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el ResultSet: " + e.getMessage());
            }
        }
    }

    public void creaMapa(){
        Map<String, String> mapaP = new HashMap<>();

        for (Producto p : listaP) {
            if(p.getCategoriaProducto().equals("Classic Cars")){
                mapaP.put(p.getCodigoProducto(), p.getNombreProducto());
            }
        }
        /*for (Map.Entry<String, String> entry : mapaP.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }*/
        for (String clave : mapaP.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapaP.get(clave));

        }
    }
}
