package pro.sky.java.ds_3_0.task2;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A6", 2.3f, BodyType.COUPE);
        Car bmw = new Car("BMW", "X3", 1.6f, BodyType.CROSSOVER);
        Car kia = new Car("Kia", "Spectra", 1.8f, BodyType.SEDAN);
        Car opel = new Car("Opel", "Astra", 1.3f, BodyType.HATCHBACK);
        Car car = new Car(null, null, 0f, null);
        DriverB ivanov = new DriverB("Ivanov", 5, opel);

        ivanov.setCategory("C");

        Truck volvo = new Truck("Volvo", "655", 3.2f, LoadCapacity.N1);
        Truck maz = new Truck("MAZ", "64684", 3.0f, LoadCapacity.N2);
        Truck kamaz = new Truck("Kamaz", "3553", 3.4f, LoadCapacity.N3);
        Truck iveco = new Truck("Iveco", "V985", 3.6f, LoadCapacity.N2);
        DriverC leonov = new DriverC("Leonov", 4, kamaz);

        leonov.setCategory("D");

        Bus paz = new Bus("PAZ", "09840", 2.8f, Capacity.SMALL);
        Bus liaz = new Bus("Liaz", "896t5", 3.5f, Capacity.MEDIUM);
        Bus ikarus = new Bus("Ikarus", "8955t", 3.3f, Capacity.LARGE);
        Bus gaz = new Bus("GAZ", "78738", 2.4f, Capacity.EXTRA_SMALL);
        DriverD petrov = new DriverD("Petrov", 6, ikarus);

        petrov.setCategory("B");        //валидно

//        petrov.setCategory(null);       //невалидно - null
//        petrov.setCategory("");         //невалидно - isEmpty
//        petrov.setCategory(" ");        //невалидно - !contains в "BCD"
//        petrov.setCategory("D ");       //невалидно - !contains в "BCD"
//        petrov.setCategory("dsfkuhr");  //невалидно - !contains в "BCD"
        System.out.println("Водитель " + petrov.getFullName() + " имеет права категории " + petrov.getCategory());
        System.out.println();

        diagnostics(
                audi, bmw, kia, opel, car,
                volvo, maz, kamaz, iveco,
                paz, liaz, ikarus, gaz
        );

        System.out.println();


        audi.printType();
        opel.printType();
        car.printType();

        volvo.printType();
        maz.printType();
        kamaz.printType();

        paz.printType();
        liaz.printType();
        ikarus.printType();
        System.out.println();


        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(opel);
//        audi.startMoving();
//        opel.stopMoving();
        System.out.println();

        System.out.println(volvo);
        System.out.println(maz);
        System.out.println(kamaz);
        System.out.println(iveco);
//        maz.startMoving();
//        iveco.stopMoving();
        System.out.println();

        System.out.println(paz);
        System.out.println(liaz);
        System.out.println(ikarus);
        System.out.println(gaz);
//        liaz.startMoving();
//        ikarus.stopMoving();
        System.out.println();


//        audi.pitStop();
//        System.out.printf("Лучшее время круга гонки легковых машин: %s секунд у автомобиля %s %s\n",
//                bmw.getBestLapTime(), bmw.getBrand(), bmw.getModel());
//        System.out.printf("Максиммальная скорость гонки легковых машин: %s км/ч у автомобиля %s %s\n",
//                kia.getMaxSpeed(), kia.getBrand(), kia.getModel());
//        System.out.println();
//
//        volvo.pitStop();
//        System.out.printf("Лучшее время круга гонки грузовых машин: %s секунд у автомобиля %s %s\n",
//                kamaz.getBestLapTime(), kamaz.getBrand(), kamaz.getModel());
//        System.out.printf("Максиммальная скорость гонки грузовых машин: %s км/ч у автомобиля %s %s\n",
//                maz.getMaxSpeed(), maz.getBrand(), maz.getModel());
//        System.out.println();
//
//        paz.pitStop();
//        System.out.printf("Лучшее время круга гонки автобусов: %s секунд у автомобиля %s %s\n",
//                ikarus.getBestLapTime(), ikarus.getBrand(), ikarus.getModel());
//        System.out.printf("Максиммальная скорость гонки автобусов: %s км/ч у автомобиля %s %s\n",
//                gaz.getMaxSpeed(), gaz.getBrand(), gaz.getModel());
//        System.out.println();
//

        System.out.println(ivanov);
        System.out.println(leonov);
        System.out.println(petrov);
    }

//    //Выкидывает сообщение об авто, которые не прошли диагностику
//    private static void diagnostics(Transport... transports) {
//        for (int i = 0; i < transports.length; i++) {
//            if (!transports[i].passDiagnostics()) {
//                try {
//                    throw new RuntimeException("Авто " + transports[i].getBrand() + " " + transports[i].getModel() + " диагностику не прошел");
//                } catch (RuntimeException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }

    //Все машины проверяет на диагностику
    private static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            diagnosticsTransport(transport);
        }
    }

    //Проверка на диагностику каждой отдельной машины (в try обвернуто if и throw, можно только throw)
    private static void diagnosticsTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Авто " + transport.getBrand() + " " + transport.getModel() + " диагностику не прошел");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
