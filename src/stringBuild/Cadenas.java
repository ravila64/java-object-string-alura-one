package stringBuild;

public class Cadenas implements CharSequence{
	public static void main(String[] args) {
		CharSequence cs=new StringBuilder("Tambien es una secuencia de caracteres!");
		System.out.println("Longitud "+cs.length());
		System.out.println("Un caracter de  "+cs+ " Es '"+cs.charAt(5)+"'");
		System.out.println("SubSequence  "+cs.subSequence(0,10));
		String texto=cs.toString();
		System.out.println("Cadena cs, contiene palabra  "+(texto.contains("secuencia")?"Si":"No"));
		texto = "   "+texto + " blancos al final      ";
		System.out.println("Longitud de texto  "+texto.length());
		System.out.println("Quite blancos a ambos lados de texto :"+texto.trim());
		System.out.println("Longitud de texto "+texto.trim().length());
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
}
