package arvorebinaria01;

public class ArvoreBinaria01 {

   
    public static void main(String[] args) {
        No minhaArvore = new No(25, new No(12, null,
                null),new No(30, new No(28, null, null), 
                        new No(35,null,null)));
        
        System.out.print("--> Arvore Pre-Ordem:");
        No.arvorePreOrdem(minhaArvore);
        System.out.println("\n----------------------------------");
        
        System.out.println("--> Arvore Em Ordem:");
        No.arvoreEmOrdem(minhaArvore);
        System.out.println("\n----------------------------------");
        
         System.out.println("--> Arvore Pos Ordem:");
        No.arvorePosOrdem(minhaArvore);
        System.out.println("\n----------------------------------");
    }
    
}
