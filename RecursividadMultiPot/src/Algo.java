/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar
 */
public class Algo {
    
    int potencia = 1;
    int potenciando = 1;
    int aux = 1;
    int aux2 = potenciando*potencia;
    int resultado;
    
    public int Potenciar (int potenciando, int potencia)
    {
        if (aux <= potencia)
        {    
            aux2 *= potenciando;
        }
        
        else
        {
            return resultado;
        }
            resultado = aux2;
            aux++;
            
        return Potenciar(potenciando, potencia);
    }
    
}
