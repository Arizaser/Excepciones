package ejercicio2Excep;

public class GatoSimple {
//atributos /////////////////////////////
	String color, raza, sexo;
	int edad;
	double peso;


//constructor
	GatoSimple(String s) {
		this.sexo = s;
	}

//getter
	String getSexo() {
		return this.sexo;
	}

	/**
	 * Hace que el gato maulla
	 */
	
	void maulla() {
		System.out.println("Miauuuu");
	}

	/**
	 * Hace que el gato ronronee
	 */
	void ronronea() {
		System.out.println("mrrrrrr");
	}

	/**
	 * Hace que el gato coma. A los gatos les gusta el pescado, si le damos otra
	 * comida la rechazar�.
	 *
	 * @param comida la comida que se le ofrece al gato
	 */
	
	
	void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Hmmmm, gracias");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}

	/**
	 * Pone a pelear dos gatos. Solo se van a pelear dos machos entre s�.
	 *
	 * @param contrincante es el gato contra el que pelear
	 */
	void peleaCon(GatoSimple contrincante) {
		if (this.sexo.equals("hembra")) {
			System.out.println("no me gusta pelear");
		} else {
			if (contrincante.getSexo().equals("hembra")) {
				System.out.println("no peleo contra gatitas");
			} else {
				System.out.println("ven aqu� que te vas a enterar");
			}
		}
	}
	
	/**
	 * Modifica la clase Gato vista anteriormente a�adiendo el m�todo apareaCon.
	 * Este m�todo debe comprobar que los gatos son de distinto sexo, tras lo cual,
	 * genera un nuevo gato. Por ejemplo, ser�a v�lido algo como Gato cria =
	 * garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
	 * m�todo debe generar la excepci�n ExcepcionApareamientoImposible. Crea un
	 * programa desde el que se pruebe el m�todo.
	 * @throws ImposibleApareamientoExc 
	 * 
	 */
	GatoSimple apareaCon(GatoSimple nuevoGato) throws ImposibleApareamientoExc {
		if(this.sexo.equals(nuevoGato.sexo)) {
			throw new ImposibleApareamientoExc("Apareamiento imposible");
		}
		String[] sexo= {"macho","hembra"};
		String s=sexo[(int) Math.random() * 2];
		return new GatoSimple(s);
		
	}

	@Override
	public String toString() {
		return "Sexo: " + sexo;
	}
	
}