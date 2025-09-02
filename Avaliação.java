public class Avaliação {

    public static void main(String[] args) {
    
          
        //Selection Sort
        int[] numeros = {19,11,9,34,22}; //Valor fixo no codigo

          for (int i = 0; i < numeros.length - 1; i++) { //usada para determinar o comprimento ou tamanho de um array
            int menor = i; //Supondo que o menor e o i
             for(int j = i + 1; j <numeros.length; j++) {
               if (numeros[j] < numeros[menor]) {
                 menor = j; // encontrou o numero menor
               }
             }
                //troca
               int temp = numeros[i];
                numeros[i] = numeros[menor];
                 numeros[menor] = temp;
          }
          //coloca o codigo correto no terminal
          System.out.println("Vetor Ordernado:");
           for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + ",");
           }
    }
}