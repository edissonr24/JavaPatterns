package CommandPattern.src.co.com.implementacion;

import java.util.ArrayList;
import java.util.List;

public class DocumentInvoker {

	private List<CommandApp> _commands = new ArrayList<CommandApp>();
    private Document _doc = new Document();
    private int _nroTexto;

    /// <summary>
    /// Permite devolverse al paso anterior .
    /// </summary>
    public void Undo()
    {
        //Agregue aquí lógica para el undo
    	if (_nroTexto > 0)//Indicador Nro de Texto Adicionado Superior a 0
        {                
            _doc.Erase(_nroTexto);//Borrar el Texto de un Nro de Texto Adicionado
            _nroTexto--;//Decrementar el Nro de Texto Adicionado
        }
    	
        return;
    }

    /// <summary>
    /// permite rehacer el paso de edición devuelto.
    /// </summary>
    public void Redo()
    {
        //Agregue aquí lógica para redo
    	if (_nroTexto < _commands.size()-1)//Indicador Nro de Texto Adicionado Inferior al Nro Total de Textos Adicionados
        {
            _nroTexto++;//Incrementar el Nro de Texto Adicionado
//            _commands.listIterator(_nroTexto).Redo();//Ir al Elemento del Nro de Texto Adicionado y Hacer el Redo  
        }
        return;
    }

    public void Write(String text) {
        CommandApp cmd = new DocumentEditCommand(_doc, text);
        _commands.add(cmd);
        _nroTexto = _commands.size() - 1;
        //talvez necesite agregar algo en esta sección?
    }

    
    public String Read() {
        return _doc.ReadDocument();
    }
	
}
