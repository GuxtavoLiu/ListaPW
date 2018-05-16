package util;

public class ConsultarLocalProva {

	public String localProva(String nome, String curso) {

		String primeiraLetra = nome.substring(0,1);

		if (curso.equals("tecnicoInformatica")) {
			return "Sala 22";
		} else if (curso.equals("tecnicoAlimentos")) {
			return "Sala 23";
		} else if (curso.equals("tecnicoAgropecuaria")) {

			if (primeiraLetra.equalsIgnoreCase("a") || primeiraLetra.equalsIgnoreCase("b")
					|| primeiraLetra.equalsIgnoreCase("c") || primeiraLetra.equalsIgnoreCase("d")
					|| primeiraLetra.equalsIgnoreCase("e") || primeiraLetra.equalsIgnoreCase("f")
					|| primeiraLetra.equalsIgnoreCase("g") || primeiraLetra.equalsIgnoreCase("h")
					|| primeiraLetra.equalsIgnoreCase("i") || primeiraLetra.equalsIgnoreCase("j")
					|| primeiraLetra.equalsIgnoreCase("k")) {

				return "Sala 11";

			} else if (primeiraLetra.equalsIgnoreCase("l") || primeiraLetra.equalsIgnoreCase("m")
					|| primeiraLetra.equalsIgnoreCase("n")) {

				return "Sala 12";

			} else if (primeiraLetra.equalsIgnoreCase("o") || primeiraLetra.equalsIgnoreCase("p")
					|| primeiraLetra.equalsIgnoreCase("q") || primeiraLetra.equalsIgnoreCase("r")
					|| primeiraLetra.equalsIgnoreCase("s") || primeiraLetra.equalsIgnoreCase("t")
					|| primeiraLetra.equalsIgnoreCase("u") || primeiraLetra.equalsIgnoreCase("v")
					|| primeiraLetra.equalsIgnoreCase("w") || primeiraLetra.equalsIgnoreCase("x")
					|| primeiraLetra.equalsIgnoreCase("y") || primeiraLetra.equalsIgnoreCase("z")) {

				return "Sala 13";
			} else {
				return "Candidato não encontrado.";
			}
		} else {
			return "Candidato não encontrado.2";
		}
	}
}
