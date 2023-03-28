package create;

public class WrapperPagina implements CrearBody,CrearImagen,CrearPagina,CrearTexto{
	@Override
	public String crearBody(String tag,String s) {
		return "<"+tag+">"+s+"</"+tag+">";
	}
	
	@Override
	public String crearImagen(String tag,String route, String title) {
		return "<"+tag+" src="+route+" alt="+title+">";
	}

	@Override
	public String crearPagina(String tag,String s) {
		return "<"+tag+">"+s+"</"+tag+">";
	}
	

	@Override
	public String crearTexto(String s) {
		return s;
	}
	


}
