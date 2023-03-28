package create;

public class DecoratorPagina extends WrapperPagina{
	
	public String construirPagina() {
		String pag=null;
		String route=null;
		String title=null;
		String tag=null;
		pag+=crearPagina(tag,crearBody(tag,crearTexto("Hola mundo")+crearImagen(tag,route,title)));
		
		return pag;
	}
}
