package EtapaFinal;

public class Program {
	
	
	 public static void main(String[] args) {
		 
         Vehiculo vehiculo;

         System.out.println("Veh�culo Medio");
         vehiculo = new VehiculoMedio();
         ProbarFuncionalidad(vehiculo);
         System.out.println("\n");

         System.out.println("Veh�culo Pesado");
         vehiculo = new VehiculoPesado();
         ProbarFuncionalidad(vehiculo);
         System.out.println("\n");

         System.out.println("Veh�culo Ligero");
         vehiculo = new VehiculoLigero();
         ProbarFuncionalidad(vehiculo);
         System.out.println("\n");

         System.out.println("Veh�culo Gama Alta");
         vehiculo = new VehiculoGamaAlta();
         ProbarFuncionalidad(vehiculo);
         System.out.println("\n");


//         Console.ReadLine();

     }
 
     

     /// <summary>
     /// Prueba todos las funcionalidades de un vehiculo
     /// </summary>
     /// <param name="vehiculo"></param>
     static void ProbarFuncionalidad(Vehiculo vehiculo)
     {
         System.out.println(vehiculo.getCantidadDeCombustible());
         System.out.println(vehiculo.getUbicacion().x);
         System.out.println(vehiculo.getUbicacion().y);
         System.out.println(vehiculo.getKilometraje());
         vehiculo.dibujarEnMapa();
         vehiculo.inmovilizarVehiculo();
         vehiculo.bloquearPuertas();
     }

}
