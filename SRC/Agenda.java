import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Agenda {
    private String nombre;
    private Map<Contacto, List<ItemDeInformacion>>listadecontactos=new Map<Contacto, List<ItemDeInformacion>>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public List<ItemDeInformacion> get(Object key) {
            return null;
        }

        @Override
        public List<ItemDeInformacion> put(Contacto key, List<ItemDeInformacion> value) {
            return null;
        }

        @Override
        public List<ItemDeInformacion> remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends Contacto, ? extends List<ItemDeInformacion>> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<Contacto> keySet() {
            return null;
        }

        @Override
        public Collection<List<ItemDeInformacion>> values() {
            return null;
        }

        @Override
        public Set<Entry<Contacto, List<ItemDeInformacion>>> entrySet() {
            return null;
        }
    }






    }
}
