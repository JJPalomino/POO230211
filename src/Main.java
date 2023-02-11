import com.palomino.metodos.Clase01;
import com.palomino.metodos.Clase02;
import com.palomino.metodos.Clase03;

public class Main {
    /*public static void main(String[] args) {

        System.out.println("Hello world!");

        Clase01 clase01 = new Clase01();
        clase01.saludar();
    }*/
    public static void main(String[] args){
        Clase03.registrar();
    }
    public static void traerMetododeClase02(){
        Clase02 clase02 = new Clase02();
        clase02.ejecutar();
    }
}