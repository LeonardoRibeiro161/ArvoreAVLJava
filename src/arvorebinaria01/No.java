
package arvorebinaria01;

public class No {
    
    //Atributos
    private int valor;
    private No noDireta;
    private No noEsquerda;
    
    
    No (int valorNo, No noE, No noD){
        this.valor = valorNo;
        this.noDireta = noD;
        this.noEsquerda = noE;
    }
    
    
    public static void arvorePreOrdem(No noArvore)
    {
        System.out.print(noArvore.valor + " ");
        if(noArvore.noEsquerda != null)
        {
            arvorePreOrdem(noArvore.noEsquerda);
        }
        if(noArvore.noDireta != null)
        {
            arvorePreOrdem(noArvore.noDireta);
        }
    }
    
    public static void arvoreEmOrdem(No noArvore)
    {
      
        if(noArvore.noEsquerda != null)
        {
            arvoreEmOrdem(noArvore.noEsquerda);
        }
        System.out.print(noArvore.valor + " ");
        if(noArvore.noDireta != null)
        {
            arvoreEmOrdem(noArvore.noDireta);
        }
        
    }
    public static void arvorePosOrdem(No noArvore)
    {
      
        if(noArvore.noEsquerda != null)
        {
            arvorePosOrdem(noArvore.noEsquerda);
        }
        
        if(noArvore.noDireta != null)
        {
            arvorePosOrdem(noArvore.noDireta);
        }
        System.out.print(noArvore.valor + " ");
        
    }
    
}
