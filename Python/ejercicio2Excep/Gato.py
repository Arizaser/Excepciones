'''
Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo
cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
= garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.
'''

class Gato():
    def __init__(self, s):
        self.__sexo = s

    def apareaCon(self, gato):
        if self.__sexo == gato.__sexo:
            raise Exception("No pueden aparearse dle mismo sexo")