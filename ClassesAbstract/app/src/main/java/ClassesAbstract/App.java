/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ClassesAbstract;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Sofa meuSofa = new Sofa("azul","tecido");
        Mesa minhaMesa = new Mesa("Preta","metal");
        meuSofa.montar();
        meuSofa.desmontar();
        minhaMesa.montar();
        minhaMesa.desmontar();
    }
}
