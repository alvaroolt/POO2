from poo2.terminal.Terminal import Terminal
'''
Created on 25 feb. 2019
Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos.
@author: Álvaro Leiva Toledano
'''

t1 = Terminal("678 11 22 33")
t2 = Terminal("644 74 44 69")
t3 = Terminal("622 32 89 09")
t4 = Terminal("664 73 98 18")

print(t1)
print(t2)

t1.llama(t2, 320)
t1.llama(t3, 200)

print(t1)
print(t2)
print(t3)
print(t4)