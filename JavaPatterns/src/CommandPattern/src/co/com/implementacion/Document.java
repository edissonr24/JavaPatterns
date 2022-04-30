package CommandPattern.src.co.com.implementacion;

import java.util.ArrayList;

public class Document {

	 private ArrayList<String> _textArray = new ArrayList<String>();
     
     public void Write(String text)
     {
         _textArray.add(text);
     }
     public void Erase(String text)
     {
         _textArray.remove(text);
     }
     public void Erase(int textLevel)
     {
         _textArray.remove(textLevel);
     }

     public String ReadDocument() {
         StringBuilder sb = new StringBuilder();
//         foreach (string text in _textArray)
//             sb.Append(text);
//         return sb.ToString();
         
         for (String text : _textArray)   
        	 sb.append(text);
         return sb.toString();
         
         
     }
	
}
