import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class NombreModeloCombo implements ComboBoxModel {

    ArrayList<String> datos;
    String selected;

    public NombreModeloCombo() {
        datos = new ArrayList<>();
    }

    public NombreModeloCombo(ArrayList<String> datos) {
        this.datos = datos;
    }



    @Override

    public void setSelectedItem(Object anItem) {

    }

    @Override
    public Object getSelectedItem() {
        return 0;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {


    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

}
