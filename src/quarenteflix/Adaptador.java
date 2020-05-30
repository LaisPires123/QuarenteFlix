
package quarenteflix;


public class Adaptador extends SmartTV implements Dispositivo {

    @Override
    public void carregarFilme() {
        
        this.verificarRede();
        this.carregarAplicação();
   }

    @Override
    public void pesquisarFilme() {
        
        this.verificarRede();
        this.pesquisarfilme();
    }

    @Override
    public void assistirFilme() {
        
        this.verificarRede();
        this.assistirfilme();
        
        
    }
    
}
