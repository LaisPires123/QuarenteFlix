
package quarenteflix;



public class Cliente {

    
    public static void main(String[] args) {
 
        Dispositivo x1 = new Celular();
        x1.carregarFilme();
        x1.pesquisarFilme();
        x1.assistirFilme();
       
        System.out.println("-------------\n");
        
        Dispositivo x2 = new Computador();
        
        x2.carregarFilme();
        x2.pesquisarFilme();
        x2.assistirFilme();
        
        System.out.println("-------------\n");
        
        Dispositivo x3 = new Adaptador();
       
        x3.carregarFilme();
        x3.pesquisarFilme();
        x3.assistirFilme();
        
        
        
        
        
       
        
        
        
       
    }
    
}
