package examples;

import br.com.etyllica.Etyllica;
import br.com.etyllica.core.context.Application;

public class TideExamples extends Etyllica {
	private static final long serialVersionUID = 1L;

	public TideExamples() {
		super(640, 480);
	}
	
	public static void main(String[] args){
		TideExamples example = new TideExamples();
		example.init();
	}
	
	@Override
	public Application startApplication() {
		return new MeshNavigationExample(w,h);
	}
}
