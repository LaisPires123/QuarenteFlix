
package quarenteflix;


public class Celular implements Dispositivo {

    @Override
    public void carregarFilme() {
        
        System.out.println("Celular: Carreagando filme...");
        
    }

    @Override
    public void pesquisarFilme() {
    
        System.out.println("Celular: Pesquisando filme...");
    }

    @Override
    public void assistirFilme() {
        
        System.out.println("Celular: Assistindo filme...");
    
    }
    
    
    
}
