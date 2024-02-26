package org.parkin.java;

import org.parkin.java.entities.Cliente;
import org.parkin.java.entities.Cupo;
import org.parkin.java.entities.Empleado;
import org.parkin.java.entities.Pago;
import org.parkin.java.entities.TipoVehiculo;
import org.parkin.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola, muchachos");
       
        
        Vehiculo carrito1 = new Vehiculo("ASD 789",
                            TipoVehiculo.PARTICULAR);
        carrito1.placa = "ASD 789";
        carrito1.tipoVehiculo = TipoVehiculo.PARTICULAR;

        Vehiculo carrito2 = new Vehiculo("JHG 432",
                            TipoVehiculo.TAXI);
        carrito2.placa = "JHG 432";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;
        
        System.out.println(carrito1.tipoVehiculo);
        System.out.println(carrito2.tipoVehiculo);
    
        Cliente cliente1 = new Cliente("oscar" , 
                                "peñuela" , 
                        1014477735L); 

        cliente1.nombres= "oscar";
        cliente1.apellidos= "peñuela";
        cliente1.numeroIdentificacion= 1014477135L;
        //invocar el metodo addcar 
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle( "WWW ERT", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculos del cliente
        //del cliente
        

        //instanciar cupos:
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        //crear fechas;
        LocalDateTime fechaHorarioInicio =
         LocalDateTime.of(2024,
                        Month.FEBRUARY,
                        1,
                        15,
                        30, 
                        0);

        LocalDateTime fechaHoraFin = 
                        LocalDateTime.of(2024,
                        Month.FEBRUARY, 
                        10, 
                        6,
                        15, 
                        0);

        //hacer registros(pagos) E/S de vehiculos

        Empleado empleado1 = new Empleado("dairon", "Chapid", "12");

        Pago pago1 = new Pago(fechaHorarioInicio ,
                     fechaHoraFin , 
                     5000.0 , 
                     cliente1.misVehiculos.get(0) , 
                     cupito1, empleado1 );


        Pago pago2 = new Pago(fechaHorarioInicio ,
                    fechaHoraFin ,
                    10000.0 ,
                    cliente1.misVehiculos.get(1) ,
                    cupito2, empleado1);

        //añadir pegos a una lista de pagos
        List<Pago> misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);
        
        //recorrer los pagos para mostrar informacion
        for(Pago p : misPagos){
            //evidencia:
            //mostrar:
            //  - placa del vehiculo
            //  - valor pagado
            //  - fecha y hora de inicio
            //  -fecha y hora de fin
            //  -cupo(nombre)
            System.out.println( "Placa:" + p.vehiculo.placa + "|");
            System.out.println( "Valor:" + p.Valor + "|");
            System.out.println("|fecha y hora de entrada:" + p.fechaHoraInicio.toString() + "|");
            System.out.println("|fecha y hora de salida:" + p.fechaHoraFin.toString() + "|");
            System.out.println("|Cupo:" + p.cupo.nombre + "|");
            System.out.println("|empleados:" + p.empleado.codigo);
        

        }

        

        

    } 

}