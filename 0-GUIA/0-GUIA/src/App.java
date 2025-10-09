import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        //1-
        int numN=10;
        double numA=1.25;
        char numC='m';
        double resultado=numN+numA;
        double resultadoResta=numN-numA;
        int numeroChar=numC;
        System.out.println("Entero vale: "+numN);
        System.out.println("double vale:"+numA);
        System.out.println("char guardado es:"+numC);

        System.out.println("resultado sumatoria:"+resultado);
        System.out.println("resultado resta:"+resultadoResta);
        System.out.println("numero equivalente al char guardado:"+numeroChar);

        System.out.println("\n");

        //2-

        int numX=7;
        int numY=10;

        double numL=2.50;
        double numM=1.05;

        double sumatoria_uno=numX+numL;
        double resta_uno=numX-numL;
        double multiplicacion_uno=numY*numM;
        double division_uno=numY/numM;

        System.out.println("sumatoria int:"+numX+" y double:"+numL+"="+sumatoria_uno);
        System.out.println("resta int:"+numX+" y double:"+numL+"="+resta_uno);

        System.out.println("multiplicacion int:"+numY+" y double:"+numM+"="+multiplicacion_uno);
        System.out.println("division int:"+numY+" y double:"+numM+"="+division_uno);

        System.out.println("\n");

        //3-

        int numeroN=0;
        System.out.println("ingresa un numero:");
        numeroN=teclado.nextInt();
        System.out.println("nuevo numero guardado:"+numeroN);
        numeroN=numeroN+77;
        System.out.println("Valor Actual:"+numeroN);
        numeroN=3;
        System.out.println("Valor Actual:"+numeroN);
        numeroN=numeroN*2;
        System.out.println("Valor Actual:"+numeroN);

        System.out.println("\n");

        //4-

        int A=1;
        int B=2;
        int C=3;
        int D=4;

        System.out.println(" Valor de A:"+A+",B:"+B+",C:"+C+",D:"+D+" ");
        int temp=B;
        B=C;
        C=A;
        A=D;
        D=temp;
        System.out.println(" Valor de A:"+A+",B:"+B+",C:"+C+",D:"+D+" ");

        System.out.println("\n");

        //5-

        int num_A;

        System.out.println("ingresa un valor:");
        num_A=teclado.nextInt();

        if(num_A %2==0){
            System.out.println("El numero es Par.");
        }
        else{
            System.out.println("El numero es Impar");
        }

        System.out.println("\n");

        //6-

        int num_B;
        System.out.println("Ingresa un valor:");
        num_B=teclado.nextInt();

        if(num_B<0){
            System.out.println("El numero es Negativo");
        }
        else if (num_B==0) {
            System.out.println("El numero Es 0");
        }
        else {
            System.out.println("El numero es Positivo");
        }

        System.out.println("\n");

        //7-

        System.out.println("ingresa una palabra");
        char caracter = teclado.next().charAt(0);
        int numeroCaracterASCII=caracter;
        System.out.println("Primera letra de la palabra ingresada:"+caracter+",numero ASCII equivalente="+numeroCaracterASCII+"");

        System.out.println("\n");

        //8-

        int num_C;
        System.out.println("ingrese un valor:");
        num_C=teclado.nextInt();
        System.out.println("numero ingresado es:"+num_C+"");

        /// positivo o negativo.

        if(num_C<0){
            System.out.println("El valor es Negativo.");
        }
        else if (num_C==0) {
            System.out.println("El numero es 0");
        }
        else{
            System.out.println("El valor es Positivo.");
        }
        /// Par o Impar.

        if (num_C %2==0){
            System.out.println("El numero es Par.");
        }
        else{
            System.out.println("El numero es Impar.");
        }
        /// multiplo de 5 y 10.

        if (num_C %5==0 && num_C %10==0){
            System.out.println("El numero es multiplo de 5 y 10");
        } else if (num_C %5==0) {
            System.out.println("El numero es multiplo de 5");
        } else if (num_C %10==0) {
            System.out.println("El numero es multiplo de 10");
        }else{
            System.out.println("El numero no es multiplo de 5 o 10");
        }

        /// mayor o menor a 100.
        if (num_C <100){
            System.out.println("El numero es menor a 100.");
        } else if (num_C==100) {
            System.out.println("El numero es 100.");
        } else {
            System.out.println("El numero es Mayor a 100.");
        }

        System.out.println("\n");

        //9-

        String nombre;
        /// agrego esta linea para consumir el saltode linea pendiente y limpiar buffer.
        teclado.nextLine();
        System.out.println("ingresa un nombre:");
        nombre=teclado.nextLine();

        System.out.println("Buenos dias," + nombre);

        System.out.println("\n");

        //10-

        double radio;
        System.out.println("ingresa el valor del radio de una circunferencia:");
        radio=teclado.nextDouble();

        double longitud=2*Math.PI*radio;
        double area=Math.PI*Math.pow(radio,2);

        System.out.println("Calculo Longitud:"+longitud);
        System.out.println("Calculo Area:"+area);

        System.out.println("\n");

        //11-

        //inicializo en uno para evitar error.
        double velocidad_km=1;

        System.out.println("ingrese la velocidad km/h:");
        velocidad_km=teclado.nextDouble();

        double velocidad_Ms=velocidad_km *1000/3600;

        if(velocidad_km<=0){
            System.out.println("la velocidad debe ser mayor a 0.");
        }
        else{
            System.out.println("velocidad ingresada es:"+velocidad_km+"");
            System.out.println("Pasado a m/s seria:"+velocidad_Ms+"");
        }

        System.out.println("\n");

        //12-

        double catOp;
        double catAdy;

        System.out.println("ingrese el valor del cateto opuesto:");
        catOp=teclado.nextDouble();
        System.out.println("ingresa el valor del cateto adyacente:");
        catAdy=teclado.nextDouble();

        double expOp=Math.pow(catOp,2);
        double expAdy=Math.pow(catAdy,2);

        double hipotenusa=Math.sqrt(expOp+expAdy);
        System.out.println("valor hipotenusa es:"+hipotenusa);

        System.out.println("\n");

        //13-

        double radio_dos;
        System.out.println("ingrese el valor del radio");
        radio_dos=teclado.nextDouble();
        double fraccion=4.0/3.0;
        double volumen=(fraccion*Math.PI)*Math.pow(radio_dos,3);
        System.out.println("Valor del volumen de la esfera es:"+volumen);

        System.out.println("\n");

        //14-

        int n;

        System.out.println("ingresa un numero de 3 digitos entero:");
        n=teclado.nextInt();
        int centenas=n/100;
        int decenas=(n/10) %10;
        int unidades=n % 10;

        if(n <=99){
            System.out.println("numero no valido.");
        }else {
            System.out.println("cifras del numero: "+centenas+"-"+decenas+"-"+unidades+"");
        }

        System.out.println("\n");

        //15-

        //posiciones 1 3 5.

        int n5;

        System.out.println("ingresa un numero de 5 digitos entero:");
        n5=teclado.nextInt();
        int decenasMiles=n5/10000;
        int cent=(n5/100)%10;
        int unid=n5 % 10;

        if(n5 <=9999){
            System.out.println("numero no valido.");
        }else {
            System.out.println("numeros posciones impares "+decenasMiles+"/"+cent+"/"+unid+"");
        }

        System.out.println("\n");

        //16-

        int H;
        int M;
        int S;

        System.out.println("ingrese la hora:");
        H=teclado.nextInt();
        System.out.println("ingrese los minutos:");
        M=teclado.nextInt();
        System.out.println("ingrese los segundos:");
        S=teclado.nextInt();

        if(H>=0 && H<=23 && M>=0 && M<=59 && S>=0 && S<=59){
            System.out.println("La hora es Valida:"+H+":"+M+":"+S+"");
        }else {
            System.out.println("La hora no es Valida");
        }

        System.out.println("\n");

        //17-

        String nombreEmpleado;
        int edadEmpleado;
        float salarioEmpleado;

        teclado.nextLine();
        System.out.println("Ingrese el Nombre:");
        nombreEmpleado=teclado.nextLine();

        System.out.println("Ingrese la Edad:");
        edadEmpleado=teclado.nextInt();

        System.out.println("Ingrese el Salario:");
        salarioEmpleado=teclado.nextFloat();

        /// mostrar salario.

        if (edadEmpleado<16){
            System.out.println("No tiene Edad Suficiente Para trabajar.");
        } else if (edadEmpleado >=19 && edadEmpleado<=50) {
            salarioEmpleado+=salarioEmpleado*0.05;
            System.out.println("salario si posee entre 19 y 50 años de edad:"+salarioEmpleado);
        } else if (edadEmpleado >=51 && edadEmpleado<=60) {
            salarioEmpleado+=salarioEmpleado*0.10;
            System.out.println("salario si posee entre 51 y 60 años de edad:"+salarioEmpleado);
        }else{
            salarioEmpleado+=salarioEmpleado*0.15;
            System.out.println("salario si posee mas de 60 años de edad:"+salarioEmpleado);
        }

        System.out.println("\n");

       //18-

        float altura;
        float peso;
        teclado.nextLine();
        System.out.println("ingrese la altura:");
        altura=teclado.nextFloat();
        System.out.println("ingresa su peso:");
        peso=teclado.nextFloat();
        float masaCorporal=peso/(altura*altura);

        if(masaCorporal >=18.5 && masaCorporal <=24.9){
            System.out.println("Masa corporal:"+masaCorporal+",se encuentra saludable.");
        } else if (masaCorporal >=25 && masaCorporal <=29.9) {
            System.out.println("Masa corporal:"+masaCorporal+",tiene sobrepeso.");
        } else if (masaCorporal >=30){
            System.out.println("Masa corporal:"+masaCorporal+",tiene obesidad.");
        }else{
            System.out.println("masa corporal:"+masaCorporal+",es demasiado baja.");
        }

        System.out.println("\n");

        //19-


        int numZ[]=new int[5];
        int i=0;
        char control='s';
        int op;
        int sumaProm=0;
        double promedio;
        int[] numR = {10, 20, 30, 40, 50};

        System.out.println("1-arreglo cargado,2-arreglo cargado por teclado");
        op=teclado.nextInt();

        if(op==1){
            for (int u = 0; u < 5; u++) {
                sumaProm += numR[u];
            }
            promedio = (double) sumaProm / 5;
            System.out.println("El promedio es: " + promedio);

        }else if (op==2){
            while (i<5 && control=='s'){
                System.out.println("cargue un numero en el arreglo:");
                numZ[i]=teclado.nextInt();
                i++;
                teclado.nextLine();
                if(i<5){
                    System.out.println("continuar s/n");
                    control=teclado.next().charAt(0);
                }
            }

            for (int j=0;j<i;j++){
                System.out.println("arreglo en la posicion: "+j+" = "+numZ[j]+" ");
            }
            for (int j=0;j<i;j++){
                sumaProm+=numZ[j];
            }
            promedio=sumaProm/i;
            System.out.println("promedio="+promedio+"");
        }else {
            System.out.println("numero invalido.");
        }

        System.out.println("\n");

        //20-

        int numT;
        int sumaNatural=0;
        System.out.println("ingresa un numero:");
        numT=teclado.nextInt();

        for (int w=0;w<=numT;w++){
            sumaNatural+=w;
        }
        System.out.println("suma detodos los numeros naturales inclusive el ingresado:"+sumaNatural+"");

        System.out.println("\n");

        //21-

        double[] temperaturas = new double[20];
        char respuesta='s';
        int validos=0;
        double promedioTemperaturas=0;
        double sumaTemperaturas=0;

        while (respuesta=='s' && validos<20){
            System.out.println("cargue una temperatura:");
            temperaturas[validos]=teclado.nextDouble();
            sumaTemperaturas+=temperaturas[validos];
            validos++;


            System.out.println("continuar s/n");
            teclado.nextLine();
            respuesta=teclado.next().charAt(0);
        }
        promedioTemperaturas=sumaTemperaturas/validos;

        double max=temperaturas[0];
        double min=temperaturas[0];

        for (int g = 1; g < validos; g++) {
            if (temperaturas[g] > max) {
                max = temperaturas[g];
            }
            if (temperaturas[g] < min) {
                min = temperaturas[g];
            }
        }

        System.out.println("Temperatura máxima: " + max);
        System.out.println("Temperatura mínima: " + min);
        System.out.println("Promedio: " + promedioTemperaturas);
    }
    
}
