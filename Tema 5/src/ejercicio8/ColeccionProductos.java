package ejercicio8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ColeccionProductos {
	List<Producto> listaP;

    public ColeccionProductos(int numeroProductos) {
    	this.listaP = cargarProductos(numeroProductos);
    }
    
    //retornar array de productos
    public List<Producto> getProductos(){
    	return listaP;
    }
    
	//modificar Tª de congelación de un producto buscando por su id
    public boolean modificarTemperaturaCongelacion(String id, double temp){
    	for (Producto p : listaP) {
            if(p.getIdProducto().equals(id) && p.getClass() == Congelado.class){
                ((Congelado) p).setTemperaturaCon(temp);
                return true;
            }
        }
        return false;
    }
    
    
    //retornar array de frescos de un pa�s concreto
    public List<Fresco> consultarProductosPorPaisOrigen(String paisBuscado){
        List<Fresco> listaSalida = new ArrayList<>();
        for (Producto p : listaP) {
            if(p.getClass() == Fresco.class && ((Fresco) p).getPaisOrigen().equals(paisBuscado)){
                listaSalida.add((Fresco) p);
            }
        }
        return listaSalida;
    }
    
    
// 
    //retornar array de productos caducados 
    public List<Producto> consultarProductosCaducados(){
        List<Producto> listaSalida = new ArrayList<>();
        for (Producto p : listaP) {
            if(p.getFechaCad().isBefore(LocalDate.now())){
                listaSalida.add(p);
            }
        }
        return listaSalida;
    }

    //    //obtener array de productos de un tipo/clase
    public List<Producto> obtenerProductosDelTipo (String tipo) {
        List<Producto> listaSalida = new ArrayList<>();
        for (Producto p : listaP) {
            if (p.getClass().getSimpleName().equals(tipo)) {
                listaSalida.add(p);
            }
        }
        return listaSalida;
    }

    private List<Producto> cargarProductos(int numeroProductos) {
        List<Producto> listaGenear = new ArrayList<>();
        String [] paises = {"España", "Italia", "Marruecos", "Argelia", "Francia"};
        String id, descripcion, codigo, paisO;
        int lote, tipo;
        double tempC;
        LocalDate fechaC, fechaE;

        for (int i = 0; i < numeroProductos; i++) {
            id= "00000" + i;
            descripcion = "Producto-" + i;
            fechaC = LocalDate.of(2025, 3, 3);
            lote = 123422*i;
            tipo = (int) (Math.random()*3);
            switch (tipo) {
                case 0:
                    //Congelado
                    tempC = -5.0 * i;
                    listaGenear.add(new Congelado(tempC, id, descripcion, fechaC, lote));
                    break;
                case 1:
                    //Refrigerado
                    codigo = "ABC-"+i;
                    listaGenear.add(new Refrigerado(codigo, id, descripcion, fechaC, lote));
                    break;
                case 2:
                    //Fresco
                    fechaE = LocalDate.now();
                    fechaE.minusDays(5);
                    paisO = paises[(int)(Math.random()*5)];
                    listaGenear.add(new Fresco(fechaE, paisO, id, descripcion, fechaC, lote));

            }
        }
        //Hago caducar el primer producto
        listaGenear.getFirst().setFechaCad(LocalDate.now().minusDays(30));
        return listaGenear;
    }
}
