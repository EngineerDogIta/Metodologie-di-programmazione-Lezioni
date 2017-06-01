/**
 * Created by pietrocenciarelli on 19/05/17.
 */
public class MyAgente implements Agente {

    private String nome;

    public MyAgente(String nome){
        this.nome = nome;
    }

    public void azione () {
        System.out.println("Agente " + nome + " in azione!");
    }
}
