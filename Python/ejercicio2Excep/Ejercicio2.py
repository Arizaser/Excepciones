'''
Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo
cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
= garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.
'''

from ejercicio2Excep.Gato import Gato

garfield=Gato("M")
toby=Gato("M")

try:
    garfield.apareaCon(toby)
except Exception as e:
    print(e)