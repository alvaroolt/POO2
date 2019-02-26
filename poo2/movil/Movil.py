from poo2.terminal import Terminal
import sys
'''
Created on 26 feb. 2019
Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
decimales, puedes utilizar DecimalFormat.
@author: Álvaro Leiva Toledano
@version: 
'''

class Movil(Terminal):
    
    #constructor
    def __init__(self, id, tarifa):
        
        super().__init__(id)
        self.tarifa = tarifa
        
        if self.compruebaTarifa() == False:
            print("Tarifa introducida errónea. El programa va a finalizar.")
            sys.exit()
        
        
    # getter
    def getTarifa(self):
        return self.tarifa
    
    # comprueba si la tarifa introducida es válida
    def compruebaTarifa(self):
        if ((self.getTarifa() != "rata") and (self.getTarifa() != "mono") and (self.getTarifa() != "bisonte")):
            return False
        else:
            return True
        
    # getter que obtiene el coste de la tarifa
    def getCoste(self):
        #DecimalFormat formato = new DecimalFormat("###.##");
        #He de aclarar que 0.001, 0.002 y 0.005 son los precios de las tarifas
        #(pero en segundos, no minutos)
        if self.tarifa == "rata":
            return 0.001 * self.getSegundosCoste() + "€"
        elif self.tarifa == "mono":
            return 0.002 * self.getSegundosCoste() + "€"
        elif self.tarifa == "bisonte":
            return 0.005 * self.getSegundosCoste() + "€"
        else:
            return "Hubo algún error."
    
    def __str__(self):
        mensaje = " - tarificados " + str(self.getCoste())
        return Terminal.__str__(self) + mensaje