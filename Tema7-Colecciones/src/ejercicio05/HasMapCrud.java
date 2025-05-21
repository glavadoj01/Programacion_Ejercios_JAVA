package ejercicio05;

import java.util.HashMap;
import java.util.Map;

/*
Diseña un proyecto Java que permita añadir, borrar, buscar y listar un HashMap.
Las parejas del HashMap están formadas por DNI y nombre de personas (String).
*/

public class HasMapCrud {
    private final Map<String,String> miMap = new HashMap<>();


    public void create(String key, String value) {
        miMap.put(key, value);
    }

    public boolean borrar(String key){
        if (miMap.containsKey(key)) {
            miMap.remove(key);
            return true;
        }
        return false;
    }

    public String read(String key){
        return miMap.get(key);
    }

    public boolean update(String key, String value){
        if (miMap.containsKey(key)){
            miMap.put(key, value);
            return true;
        }
        return false;
    }

    public void printMap(){
        System.out.print("KEY\t\tVALUE");
        for (String key : miMap.keySet()) {
            System.out.print('\n'+key+"\t"+miMap.get(key));
        }
    }
}
