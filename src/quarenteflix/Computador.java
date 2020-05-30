
package quarenteflix;


public class Computador implements Dispositivo {

    @Override
    public void carregarFilme() {
        
        System.out.println("Computador: Carreagando filme...");
  }

    @Override
    public void pesquisarFilme() {
        
        System.out.println("Computador: Pesquisando filme...");
        
    }

    @Override
    public void assistirFilme() {
        
        System.out.println("Computador: Assistindo filme...");
        
   }
    
}
