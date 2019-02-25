'''
Created on 25 feb. 2019
Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos.
@author: Álvaro Leiva Toledano
'''

class Terminal:
    
    # constructor
    def __init__(self, id):
        self.id = id
        
    # setter número de terminal
    def setId(self, id):
        self.id = id;
        
    # getter identificador
    def getId(self):
        return self.identificador
    
    # setter de tiempo transcurrido en llamada
    def setTiempo(self, t):
        self.tiempoConversacion = t

    # getter de tiempo (en segundos)
    def getTiempo(self):
        return self.tiempoConversacion
    
    '''
    método que establece una llamada entre dos instancias de Terminal
    y les añade segundos de conversación
    '''
    def llama(self, Terminal, segundos):
        self.tiempoConversacion += segundos;
        Terminal.setTiempo(Terminal.getTiempo(self) += segundos)
        
    def __str__(self):
        return ("Nº " + self.getId() + " - " + self.getTiempo() + "s de conversación")