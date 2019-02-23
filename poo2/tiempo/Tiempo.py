'''
Created on 23 feb. 2019
Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.

@author: Álvaro Leiva Toledano
'''


class Tiempo:
    
    # constructor
    def __init__(self, horas, minutos, segundos):
        self.horas = horas
        self.minutos = minutos
        self.segundos = segundos
        
    # setter
    def setHoras(self, h):
        self.horas = h    
    
    # getter
    def getHoras(self):
        return self.horas
    
    # setter
    def setMinutos(self, m):
        self.minutos = m
        
    # getter
    def getMinutos(self):
        return self.minutos
    
    # setter
    def setSegundos(self, s):
        self.segundos = s
        
    # getter
    def getSegundos(self):
        return self.segundos
    
    # el tiempo (h m s) en segundos (s)
    def getSegundosTotales(self):
        return self.horas * 3600 + self.minutos * 60 + self.segundos
    
    # método que recoge las horas, minutos y segundos a sumar al tiempo establecido
    # en nuestra instancia de tiempo.
    def suma(self):

        sumaHoras = int(input("Horas a sumar: "))
        sumaMinutos = int(input("Minutos a sumar: "))
        sumaSegundos = int(input("Segundos a sumar: "))
        
        # el tiempo a sumar, pero en segundos
        sumaTotalSegundos = sumaHoras * 3600 + sumaMinutos * 60 + sumaSegundos
        
        # el tiempo a sumar añadido al tiempo establecido en la instancia anteriormente
        resultadoEnSegundos = sumaTotalSegundos + self.getSegundosTotales()

        # ordena los segundos en horas, minutos y segundos
        self.ordenaTiempo(resultadoEnSegundos)
        
    # método que recoge las horas, minutos y segundos a restar al tiempo
    # establecido en nuestra instancia de tiempo.
    def resta(self):

        restaHoras = int(input("Horas a restar: "))
        restaMinutos = int(input("Minutos a restar: "))
        restaSegundos = int(input("Segundos a restar: "))

        restaTotalSegundos = restaHoras * 3600 + restaMinutos * 60 + restaSegundos
        resultadoEnSegundos = self.getSegundosTotales() - restaTotalSegundos

        self.ordenaTiempo(resultadoEnSegundos)
        
    def ordenaTiempo(self, segundos):
        contadorHoras = 0
        contadorMinutos = 0
        while (segundos > 3600):
            segundos -= 3600
            contadorHoras += 1
        self.setHoras(contadorHoras)

        while (segundos < 3600 and segundos > 60):
            segundos -= 60
            contadorMinutos += 1
        self.setMinutos(contadorMinutos)

        self.setSegundos(segundos)
        
    def __str__(self):
                return str(self.getHoras()) + "h " + str(self.getMinutos()) + "min " + str(self.getSegundos()) + "s."
'''
cronometro1 = Tiempo(1, 30, 20)
print(cronometro1)

cronometro1.suma()
print(cronometro1)

cronometro1.resta()
print(cronometro1)
'''