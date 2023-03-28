package create;

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
	
	public String construirPagina() {
		String pag=null;
		String route=null;
		String title=null;
		pag+=crearPagina(crearBody(crearTexto("Hola mundo")+crearImagen(route,title)));
		
		return pag;
	}

}
