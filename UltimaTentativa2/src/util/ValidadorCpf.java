package util;

public class ValidadorCpf {

	public String validadorCpf(String cpf) {
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || cpf.length() != 11) {
			return "Inválido";
		} else {
			int soma = 0;
			int peso = 10;
			int num, r;
			char dig10, dig11;

			// Calculo do 1o. Digito Verificador

			for (int i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (cpf.charAt(i) - 48);
				soma = soma + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (soma % 11);

			if ((r == 10) || (r == 11)) {
				dig10 = '0';
			} else {
				// converte no respectivo caractere numerico
				dig10 = (char) (r + 48);
			}

			// Calculo do 2o. Digito Verificador

			soma = 0;
			peso = 11;
			for (int i = 0; i < 10; i++) {
				num = (int) (cpf.charAt(i) - 48);
				soma = soma + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (soma % 11);

			if ((r == 10) || (r == 11)) {
				dig11 = '0';
			}

			else {
				dig11 = (char) (r + 48);
			}

			// Verifica se os digitos calculados conferem com os digitos informados.

			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
				return "Válido";
			}

			else {
				return "Inválido";
			}

		}

	}

}
