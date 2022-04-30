package co.com.implementacion;

public class Program {

//	private DocumentInvoker documentInvoker {
//        get {
//            throw new System.NotImplementedException();
//        }
//        set {
//        }
//    }

    public static void main(String[] args) {
        prueba();
    }

    static void prueba() {
    	
    	try {
    		DocumentInvoker instance = new DocumentInvoker();

            instance.Write("0.");
            System.out.println(instance.Read());

            instance.Write(" 1.");
            System.out.println(instance.Read());

            instance.Write(" 2.");
            System.out.println(instance.Read());

            instance.Undo();
            System.out.println(instance.Read());

            instance.Undo();
            System.out.println(instance.Read());

            instance.Undo();
            System.out.println(instance.Read());

            instance.Undo();
            System.out.println(instance.Read());

            instance.Write("3.");
            System.out.println(instance.Read());

            instance.Write("4.");
            System.out.println(instance.Read());

            instance.Undo();
            System.out.println(instance.Read());

            instance.Redo();
            System.out.println(instance.Read());

    	} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
	
}
