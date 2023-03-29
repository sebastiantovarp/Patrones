package create;

<<<<<<< HEAD
public class DecoratorPagina extends WrapperPagina{
=======
public class WrapperPagina implements CrearBody,CrearImagen,CrearPagina,CrearTexto{
	@Override
	public String crearBody(String s) {
		return "<body>"+s+"</body>";
	}
	
	@Override
	public String crearImagen(String route, String title) {
		return "<img src="+route+" alt="+title+">";
	}

	@Override
	public String crearPagina(String s) {
		return "<html>"+s+"</html>";
	}
	

	@Override
	public String crearTexto(String s) {
		return s;
	}
>>>>>>> Samuel
	
	public String construirPagina() {
		String pag=null;
		String route=null;
		String title=null;
		String tag=null;
		pag+=crearPagina(tag,crearBody(tag,crearTexto("Hola mundo")+crearImagen(tag,route,title)));
		
		return pag;
	}
}
