'''
Created on 26 feb. 2019
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
de la primera. Para la clase Vehiculo, crea los atributos de clase
vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
kilometrosRecorridos. Crea también algún método específico para cada una de
las subclases. Prueba las clases creadas mediante un programa con un menú
como el que se muestra a continuación:
VEHÍCULOS ========= 1. Anda con la bicicleta 2. Haz el caballito con la
bicicleta 3. Anda con el coche 4. Quema rueda con el coche 5. Ver kilometraje
de la bicicleta 6. Ver kilometraje del coche 7. Ver kilometraje total 8.
Salir Elige una opción (1-8):
@author: Álvaro Leiva Toledano
'''


class Vehiculo:
    
    # atributos de la clase
    contadorVehiculos = 0
    kmTotales = 0
    
    # Constructor de la clase vehiculo
    def __init__(self):
        self.km = 0
        self.contadorVehiculos += 1
        
    # getter de los kilometros totales de todos los vehiculos
    def getKmTotales(self):
        return Vehiculo.kmTotales
    
    # getter de kilometros del vehiculo
    def getKM(self):
        return self.km
    
    def anda(self, kilometros):
        self.km += kilometros
        Vehiculo.kmTotales += kilometros


class Bicicleta(Vehiculo):
    
    tipoFrenos = "por defecto"
    
    def __init__(self, frenos):
        Vehiculo.__init__(self)
        self.tipoFrenos = frenos
        
    def hacerCaballito(self):
        print("¡La bicicleta está haciendo el caballito!")

        
class Coche(Vehiculo):
    
    color = "blanco"
    
    def __init__(self, color):
        Vehiculo.__init__(self)
        self.color = color
        
    def quemarRueda(self):
        print("¡Chechuuu haz un derrapeee!")

        
def mostrarMenu():
    print("Menú de opciones")
    print("----------------")
    print("1. Introducir KM Bicicleta")
    print("2. Hacer Caballito.")
    print("3. Introducir KM Coche.")
    print("4. Quemar Rueda")
    print("5. Km total con la Bicicleta")
    print("6. Km total con el Coche.")
    print("7. Km total con los Vehiculos.")
    print("8. Terminar.")

    
if __name__ == "__main__":
    
    coche1 = Coche("rojo")
    bicicleta1 = Bicicleta("pastilla")
    
    while True:
        mostrarMenu()
        opcion = input("Indica la opción: ")
    
        if opcion == "1":
            km = int(input("Introduce los KM recorridos con la bicicleta: \n"))
            bicicleta1.anda(km)
        elif opcion == "2": 
            bicicleta1.hacerCaballito()
        elif opcion == "3":
            km = int(input("Introduce los KM recorridos con su coche: \n"))
            coche1.anda(km)
        elif opcion == "4": 
            coche1.quemarRueda()
        elif opcion == "5":
            print("Ha recorrido ", bicicleta1.getKM(), " kms con su bicicleta.")
        elif opcion == "6":
            print("Ha recorrido ", coche1.getKM(), " kms con su coche.")    
        elif opcion == "7":
            print("Ha recorrido ", Vehiculo.getKmTotales(), " kms en total.") 
        elif opcion == "8":
            print("Saliendo")
            break
