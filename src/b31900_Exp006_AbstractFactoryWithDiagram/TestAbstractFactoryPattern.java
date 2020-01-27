package b31900_Exp006_AbstractFactoryWithDiagram;

//Our AbstractProduct

interface Window{
public void setTitle(String text);
public void repaint();
}

//ConcreteProductA1

class MSWindow implements Window{
	
	public MSWindow(){
		System.out.println("MSWidnow Build");
	}
public void setTitle(String text){
  //MS Windows specific behaviour
}
public void repaint(){
  //MS Windows specific behaviour
}
}

//ConcreteProductA2
class MacOSXWindow implements Window{
	
	public MacOSXWindow(){
		System.out.println("MacOSXwindow built");
	}
public void setTitle(String text){
  //Mac OSX specific behaviour
}
public void repaint(){
  //Mac OSX specific behaviour
}
}


//AbstractFactory

interface AbstractWidgetFactory{
public Window createWindow();
}

//ConcreteFactory1
class MsWindowsWidgetFactory  implements AbstractWidgetFactory{
//create an MSWindow
public Window createWindow(){
  MSWindow window = new MSWindow();
  return window;
}
}



//ConcreteFactory2

class MacOSXWidgetFactory implements AbstractWidgetFactory{
//create a MacOSXWindow
public Window createWindow(){
  MacOSXWindow window = new MacOSXWindow();
  return window;
}
}


//Client
class GUIBuilder{

public void buildWindow(AbstractWidgetFactory widgetFactory){

  Window window = widgetFactory.createWindow();

  window.setTitle("New Window");

}

}

public class TestAbstractFactoryPattern {

	public static void main(String[] args) {
		// from: https://dzone.com/articles/design-patterns-abstract-factory
		// change a bit my myself
		
	    GUIBuilder builder = new GUIBuilder();

	    AbstractWidgetFactory widgetFactory = null;

	    //check what platform we're on

	    String Platform="MACOSX";
	    
	    if(Platform.equals("MACOSX")){

	      widgetFactory  = new MacOSXWidgetFactory();

	    } else {

	      widgetFactory  = new MsWindowsWidgetFactory();

	    }

	    builder.buildWindow(widgetFactory);

	  }

}
